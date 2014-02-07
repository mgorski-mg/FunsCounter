package com.foursee.funscounter.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.foursee.funscounter.R;
import com.foursee.funscounter.fragment.LoginFragment;
import com.foursee.funscounter.fragment.LoginFragment.OnSuccessfulLoginListener;

public class LoginActivity extends ActionBarActivity implements OnSuccessfulLoginListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_activity);

		if (savedInstanceState == null) {
			getSupportFragmentManager() //
					.beginTransaction() //
					.add(R.id.contener, new LoginFragment()) //
					.commit();
		}
	}

	@Override
	public void onSuccessfulLogin() {
		startActivity(new Intent(this, EventsActivity.class));
	}
}