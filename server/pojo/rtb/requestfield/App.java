package com.ballistic.server.pojo.rtb.requestfield;

import com.ballistic.server.pojo.rtb.Ext;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class App {

    private String id;
    private String name;
    private String bundle;
    private String domain;
    private String storeurl;
    private List<String> cat;
    private List<String> sectioncat;
    private List<String> pagecat;
    private String ver;
    private Integer privacypolicy;
    private Integer paid;
    private Publisher publisher;
    private Content content;
    private String keywords;
    private Ext ext;

    public App() { }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getBundle() { return bundle; }
    public void setBundle(String bundle) { this.bundle = bundle; }

    public String getDomain() { return domain; }
    public void setDomain(String domain) { this.domain = domain; }

    public String getStoreurl() { return storeurl; }
    public void setStoreurl(String storeurl) { this.storeurl = storeurl; }

    public List<String> getCat() { return cat; }
    public void setCat(List<String> cat) { this.cat = cat; }

    public List<String> getSectioncat() { return sectioncat; }
    public void setSectioncat(List<String> sectioncat) { this.sectioncat = sectioncat; }

    public List<String> getPagecat() { return pagecat; }
    public void setPagecat(List<String> pagecat) { this.pagecat = pagecat; }

    public String getVer() { return ver; }
    public void setVer(String ver) { this.ver = ver; }

    public Integer getPrivacypolicy() { return privacypolicy; }
    public void setPrivacypolicy(Integer privacypolicy) { this.privacypolicy = privacypolicy; }

    public Integer getPaid() { return paid; }
    public void setPaid(Integer paid) { this.paid = paid; }

    public Publisher getPublisher() { return publisher; }
    public void setPublisher(Publisher publisher) { this.publisher = publisher; }

    public Content getContent() { return content; }
    public void setContent(Content content) { this.content = content; }

    public String getKeywords() { return keywords; }
    public void setKeywords(String keywords) { this.keywords = keywords; }

    public Ext getExt() { return ext; }
    public void setExt(Ext ext) { this.ext = ext; }

}
