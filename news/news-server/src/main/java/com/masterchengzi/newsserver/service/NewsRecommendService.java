package com.masterchengzi.newsserver.service;

import com.masterchengzi.newscommon.common.JsonResult;
import com.masterchengzi.newsserver.entity.NewsRecommend;

import java.util.List;

public interface NewsRecommendService {
	JsonResult getNewsRecommend(String userId);

	JsonResult delete(String userId);

	JsonResult insert(NewsRecommend record);

	JsonResult update(NewsRecommend record);
}