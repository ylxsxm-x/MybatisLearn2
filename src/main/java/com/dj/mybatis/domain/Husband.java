package com.dj.mybatis.domain;

import lombok.Data;

@Data
public class Husband {
    private Integer id;
    private String name;
    private  Integer w_id;
    private Wife wife;
}
