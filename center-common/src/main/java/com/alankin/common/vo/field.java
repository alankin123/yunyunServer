package com.alankin.common.vo;

import java.lang.annotation.*;

/**
 *
 *
 * @author lansongtao
 * @Date 2017年4月5日
 * @since 1.0
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface field {
	String value();
}