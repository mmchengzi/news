package com.masterchengzi.newsserver.service;

import com.masterchengzi.newsserver.common.JsonResult;
import com.masterchengzi.newsserver.entity.UserMess;

import java.util.List;

public interface UserMessService {
	JsonResult getUserMess(String userId);

	JsonResult delete(String userId);

	JsonResult insert(UserMess record);

	JsonResult update(UserMess record);
}