package com.righttreepa.righttreepa;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.util.Log;

/**
 * Created by mina on 2/6/16.
 */
public class UserAccount {

    static String getEmail(Context context) {

        //Log.d("Account", "Hello");
        Account[] accounts = AccountManager.get(context).getAccountsByType("com.google");
        if(accounts[0] != null)
        return accounts[0].name;

        return "";

    }
}
