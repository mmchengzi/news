package com.masterchengzi.newsserver.service;

import com.masterchengzi.newscommon.common.JsonResult;
import com.masterchengzi.newsserver.entity.UserLoveTag;

import java.util.List;

public interface UserLoveTagService {
	JsonResult getUserLoveTag(String userId);

	JsonResult delete(String userId);

	JsonResult insert(UserLoveTag record);

	JsonResult update(UserLoveTag record);
}