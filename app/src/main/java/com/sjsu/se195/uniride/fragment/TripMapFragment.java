package com.sjsu.se195.uniride.fragment;

import android.Manifest;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.sjsu.se195.uniride.NewPostActivity;
import com.sjsu.se195.uniride.R;

/**
 * Created by timhdavis on 5/18/18.
 */

public class TripMapFragment extends Fragment implements OnMapReadyCallback {

    //    private static final int ERROR_DIALOG_REQUEST = 9001;
//    public boolean mLocationPermissionGranted = false;
//    public final int PERMISSIONS_REQUEST_ENABLE_GPS = 9003;
//    public final int PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION = 9002;
//    GoogleMap mMap;
//   LocationRequest mLocationRequest;
//    private FusedLocationProviderClient mFusedLocationClient;
//    LocationCallback mLocationCallback;
    @Override
    public void onMapReady(GoogleMap googleMap) {
//        mMap = googleMap;
//
//        mLocationRequest = new LocationRequest();
//        mLocationRequest.setInterval(1000);
//        mLocationRequest.setFastestInterval(1000);
//        mLocationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);
//
//        if(android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
//            if(ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED){
//
//            }else{
//                checkLocationPermission();
//            }
//        }
//
//        mFusedLocationClient.requestLocationUpdates(mLocationRequest, mLocationCallback, Looper.myLooper());
//        mMap.setMyLocationEnabled(true);



        googleMap.addMarker(new MarkerOptions()
                .position(new LatLng(0, 0))
                .title("Marker"));




    }




    //Starting MAp activity






    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // TODO...

    }
//
//    private void checkLocationPermission() {
//        if(ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED){
//            if (ActivityCompat.shouldShowRequestPermissionRationale(this, android.Manifest.permission.ACCESS_FINE_LOCATION)) {
//                new android.app.AlertDialog.Builder(this)
//                        .setTitle("give permission")
//                        .setMessage("give permission message")
//                        .setPositiveButton("OK", new DialogInterface.OnClickListener() {
//                            @Override
//                            public void onClick(DialogInterface dialogInterface, int i) {
//                                ActivityCompat.requestPermissions(TripMapFragment.this, new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION}, 1);
//                            }
//                        })
//                        .create()
//                        .show();
//            }
//            else{
//                ActivityCompat.requestPermissions(CustomerMapActivity.this, new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION}, 1);
//            }
//        }
//    }
//
//    @Override
//    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//        switch(requestCode){
//            case 1:{
//                if(grantResults.length >0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
//                    if(ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) == PackageManager.PERMISSION_GRANTED){
//
//                        mFusedLocationClient.requestLocationUpdates(mLocationRequest, mLocationCallback, Looper.myLooper());
//                        mMap.setMyLocationEnabled(true);
//                    }
//                } else{
//
//                }
//                break;
//            }
//        }
//    }





}
