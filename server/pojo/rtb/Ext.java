package com.ballistic.server.pojo.rtb;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Ext {
    private String key;
    private Object value;


}
