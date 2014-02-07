package com.foursee.funscounter;

import android.app.Application;

import com.foursee.funscounter.model.Auth;
import com.foursee.funscounter.model.Event;

public class BaseApplication extends Application {
	private Auth auth;
	private Event currentEvent;

	public Auth getAuth() {
		return auth;
	}

	public void setAuth(Auth auth) {
		this.auth = auth;
	}

	public Event getCurrentEvent() {
		return currentEvent;
	}

	public void setCurrentEvent(Event currentEvent) {
		this.currentEvent = currentEvent;
	}
}