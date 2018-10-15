package com.masterchengzi.newsserver.service;

import com.masterchengzi.newsserver.common.JsonResult;
import com.masterchengzi.newsserver.entity.UserTagScore;

import java.util.List;

public interface UserTagScoreService {
	JsonResult getUserTagScore(String userId);

	JsonResult delete(String userId);

	JsonResult insert(UserTagScore record);

	JsonResult update(UserTagScore record);
}