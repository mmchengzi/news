package com.masterchengzi.newsserver.entity;

import java.util.Date;
import lombok.Data;

@Data
public class User {
    private String userId;

    private String phone;

    private String name;

    private String passwd;

    private Date time;
}