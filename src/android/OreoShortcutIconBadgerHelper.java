package de.appplant.cordova.plugin.badge;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.support.v4.app.NotificationCompat;

public class OreoShortcutIconBadgerHelper extends ContextWrapper {

    private static final String SIB_CHANNEL_ID = "package de.appplant.cordova.plugin.badge.SIBDEV;";
    private static final String SIB_CHANNEL_NAME = "SIBDEV Channel";
    private NotificationManager manager;

    public OreoShortcutIconBadgerHelper(Context base) {
        super(base);
        createChannels();
    }

    private void createChannels() {
        NotificationChannel sibChannel = new NotificationChannel(SIB_CHANNEL_ID, SIB_CHANNEL_NAME, NotificationManager.IMPORTANCE_DEFAULT);
        sibChannel.setShowBadge(false);

        getManager().createNotificationChannel(sibChannel);
    }

    public NotificationManager getManager() {
        if(manager == null)
            manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        return manager;
    }

    public Notification getSIBChannelNotification() {
        return new Notification.Builder(getApplicationContext(), SIB_CHANNEL_ID)
                .setContentTitle("New Messages")
                .setContentText("You've received 3 new messages.")
                .build();
				//.setSmallIcon(R.mipmap.ic_launcher_round)
				//.setBadgeIconType(NotificationCompat.BADGE_ICON_SMALL)
				
    }
}
