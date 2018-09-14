package de.appplant.cordova.plugin.badge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OreoShortcutIconBadger extends AppCompatActivity {

	public OreoShortcutIconBadger() {}
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        OreoShortcutIconBadgerHelper helper = new OreoShortcutIconBadgerHelper(this);
        helper.getSIBChannelNotification();
    }
}
