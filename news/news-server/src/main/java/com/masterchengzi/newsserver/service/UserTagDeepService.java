package com.masterchengzi.newsserver.service;

import com.masterchengzi.newsserver.common.JsonResult;
import com.masterchengzi.newsserver.entity.UserTagDeep;

import java.util.List;

public interface UserTagDeepService {
	JsonResult getUserTagDeep(String userId);

	JsonResult delete(String userId);

	JsonResult insert(UserTagDeep record);

	JsonResult update(UserTagDeep record);
}