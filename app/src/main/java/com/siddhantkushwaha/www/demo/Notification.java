package com.siddhantkushwaha.www.demo;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
//import android.support.v7.app.NotificationCompat;
import android.os.Bundle;
//import android.support.v4.app.NotificationManagerCompat;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import static android.app.Notification.EXTRA_NOTIFICATION_ID;


public class Notification extends AppCompatActivity{

    Button btn;
    NotificationHelper mNotificationHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_2);
        Log.i("info", "created");
        btn = findViewById(R.id.idBtn);
        mNotificationHelper = new NotificationHelper(this);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("info", "clicked");
                //sendOnChannel1("Sample Alert", "Damn man! Fire!");
            }
        });
    }



//    private void Notify() {
//        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
//        final String ChannelID="my_channel_01";
//        CharSequence name="Shivam";
//        String desc="this is notify";
//        int imp=NotificationManager.IMPORTANCE_HIGH;
//
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
//        {
//            NotificationChannel mChannel = new NotificationChannel(ChannelID, name,
//                    imp);
//            mChannel.setDescription(desc);
//            mChannel.setLightColor(Color.CYAN);
//            mChannel.canShowBadge();
//            mChannel.setShowBadge(true);
//            notificationManager.createNotificationChannel(mChannel);
//        }
//        //build notification
//        Notification mBuilder = new Notification.Builder(this, ChannelID)
//                    .setSmallIcon(R.mipmap.ic_launcher)
//                    .setContentTitle("Simple Notification")
//                    .setContentText("Damn man! You're warehouse is on fire");
////                    .setContentIntent(pendingIntent)
////                    .addAction(R.drawable.ic_snooze, getString(R.string.snooze),
////                        snoozePendingIntent);
//        //Gets instance of the NotificationManager service
//       // NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
//
////        Intent snoozeIntent = new Intent(this, MyBroadcastReceiver.class);
////        snoozeIntent.setAction(ACTION_SNOOZE);
////        snoozeIntent.putExtra(EXTRA_NOTIFICATION_ID, 0);
////        PendingIntent snoozePendingIntent =
////                PendingIntent.getBroadcast(this, 0, snoozeIntent, 0);
//
//        //to post your notification
//        notificationManager.notify(0, mBuilder.build());
//    }
}
