package com.foursee.funscounter.network.rest.request;

import com.foursee.funscounter.model.Auth;
import com.foursee.funscounter.model.Event;
import com.foursee.funscounter.network.rest.IStadionQueries;
import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;

public class EventDataSpiceRequest extends RetrofitSpiceRequest<Event, IStadionQueries> {

	private final int eventId;
	private final Auth auth;

	public EventDataSpiceRequest(Auth auth, int eventId) {
		super(Event.class, IStadionQueries.class);
		this.auth = auth;
		this.eventId = eventId;
	}

	@Override
	public Event loadDataFromNetwork() throws Exception {
		return getService().getEventData(auth.getBasicAuthenticationString(), eventId);
	}
}