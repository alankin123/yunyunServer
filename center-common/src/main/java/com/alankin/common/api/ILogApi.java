package com.alankin.common.api;

import com.alankin.common.log.LogBusinessEntity;

public interface ILogApi {
	public Long saveBusinessLog(LogBusinessEntity entity);
}
