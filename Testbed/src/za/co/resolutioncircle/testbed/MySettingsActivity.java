package za.co.resolutioncircle.testbed;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.preference.PreferenceActivity;
import android.preference.PreferenceCategory;
import android.preference.PreferenceScreen;
import android.util.Log;
import android.view.Menu;

public class MySettingsActivity extends PreferenceActivity implements OnPreferenceClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		//setContentView(R.layout.activity_my_settings);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.my_settings, menu);
		return true;
	}
	
	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);

		setupSimplePreferencesScreen();
	}
	
	private void setupSimplePreferencesScreen() {
		addPreferencesFromResource(R.xml.pref_mypref);
		PreferenceCategory fakeHeader = new PreferenceCategory(this);
		fakeHeader.setTitle("My title!");
		PreferenceScreen prefs = getPreferenceScreen();
		Log.d(this.getClass().getName(), prefs.toString());
		prefs.addPreference(fakeHeader);
		
		Preference numberPref = findPreference("contact_phone");
		numberPref.setOnPreferenceClickListener(this);


	}
	
	@Override
	public boolean onPreferenceClick(Preference preference) {
		if(preference.getKey().equals("contact_phone"))
		{
			Log.d(this.getClass().getName(), "Contact Phone clicked!");
			Intent intent = new Intent(this, ContactsList.class);
			startActivityForResult(intent, 1);
			return true;
		}
		return false;
	}
	
	
	

}
