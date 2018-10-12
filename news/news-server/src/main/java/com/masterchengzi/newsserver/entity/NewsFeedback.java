package com.masterchengzi.newsserver.entity;

import java.util.Date;
import lombok.Data;

@Data
public class NewsFeedback {
    private String userId;

    private String feedback;

    private Date gettime;

    private String reply;

    private Date replytime;

    private Integer isreply;
}