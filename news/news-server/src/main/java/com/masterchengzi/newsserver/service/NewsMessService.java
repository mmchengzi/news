package com.masterchengzi.newsserver.service;

import com.masterchengzi.newsserver.common.JsonResult;
import com.masterchengzi.newsserver.entity.NewsMess;

import java.util.List;

public interface NewsMessService {
	JsonResult getNewsMess(String newsId, String tag);

	JsonResult delete(String newsId);

	JsonResult insert(NewsMess record);

	JsonResult update(NewsMess record);
}