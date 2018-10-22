package com.ballistic.server.pojo.rtb.requestfield;

import com.ballistic.server.pojo.rtb.Ext;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.text.Format;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Banner {

    private String id;
    private List<Format> format;
    private Integer w;
    private Integer h;
    private Integer wmax;
    private Integer hmax;
    private Integer wmin;
    private Integer hmin;
    private List<Integer> btype;
    private List<Integer> battr;
    private Integer pos;
    private List<String> mimes;
    private Integer topframe;
    private List<Integer> expdir;
    private List<Integer> api;
    private Integer vcm;
    private Ext ext;

    public Banner() { }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public List<Format> getFormat() { return format; }
    public void setFormat(List<Format> format) { this.format = format; }

    public Integer getW() { return w; }
    public void setW(Integer w) { this.w = w; }

    public Integer getH() { return h; }
    public void setH(Integer h) { this.h = h; }

    public Integer getWmax() { return wmax; }
    public void setWmax(Integer wmax) { this.wmax = wmax; }

    public Integer getHmax() { return hmax; }
    public void setHmax(Integer hmax) { this.hmax = hmax; }

    public Integer getWmin() { return wmin; }
    public void setWmin(Integer wmin) { this.wmin = wmin; }

    public Integer getHmin() { return hmin; }
    public void setHmin(Integer hmin) { this.hmin = hmin; }

    public List<Integer> getBtype() { return btype; }
    public void setBtype(List<Integer> btype) { this.btype = btype; }

    public List<Integer> getBattr() { return battr; }
    public void setBattr(List<Integer> battr) { this.battr = battr; }

    public Integer getPos() { return pos; }
    public void setPos(Integer pos) { this.pos = pos; }

    public List<String> getMimes() { return mimes; }
    public void setMimes(List<String> mimes) { this.mimes = mimes; }

    public Integer getTopframe() { return topframe; }
    public void setTopframe(Integer topframe) { this.topframe = topframe; }

    public List<Integer> getExpdir() { return expdir; }
    public void setExpdir(List<Integer> expdir) { this.expdir = expdir; }

    public List<Integer> getApi() { return api; }
    public void setApi(List<Integer> api) { this.api = api; }

    public Integer getVcm() { return vcm; }
    public void setVcm(Integer vcm) { this.vcm = vcm; }

    public Ext getExt() { return ext; }
    public void setExt(Ext ext) { this.ext = ext; }

}
