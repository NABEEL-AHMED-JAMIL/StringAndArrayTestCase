package com.ballistic.server.pojo.rtb.requestfield;

import com.ballistic.server.pojo.rtb.Ext;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Regs {

    private Integer coppa;
    private Ext ext;

    public Regs() { }

    public Integer getCoppa() { return coppa; }
    public void setCoppa(Integer coppa) { this.coppa = coppa; }

    public Ext getExt() { return ext; }
    public void setExt(Ext ext) { this.ext = ext; }

}
