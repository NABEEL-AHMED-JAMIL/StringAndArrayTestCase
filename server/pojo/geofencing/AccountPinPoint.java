package com.ballistic.server.pojo.geofencing;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "pinpoint")
public class AccountPinPoint {

    private String id;
    private String country;
    private String latitude;
    private String longitude;
    private String city;
    private String category; // town
    private String code; // country-code

    public AccountPinPoint() { }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

    public String getLatitude() { return latitude; }
    public void setLatitude(String latitude) { this.latitude = latitude; }

    public String getLongitude() { return longitude; }
    public void setLongitude(String longitude) { this.longitude = longitude; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    @Override
    public String toString() {
        return "AccountPinPoint{" + "id='" + id + '\'' + ", country='" + country + '\'' + ", latitude='" + latitude + '\'' + ", longitude='" + longitude + '\'' + ", city='" + city + '\'' + ", category='" + category + '\'' + ", code='" + code + '\'' + '}';
    }
}
