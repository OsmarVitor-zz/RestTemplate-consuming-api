package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StateInfo {

  @JsonProperty("area_km2")
  private String area;

  @JsonProperty("codigo_ibge")
  private String ibgeCodeState;

  @JsonProperty("nome")
  private String name;

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public String getIbgeCode() {
    return ibgeCodeState;
  }

  public void setIbgeCode(String ibgeCode) {
    this.ibgeCodeState = ibgeCode;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "StateInfo [area=" + area + ", ibgeCode=" + ibgeCodeState + ", name=" + name + "]";
  }

}
