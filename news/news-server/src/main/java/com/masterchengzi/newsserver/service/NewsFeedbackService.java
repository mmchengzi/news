package com.masterchengzi.newsserver.service;

import com.masterchengzi.newsserver.common.JsonResult;
import com.masterchengzi.newsserver.entity.NewsFeedback;

import java.util.Date;
import java.util.List;

public interface NewsFeedbackService {

	JsonResult getNewsFeedback(String userId, Date gettime);

	JsonResult delete(String userid);

	JsonResult insert(NewsFeedback record);

	JsonResult update(NewsFeedback record);
}