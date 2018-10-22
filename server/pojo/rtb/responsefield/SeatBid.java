package com.ballistic.server.pojo.rtb.responsefield;

import com.ballistic.server.pojo.rtb.Ext;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SeatBid {

    private List<Bid> bid;
    private String seat;
    private String group;
    private Ext ext;

    public SeatBid() { }

    public List<Bid> getBid() { return bid; }
    public void setBid(List<Bid> bid) { this.bid = bid; }

    public String getSeat() { return seat; }
    public void setSeat(String seat) { this.seat = seat; }

    public String getGroup() { return group; }
    public void setGroup(String group) { this.group = group; }

    public Ext getExt() { return ext; }
    public void setExt(Ext ext) { this.ext = ext; }

}
