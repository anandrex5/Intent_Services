package com.example.intent_services;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import androidx.annotation.Nullable;

public class ServicesExample extends IntentService {


    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     */
    public ServicesExample() {
        super("name");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("Service","Service is Created");
        //If you want to stop the service automatically then
        //stopSelf();

        // See here we did not even write the stopSelf() the service itself because the intent service handles everything itself
        //when it finishes the task ,it stops the service itself.
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("Service","Service is Started");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Service","Service is Stopped");
    }

    @Override
    protected void onHandleIntent( Intent intent) {
        Log.d("Service","onHandleIntent method worked");

    }

}
