package com.foursee.funscounter.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;

public class EventUpdateServiceController {
	private Intent serviceIntent;
	private final Context context;

	public EventUpdateServiceController(Context context) {
		this.context = context.getApplicationContext();
	}

	public void stopService() {
		context.stopService(serviceIntent);
	}

	public void unbindService() {
		context.unbindService(serviceConn);
	}

	public void startService(int eventId) {
		serviceIntent = new Intent(context, EventUpdateService.class);
		serviceIntent.putExtra(EventUpdateService.EVENT_ID, eventId);
		context.startService(serviceIntent);
		boolean connected = context.bindService(serviceIntent, serviceConn, 0);
		Log.d("event_Service_Controller", "Service bind: " + connected);
	}

	private final ServiceConnection serviceConn = new ServiceConnection() {

		@Override
		public void onServiceDisconnected(ComponentName name) {
			Log.d("event_Service_Controller", "Service Disconnected");
		}

		@Override
		public void onServiceConnected(ComponentName name, IBinder service) {
			Log.d("event_Service_Controller", "Service Connected");
		}
	};
}