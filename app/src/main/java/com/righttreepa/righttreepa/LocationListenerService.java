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

    private final Context mContext;
    protected LocationManager locationManager;

    public LocationListenerService(Context context) {
        this.mContext = context;
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
    }

    @Override
    public void onProviderDisabled(String provider) {
    }

    @Override
    public void onProviderEnabled(String provider) {
    }
}
