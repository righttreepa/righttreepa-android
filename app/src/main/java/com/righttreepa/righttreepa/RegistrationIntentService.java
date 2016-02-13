package com.righttreepa.righttreepa;

import android.app.IntentService;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;

import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.google.android.gms.iid.InstanceID;

import java.io.IOException;

/**
 * Created by mina on 2/6/16.
 */
public class RegistrationIntentService extends IntentService {
    private static final String TAG = "RegIntentService";

    public RegistrationIntentService() {
        super(TAG);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d(TAG, "On Handle");
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        InstanceID instanceID = InstanceID.getInstance(this);
        try {
            String token = instanceID.getToken(getString(R.string.gcm_defaultSenderId),
                    GoogleCloudMessaging.INSTANCE_ID_SCOPE, null);

            //Send Token to our Server
            //Implement this method to send any registration to your app's servers.
            sendRegistrationToServer(token);

            sharedPreferences.edit().putBoolean("TokenRegistered",true).apply();
            Log.d(TAG,token);

        } catch (IOException e) {
            e.printStackTrace();
            sharedPreferences.edit().putBoolean("TokenRegistered",false).apply();
        }
    }

    private void sendRegistrationToServer(String token) {
        //TODO: Register this device with Android ID and Token
        String x =  new UserAccount(this).getDeviceID();
        Log.d(TAG, x);
    }
}
