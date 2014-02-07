package com.foursee.funscounter.network.rest.request;

import com.foursee.funscounter.model.Auth;
import com.foursee.funscounter.model.Event;
import com.foursee.funscounter.model.Event.List;
import com.foursee.funscounter.network.rest.IStadionQueries;
import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;

public class AllEventsSpiceRequest extends RetrofitSpiceRequest<Event.List, IStadionQueries> {

	private final Auth auth;

	public AllEventsSpiceRequest(Auth auth) {
		super(Event.List.class, IStadionQueries.class);
		this.auth = auth;
	}

	@Override
	public List loadDataFromNetwork() throws Exception {
		return getService().getAllEvents(auth.getBasicAuthenticationString());
	}
}