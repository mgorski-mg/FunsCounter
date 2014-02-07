package com.foursee.funscounter.activity;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.Optional;

import com.foursee.funscounter.R;
import com.foursee.funscounter.fragment.ContentFragment;
import com.foursee.funscounter.fragment.EventListFragment;
import com.foursee.funscounter.fragment.EventListFragment.OnEventSelectedListener;

public class EventsActivity extends ActionBarActivity implements OnEventSelectedListener {

	@Optional
	@InjectView(R.id.content_contener)
	FrameLayout contentContainer;

	private boolean isDual;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.events_activity);
		ButterKnife.inject(this);

		isDual = contentContainer != null;

		if (savedInstanceState == null) {
			getSupportFragmentManager() //
					.beginTransaction() //
					.add(R.id.list_container, new EventListFragment()) //
					.commit();
		}
	}

	@Override
	public void onEventSelected(int eventId) {
		if (isDual) {
			showContentInFragment(eventId);
		} else {
			showContentInNewActivity(eventId);
		}
	}

	private void showContentInFragment(int eventId) {
		getSupportFragmentManager() //
				.beginTransaction() //
				.replace(R.id.content_contener, ContentFragment.create(eventId)) //
				.addToBackStack(null) //
				.commit();
	}

	private void showContentInNewActivity(int eventId) {
		startActivity(ContentActivity.createIntent(this, eventId));
	}
}