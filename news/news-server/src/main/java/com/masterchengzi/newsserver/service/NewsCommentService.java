package com.masterchengzi.newsserver.service;

import com.masterchengzi.newscommon.common.JsonResult;
import com.masterchengzi.newsserver.entity.NewsComment;

import java.util.List;

public interface NewsCommentService {
    JsonResult getNewsComment(String newsId);

    JsonResult delete(String newsId);

    JsonResult insert(NewsComment record);

    JsonResult update(NewsComment record);
}