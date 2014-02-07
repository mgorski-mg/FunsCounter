package com.foursee.funscounter.network.rest.request;

import com.foursee.funscounter.model.Auth;
import com.foursee.funscounter.network.rest.IStadionQueries;
import com.octo.android.robospice.request.retrofit.RetrofitSpiceRequest;

public class AuthSpiceRequest extends RetrofitSpiceRequest<Void, IStadionQueries> {

	private final Auth auth;

	public AuthSpiceRequest(Auth auth) {
		super(Void.class, IStadionQueries.class);
		this.auth = auth;
	}

	@Override
	public Void loadDataFromNetwork() throws Exception {
		return getService().auth(auth.getBasicAuthenticationString());
	}
}