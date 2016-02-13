package com.righttreepa.righttreepa;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.provider.Settings;

/**
 * Created by mina on 2/6/16.
 */
public class UserAccount {

    static Context context;

    public UserAccount(Context context) {
        this.context = context;
    }

    public static String getEmail() {

        //Log.d("Account", "Hello");
        Account[] accounts = AccountManager.get(context).getAccountsByType("com.google");
        if (accounts[0] != null)
            return accounts[0].name;

        return "";

    }

    public String getDeviceID() {
        return Settings.Secure.getString(context.getContentResolver(),
                Settings.Secure.ANDROID_ID);

    }

}
