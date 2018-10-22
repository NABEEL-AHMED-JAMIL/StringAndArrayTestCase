package com.ballistic.server.pojo.rtb.requestfield;

import com.ballistic.server.pojo.rtb.Ext;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Format {

    private Integer w;
    private Integer h;
    private Integer wratio;
    private Integer hratio;
    private Integer wmin;
    private Ext ext;

    public Format() { }

    public Integer getW() { return w; }
    public void setW(Integer w) { this.w = w; }

    public Integer getH() { return h; }
    public void setH(Integer h) { this.h = h; }

    public Integer getWratio() { return wratio; }
    public void setWratio(Integer wratio) { this.wratio = wratio; }

    public Integer getHratio() { return hratio; }
    public void setHratio(Integer hratio) { this.hratio = hratio; }

    public Integer getWmin() { return wmin; }
    public void setWmin(Integer wmin) { this.wmin = wmin; }

    public Ext getExt() { return ext; }
    public void setExt(Ext ext) { this.ext = ext; }
    
}
