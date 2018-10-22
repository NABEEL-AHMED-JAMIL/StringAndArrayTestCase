package com.ballistic.server.pojo.rtb.requestfield;

import com.ballistic.server.pojo.rtb.Ext;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Native {

    private String request;
    private String ver;
    private List<Integer> api;
    private List<Integer> battr;
    private Ext ext;

    public Native() { }

    public String getRequest() { return request; }
    public void setRequest(String request) { this.request = request; }

    public String getVer() { return ver; }
    public void setVer(String ver) { this.ver = ver; }

    public List<Integer> getApi() { return api; }
    public void setApi(List<Integer> api) { this.api = api; }

    public List<Integer> getBattr() { return battr; }
    public void setBattr(List<Integer> battr) { this.battr = battr; }

    public Ext getExt() { return ext; }
    public void setExt(Ext ext) { this.ext = ext; }
}
