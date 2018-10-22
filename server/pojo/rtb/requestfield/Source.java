package com.ballistic.server.pojo.rtb.requestfield;

import com.ballistic.server.pojo.rtb.Ext;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Source {

    private Integer fd;
    private String tid;
    private String pchain;
    private Ext ext;

    public Source() { }

    public Integer getFd() { return fd; }
    public void setFd(Integer fd) { this.fd = fd; }

    public String getTid() { return tid; }
    public void setTid(String tid) { this.tid = tid; }

    public String getPchain() { return pchain; }
    public void setPchain(String pchain) { this.pchain = pchain; }

    public Ext getExt() { return ext; }
    public void setExt(Ext ext) { this.ext = ext; }

}
