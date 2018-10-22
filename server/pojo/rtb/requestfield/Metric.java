package com.ballistic.server.pojo.rtb.requestfield;

import com.ballistic.server.pojo.rtb.Ext;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Metric {

    private String type;
    private Float value;
    private String vendor;
    private Ext ext;

    public Metric() { }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public Float getValue() { return value; }
    public void setValue(Float value) { this.value = value; }

    public String getVendor() { return vendor; }
    public void setVendor(String vendor) { this.vendor = vendor; }

    public Ext getExt() { return ext; }
    public void setExt(Ext ext) { this.ext = ext; }

}
