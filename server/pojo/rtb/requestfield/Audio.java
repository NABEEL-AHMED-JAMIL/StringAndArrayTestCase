package com.ballistic.server.pojo.rtb.requestfield;

import com.ballistic.server.pojo.rtb.Ext;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Audio {

    private List<String> mimes;
    private Integer minduration;
    private Integer maxduration;
    private List<Integer> protocols;
    private Integer startdelay;
    private Integer sequence;
    private List<Integer> battr;
    private Integer maxextended;
    private Integer minbitrate;
    private Integer maxbitrate;
    private List<Integer> delivery;
    private List<Banner> companionad;
    private List<Integer> api;
    private List<Integer> companiontype;
    private Integer maxseq;
    private Integer feed;
    private Integer stitched;
    private Integer nvol;
    private Ext ext;

    public Audio() { }

    public List<String> getMimes() { return mimes; }
    public void setMimes(List<String> mimes) { this.mimes = mimes; }

    public Integer getMinduration() { return minduration; }
    public void setMinduration(Integer minduration) { this.minduration = minduration; }

    public Integer getMaxduration() { return maxduration; }
    public void setMaxduration(Integer maxduration) { this.maxduration = maxduration; }

    public List<Integer> getProtocols() { return protocols; }
    public void setProtocols(List<Integer> protocols) { this.protocols = protocols; }

    public Integer getStartdelay() { return startdelay; }
    public void setStartdelay(Integer startdelay) { this.startdelay = startdelay; }

    public Integer getSequence() { return sequence; }
    public void setSequence(Integer sequence) { this.sequence = sequence; }

    public List<Integer> getBattr() { return battr; }
    public void setBattr(List<Integer> battr) { this.battr = battr; }

    public Integer getMaxextended() { return maxextended; }
    public void setMaxextended(Integer maxextended) { this.maxextended = maxextended; }

    public Integer getMinbitrate() { return minbitrate; }
    public void setMinbitrate(Integer minbitrate) { this.minbitrate = minbitrate; }

    public Integer getMaxbitrate() { return maxbitrate; }
    public void setMaxbitrate(Integer maxbitrate) { this.maxbitrate = maxbitrate; }

    public List<Integer> getDelivery() { return delivery; }
    public void setDelivery(List<Integer> delivery) { this.delivery = delivery; }

    public List<Banner> getCompanionad() { return companionad; }
    public void setCompanionad(List<Banner> companionad) { this.companionad = companionad; }

    public List<Integer> getApi() { return api; }
    public void setApi(List<Integer> api) { this.api = api; }

    public List<Integer> getCompaniontype() { return companiontype; }
    public void setCompaniontype(List<Integer> companiontype) { this.companiontype = companiontype; }

    public Integer getMaxseq() { return maxseq; }
    public void setMaxseq(Integer maxseq) { this.maxseq = maxseq; }

    public Integer getFeed() { return feed; }
    public void setFeed(Integer feed) { this.feed = feed; }

    public Integer getStitched() { return stitched; }
    public void setStitched(Integer stitched) { this.stitched = stitched; }

    public Integer getNvol() { return nvol; }
    public void setNvol(Integer nvol) { this.nvol = nvol; }

    public Ext getExt() { return ext; }
    public void setExt(Ext ext) { this.ext = ext; }

}
