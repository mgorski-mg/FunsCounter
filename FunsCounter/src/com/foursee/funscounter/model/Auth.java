package com.foursee.funscounter.model;

import android.util.Base64;

public class Auth {

	private String userName;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getBasicAuthenticationString() {
		return "Basic " + Base64.encodeToString((userName + ":" + password).getBytes(), Base64.NO_WRAP);
	}

	public static final class Builder {
		private final Auth auth = new Auth();

		public Builder withUserName(String userName) {
			auth.setUserName(userName);
			return this;
		}

		public Builder withPassword(String password) {
			auth.setPassword(password);
			return this;
		}

		public Auth build() {
			return auth;
		}
	}
}