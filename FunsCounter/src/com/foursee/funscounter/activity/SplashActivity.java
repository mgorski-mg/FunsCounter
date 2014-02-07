package com.foursee.funscounter.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.foursee.funscounter.R;

public class SplashActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash_activity);

		startActivity(new Intent(this, LoginActivity.class));
	}
}