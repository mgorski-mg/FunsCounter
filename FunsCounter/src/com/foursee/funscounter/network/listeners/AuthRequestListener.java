package com.foursee.funscounter.network.listeners;

import android.widget.Toast;

import com.foursee.funscounter.R;
import com.foursee.funscounter.fragment.LoginFragment;
import com.foursee.funscounter.ui.dialog.LoadingDialog;
import com.octo.android.robospice.persistence.exception.SpiceException;
import com.octo.android.robospice.request.listener.RequestListener;

public class AuthRequestListener implements RequestListener<Void> {
	private final LoginFragment fragment;
	private final LoadingDialog dialog;

	public AuthRequestListener(LoginFragment fragment) {
		this.fragment = fragment;
		dialog = new LoadingDialog(fragment.getActivity(), R.string.wait);
		dialog.show();
	}

	@Override
	public void onRequestFailure(SpiceException e) {
		dialog.dismiss();
		Toast.makeText(fragment.getActivity(), R.string.cant_login, Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onRequestSuccess(Void result) {
		dialog.dismiss();
		fragment.login();
	}
}