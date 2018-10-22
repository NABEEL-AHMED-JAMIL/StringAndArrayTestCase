package com.ballistic.server.pojo.rtb.requestfield;

import com.ballistic.server.pojo.rtb.Ext;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Imp {

    private String id;
    private List<Metric> metric;
    private Banner banner;
    private Video video;
    private Audio audio;
    @JsonProperty("native")
    private Native _native;
    private Pmp pmp;
    private String displaymanager;
    private String displaymanagerver;
    private Integer instl;
    private String tagid;
    private Float bidfloor;
    private String bidfloorcur;
    private Integer clickbrowser;
    private Integer secure;
    private List<String> iframebuster;
    private Integer exp;
    private Ext ext;

    public Imp() { }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public List<Metric> getMetric() { return metric; }
    public void setMetric(List<Metric> metric) { this.metric = metric; }

    public Banner getBanner() { return banner; }
    public void setBanner(Banner banner) { this.banner = banner; }

    public Video getVideo() { return video; }
    public void setVideo(Video video) { this.video = video; }

    public Audio getAudio() { return audio; }
    public void setAudio(Audio audio) { this.audio = audio; }

    public Native get_native() { return _native; }
    public void set_native(Native _native) { this._native = _native; }

    public Pmp getPmp() { return pmp; }
    public void setPmp(Pmp pmp) { this.pmp = pmp; }

    public String getDisplaymanager() { return displaymanager; }
    public void setDisplaymanager(String displaymanager) { this.displaymanager = displaymanager; }

    public String getDisplaymanagerver() { return displaymanagerver; }
    public void setDisplaymanagerver(String displaymanagerver) { this.displaymanagerver = displaymanagerver; }

    public Integer getInstl() { return instl; }
    public void setInstl(Integer instl) { this.instl = instl; }

    public String getTagid() { return tagid; }
    public void setTagid(String tagid) { this.tagid = tagid; }

    public Float getBidfloor() { return bidfloor; }
    public void setBidfloor(Float bidfloor) { this.bidfloor = bidfloor; }

    public String getBidfloorcur() { return bidfloorcur; }
    public void setBidfloorcur(String bidfloorcur) { this.bidfloorcur = bidfloorcur; }

    public Integer getClickbrowser() { return clickbrowser; }
    public void setClickbrowser(Integer clickbrowser) { this.clickbrowser = clickbrowser; }

    public Integer getSecure() { return secure; }
    public void setSecure(Integer secure) { this.secure = secure; }

    public List<String> getIframebuster() { return iframebuster; }
    public void setIframebuster(List<String> iframebuster) { this.iframebuster = iframebuster; }

    public Integer getExp() { return exp; }
    public void setExp(Integer exp) { this.exp = exp; }

    public Ext getExt() { return ext; }
    public void setExt(Ext ext) { this.ext = ext; }

}
