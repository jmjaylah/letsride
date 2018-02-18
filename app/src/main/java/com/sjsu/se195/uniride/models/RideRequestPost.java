package com.sjsu.se195.uniride.models;

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by akshat on 10/5/17.
 */

public class RideRequestPost extends Post {
    private LatLng pickuppoint;

    public RideRequestPost(){}

    //Constructer
    public RideRequestPost(String uid, String author, String source, String destination){
        super(uid, author, source, destination);
    }

    public RideRequestPost(LatLng point){
        this.pickuppoint = point;
    }

    public Map<String, Object> toMap_pickupPoint(){
        HashMap<String, Object> result = new HashMap<>();
        result.put("latitude", pickuppoint.latitude);
        result.put("longitude", pickuppoint.longitude);
        return result;
    }

    public Map<String, Object> toMap(){
        HashMap<String, Object> result = new HashMap<>();
        result.put("uid", uid);
        result.put("author", author);
        result.put("source", source);
        result.put("destination", destination);
        result.put("starCount", starCount);
        result.put("stars", stars);
        return result;
    }
}