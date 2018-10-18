package com.masterchengzi.newsserver.service;

import com.masterchengzi.newscommon.common.JsonResult;
import com.masterchengzi.newsserver.entity.UserOperate;

import java.util.List;

public interface UserOperateService {
	JsonResult getUserOperate(String userId, String newsId);

	JsonResult delete(String userId, String newsId);

	JsonResult insert(UserOperate record);

	JsonResult update(UserOperate record);
}