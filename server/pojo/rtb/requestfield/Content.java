package com.ballistic.server.pojo.rtb.requestfield;

import com.ballistic.server.pojo.rtb.Ext;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Content {

    private String id;
    private Integer episode;
    private String title;
    private String series;
    private String season;
    private String artist;
    private String genre;
    private String album;
    private String isrc;
    private Producer producer;
    private String url;
    private List<String> cat;
    private Integer prodq;
    private Integer videoquality;
    private Integer context;
    private String contentrating;
    private String userrating;
    private Integer qagmediarating;
    private String keywords;
    private Integer liverstream;
    private Integer sourcerelationship;
    private Integer len;
    private String language;
    private Integer embeddable;
    private List<Data> data;
    private Ext ext;

    public Content() { }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Integer getEpisode() { return episode; }
    public void setEpisode(Integer episode) { this.episode = episode; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getSeries() { return series; }
    public void setSeries(String series) { this.series = series; }

    public String getSeason() { return season; }
    public void setSeason(String season) { this.season = season; }

    public String getArtist() { return artist; }
    public void setArtist(String artist) { this.artist = artist; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    public String getAlbum() { return album; }
    public void setAlbum(String album) { this.album = album; }

    public String getIsrc() { return isrc; }
    public void setIsrc(String isrc) { this.isrc = isrc; }

    public Producer getProducer() { return producer; }
    public void setProducer(Producer producer) { this.producer = producer; }

    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }

    public List<String> getCat() { return cat; }
    public void setCat(List<String> cat) { this.cat = cat; }

    public Integer getProdq() { return prodq; }
    public void setProdq(Integer prodq) { this.prodq = prodq; }

    public Integer getVideoquality() { return videoquality; }
    public void setVideoquality(Integer videoquality) { this.videoquality = videoquality; }

    public Integer getContext() { return context; }
    public void setContext(Integer context) { this.context = context; }

    public String getContentrating() { return contentrating; }
    public void setContentrating(String contentrating) { this.contentrating = contentrating; }

    public String getUserrating() { return userrating; }
    public void setUserrating(String userrating) { this.userrating = userrating; }

    public Integer getQagmediarating() { return qagmediarating; }
    public void setQagmediarating(Integer qagmediarating) { this.qagmediarating = qagmediarating; }

    public String getKeywords() { return keywords; }
    public void setKeywords(String keywords) { this.keywords = keywords; }

    public Integer getLiverstream() { return liverstream; }
    public void setLiverstream(Integer liverstream) { this.liverstream = liverstream; }

    public Integer getSourcerelationship() { return sourcerelationship; }
    public void setSourcerelationship(Integer sourcerelationship) { this.sourcerelationship = sourcerelationship; }

    public Integer getLen() { return len; }
    public void setLen(Integer len) { this.len = len; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    public Integer getEmbeddable() { return embeddable; }
    public void setEmbeddable(Integer embeddable) { this.embeddable = embeddable; }

    public List<Data> getData() { return data; }
    public void setData(List<Data> data) { this.data = data; }

    public Ext getExt() { return ext; }
    public void setExt(Ext ext) { this.ext = ext; }


}
