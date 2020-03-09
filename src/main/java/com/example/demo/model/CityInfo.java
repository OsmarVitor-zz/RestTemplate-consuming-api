package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CityInfo {
    
    @JsonProperty("area_km2")
    private String area;
    
    @JsonProperty("codigo_ibge")
    private String ibgeCodeCity;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getIbgeCode() {
        return ibgeCodeCity;
    }

    public void setIbgeCode(String ibgeCode) {
        this.ibgeCodeCity = ibgeCode;
    }

    @Override
    public String toString() {
      return "CityInfo [area=" + area + ", ibgeCode=" + ibgeCodeCity + "]";
    }
    
}
