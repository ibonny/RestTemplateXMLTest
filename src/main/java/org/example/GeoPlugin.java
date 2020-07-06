package org.example;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "geoPlugin")
@XmlAccessorType(XmlAccessType.FIELD)
public class GeoPlugin {
    @XmlElement(name = "geoplugin_request")
    private String request;
    @XmlElement(name = "geoplugin_status")
    private int status;
    @XmlElement(name = "geoplugin_delay")
    private String delay;
    @XmlElement(name = "geoplugin_credit")
    private String credit;
    @XmlElement(name = "geoplugin_city")
    private String city;
    @XmlElement(name = "geoplugin_region")
    private String region;
    @XmlElement(name = "geoplugin_regionCode")
    private String regionCode;

    public GeoPlugin() {}

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDelay() {
        return delay;
    }

    public void setDelay(String delay) {
        this.delay = delay;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }
}
