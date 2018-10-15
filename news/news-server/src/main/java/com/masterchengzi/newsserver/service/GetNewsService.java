package com.masterchengzi.newsserver.service;

import com.masterchengzi.newsserver.common.JsonResult;
import com.masterchengzi.newsserver.entity.GetNewsWithBLOBs;

import java.util.Date;
import java.util.List;

public interface GetNewsService {
	JsonResult getGetNews(String newsId, String title, String keyword, String tag, int isOld, Date beginDate, Date endDate);
	JsonResult getPageNews(String newsId, String title, String keyword, String tag, int isOld, Date beginDate, Date endDate,int pageNum, int pageSize);

	JsonResult delete(String newsId);

	JsonResult insert(List<GetNewsWithBLOBs> record);
	JsonResult update(List<GetNewsWithBLOBs> record);
}