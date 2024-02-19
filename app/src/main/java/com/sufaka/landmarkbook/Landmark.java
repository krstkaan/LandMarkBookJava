package com.sufaka.landmarkbook;

import java.io.Serializable;

public class Landmark implements Serializable {

    String date;
    String Country;
    int image;

    public  Landmark(String date, String country, int image){
        this.date = date;
        this.Country = country;
        this.image = image;
    }
}
