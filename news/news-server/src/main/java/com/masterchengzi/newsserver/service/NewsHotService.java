package com.masterchengzi.newsserver.service;

import com.masterchengzi.newscommon.common.JsonResult;
import com.masterchengzi.newsserver.entity.NewsHot;

import java.util.Date;
import java.util.List;

public interface NewsHotService {
	JsonResult getNewsHot(String newsId, Date BeginDate, Date EndDate, String title, String tag);

}