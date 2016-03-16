package com.example.hrh.testaidlapplication.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.util.Log;

import com.example.aidl.IMyAidlInterface;

/**
 * Created by hrh on 2016/3/16.
 */
public class MyService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new MyserviceImpl();
    }

    private class MyserviceImpl extends IMyAidlInterface.Stub {

        @Override
        public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {

        }

        @Override
        public String printAndroidAidl(String name) throws RemoteException {
            Log.i("TAG", "printAndroidAidl: " + name);
            return "Return value successfully!";
        }
    }
}
