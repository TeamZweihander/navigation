package com.zweihander.navup.navigation.domain;

/**
 * Created by henry wandera on 2017/05/06.
 */

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

import org.hibernate.annotations.ColumnTransformer;

public class POI {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique=true, nullable=false)
    protected Long id;

    @Column(name="username", unique = true, length = 50, nullable=false)
    public String username;

    @Column(name="longitude", length = 50, nullable=false)
    public double longitude;

    @Column(name="latitude", length = 50, nullable=false)
    public double latitude;



    public String getUsername(){
        return this.username;
    }
    public void setUsername(String user_){
        this.username = user_;
    }

    public double getLatitude(){
        return this.latitude;
    }
    public void setLatitude(double lat_){
        this.latitude = lat_;
    }

    public double getLongitude(){
        return this.longitude;
    }
    public void setLongitude(double long_){
        this.longitude = long_;
    }
}
