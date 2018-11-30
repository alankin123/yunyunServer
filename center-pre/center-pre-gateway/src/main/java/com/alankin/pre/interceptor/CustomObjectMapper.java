package com.alankin.pre.interceptor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.alankin.common.utils.DateUtilSafe;
import org.springframework.stereotype.Component;

@Component("customObjectMapper")
public class CustomObjectMapper extends ObjectMapper {

	private static final long serialVersionUID = 1L;

	public CustomObjectMapper() {
		this.setDateFormat(DateUtilSafe.getSdf(DateUtilSafe.dtLong));
//		this.setSerializationInclusion(Include.NON_NULL);
//		this.setSerializationInclusion(Include.NON_EMPTY);
	}

}
