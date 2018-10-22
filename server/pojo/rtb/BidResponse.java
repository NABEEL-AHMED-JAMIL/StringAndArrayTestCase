package com.ballistic.server.pojo.rtb;

import com.ballistic.server.pojo.rtb.responsefield.SeatBid;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BidResponse {

    private String id;
    private List<SeatBid> seatbid;
    private String bidid;
    private String cur;
    private String customdata;
    private Integer nbr;
    private Ext ext;

    public BidResponse() { }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public List<SeatBid> getSeatbid() { return seatbid; }
    public void setSeatbid(List<SeatBid> seatbid) { this.seatbid = seatbid; }

    public String getBidid() { return bidid; }
    public void setBidid(String bidid) { this.bidid = bidid; }

    public String getCur() { return cur; }
    public void setCur(String cur) { this.cur = cur; }

    public String getCustomdata() { return customdata; }
    public void setCustomdata(String customdata) { this.customdata = customdata; }

    public Integer getNbr() { return nbr; }
    public void setNbr(Integer nbr) { this.nbr = nbr; }

    public Ext getExt() { return ext; }
    public void setExt(Ext ext) { this.ext = ext; }

}
