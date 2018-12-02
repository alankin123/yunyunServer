package com.alankin.service;

import com.alankin.IUserRouteService;
import com.alankin.common.vo.BaseRespVO;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by alankin on 2018/12/2.
 */

@Service
public class routeUserService implements IUserRouteService {
    @Override
    public BaseRespVO webProcess(String mode, String service, String method, Map reqMap) {
        return null;
    }
}
