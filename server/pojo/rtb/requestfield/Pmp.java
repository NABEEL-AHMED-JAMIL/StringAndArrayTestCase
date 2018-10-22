package com.ballistic.server.pojo.rtb.requestfield;

import com.ballistic.server.pojo.rtb.Ext;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Pmp {

    private Integer private_auction;
    private List<Deal> deals;
    private Ext ext;

    public Pmp() { }

    public Integer getPrivate_auction() { return private_auction; }
    public void setPrivate_auction(Integer private_auction) { this.private_auction = private_auction; }

    public List<Deal> getDeals() { return deals; }
    public void setDeals(List<Deal> deals) { this.deals = deals; }

    public Ext getExt() { return ext; }
    public void setExt(Ext ext) { this.ext = ext; }

}
