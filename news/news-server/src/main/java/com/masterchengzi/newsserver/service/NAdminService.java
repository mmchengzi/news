package com.masterchengzi.newsserver.service;

import com.masterchengzi.newsserver.common.JsonResult;
import com.masterchengzi.newsserver.entity.NAdmin;

import java.util.List;

public interface NAdminService {

    JsonResult getNAdmin(Integer id, String name);

    JsonResult delete(Integer id);

    JsonResult insert(NAdmin record);

    JsonResult update(NAdmin record);
}