package com.example.CarRent.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Car {

@SerializedName("id")
@Expose
private Integer id;
@SerializedName("brand")
@Expose
private String brand;
@SerializedName("model")
@Expose
private String model;
@SerializedName("avgConsumption")
@Expose
private Double avgConsumption;
@SerializedName("power")
@Expose
private Double power;
@SerializedName("carImage")
@Expose
private String carImage;

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public String getBrand() {
return brand;
}

public void setBrand(String brand) {
this.brand = brand;
}

public String getModel() {
return model;
}

public void setModel(String model) {
this.model = model;
}

public Double getAvgConsumption() {
return avgConsumption;
}

public void setAvgConsumption(Double avgConsumption) {
this.avgConsumption = avgConsumption;
}

public Double getPower() {
return power;
}

public void setPower(Double power) {
this.power = power;
}

public String getCarImage() {
return carImage;
}

public void setCarImage(String carImage) {
this.carImage = carImage;
}

}