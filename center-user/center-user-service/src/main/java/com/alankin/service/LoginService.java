package com.alankin.service;

import com.alankin.ILoginService;
import com.alankin.bo.UserAuthBO;
import com.alankin.common.entity.SessionUser;
import com.alankin.common.service.BaseService;
import com.alankin.common.utils.StringUtils;
import com.alankin.common.vo.BaseRespVO;
import com.alankin.entity.UserAuthEntity;
import com.alankin.vo.AuthCheckVo;
import com.alankin.vo.LoginRespVo;
import org.apache.ibatis.exceptions.TooManyResultsException;
import org.mybatis.spring.MyBatisSystemException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.support.atomic.RedisAtomicLong;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * 业务处理.
 * <p>
 *
 * @author lansongtao
 * @Date 2017-04-12 14:08:41
 * @since 1.0
 */
@Service
@SuppressWarnings("rawtypes")
public class LoginService extends BaseService implements ILoginService {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserAuthBO userBO;

    @Autowired
    RedisTemplate<String, RedisAtomicLong> redisTemplate;

//    http://192.168.235.130:8082/login/login?loginName=&password=123

    /**
     * @return
     */
    @Override
    public LoginRespVo login(Map reqMap) {

        String loginName = reqMap.get("loginName") + "";
        String password = reqMap.get("password") + "";

        // 设置查询条件
        UserAuthEntity user = new UserAuthEntity();
        // 用户名密码登录
        user.setIdentityType(3);
        user.setIdentifier(password);
        // 根据用户名密码查询用户记录
        try {
            user = userBO.queryByEntity(user);
        } catch (final MyBatisSystemException e) {
            if (e.getCause().getClass() == TooManyResultsException.class) {
                return new LoginRespVo(99, "登录时找到多个用户信息，请确认用户数据是否正确。");
            }
            throw e;
        }

        // 没查询到用户
        if (user == null) {
            return new LoginRespVo(99, "账户错误");
        }

        // 校验通过
        // 登录成功处理
//            loginSuccess(user);

        // 组装返回信息
        LoginRespVo resp = new LoginRespVo();
        resp.setLoginUser(user);
        resp.setSessionUser(parseSessionUser(user));
        return resp;
    }

    private SessionUser parseSessionUser(UserAuthEntity user) {
        SessionUser sessionUser = new SessionUser();
        BeanUtils.copyProperties(user, sessionUser);
        sessionUser.setUserId(user.getId());
        return sessionUser;
    }

    /**
     * 登录成功处理
     */
    private void loginSuccess(UserAuthEntity user) {
        // 设置最后登录时间
        UserAuthEntity updateEntity = new UserAuthEntity();
        updateEntity.setUpdateTime(new Date().getTime());
        updateEntity.setId(user.getId());
        userBO.update(updateEntity);
    }
}
