package com.righttreepa.righttreepa;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.content.Context;

/**
 * @brief Gets location of the device
 *
 * @author hschmale
 * @date 2/14/2016
 * @todo Finish Implmenting it.
 *
 * Based off of this stackoverflow answer: http://stackoverflow.com/a/15757944/4335488
 */
public class LocationListenerService extends Service
        implements LocationListener {

    protected LocationManager locationManager;
    private static double lat =0.0;
    private static double lon = 0.0;
    private static double alt = 0.0;
    private static double speed = 0.0;

    public static double getLatitude(){
        return lat;
    }

    public static double getLongitude() {
        return lon;
    }

    public static double getAltitude() {
        return alt;
    }

    public static double getSpeed() {
        return speed;
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {
    }

    @Override
    public void onLocationChanged(Location location) {
        lat    = location.getLatitude();
        lon    = location.getLongitude();
        alt    = location.getAltitude();
        speed  = location.getSpeed();
    }

    @Override
    public void onProviderDisabled(String provider) {
    }

    @Override
    public void onProviderEnabled(String provider) {
    }
}
