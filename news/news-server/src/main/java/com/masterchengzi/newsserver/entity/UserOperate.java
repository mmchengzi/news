package com.masterchengzi.newsserver.entity;

import java.util.Date;
import lombok.Data;

@Data
public class UserOperate {
    private String userId;

    private String newsId;

    private String comment;

    private Date time;

    private Integer isLove;
}