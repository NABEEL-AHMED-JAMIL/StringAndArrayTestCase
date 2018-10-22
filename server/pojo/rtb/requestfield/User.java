package com.ballistic.server.pojo.rtb.requestfield;

import com.ballistic.server.pojo.rtb.Ext;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {

    private String id;
    private String buyeruid;
    private Integer youb;
    private String gender;
    private String keywords;
    private String customdata;
    private Geo geo;
    private List<Data> data;
    private Ext ext;

    public User() { }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getBuyeruid() { return buyeruid; }
    public void setBuyeruid(String buyeruid) { this.buyeruid = buyeruid; }

    public Integer getYoub() { return youb; }
    public void setYoub(Integer youb) { this.youb = youb; }

    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }

    public String getKeywords() { return keywords; }
    public void setKeywords(String keywords) { this.keywords = keywords; }

    public String getCustomdata() { return customdata; }
    public void setCustomdata(String customdata) { this.customdata = customdata; }

    public Geo getGeo() { return geo; }
    public void setGeo(Geo geo) { this.geo = geo; }

    public List<Data> getData() { return data; }
    public void setData(List<Data> data) { this.data = data; }

    public Ext getExt() { return ext; }
    public void setExt(Ext ext) { this.ext = ext; }

}
