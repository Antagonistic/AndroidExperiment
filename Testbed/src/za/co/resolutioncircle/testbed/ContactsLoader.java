package za.co.resolutioncircle.testbed;

import android.app.Activity;
import android.content.CursorLoader;
import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract.Contacts;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.ListFragment;
import android.support.v4.app.LoaderManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView.OnQueryTextListener;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.SimpleCursorAdapter;

public class ContactsLoader extends FragmentActivity {
/*
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_contacts_loader);
		
		FragmentManager fm = getSupportFragmentManager();
		
		if(fm.findFragmentById(android.R.id.content) == null) {
			ContactsLoaderListFragment list = new ContactsLoaderListFragment();
			fm.beginTransaction().add(android.R.id.content, list).commit();
		}
	}

//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.contacts_loader, menu);
//		return true;
//	}
	
	public static class ContactsLoaderListFragment extends ListFragment
		implements OnQueryTextListener, LoaderManager.LoaderCallbacks<Cursor> {
		
        SimpleCursorAdapter mAdapter;
		
		String mCurFilter;

        // These are the Contacts rows that we will retrieve.
        static final String[] CONTACTS_SUMMARY_PROJECTION = new String[] {
            Contacts._ID,
            Contacts.DISPLAY_NAME,
            Contacts.CONTACT_STATUS,
            Contacts.CONTACT_PRESENCE,
            Contacts.PHOTO_ID,
            Contacts.LOOKUP_KEY,
        };
        
        @Override
        public void onActivityCreated(Bundle savedInstanceState) {
            super.onActivityCreated(savedInstanceState);
            
            setEmptyText("No phone numbers");
            
            setHasOptionsMenu(true);
            
            mAdapter = new SimpleCursorAdapter(getActivity(), 
            		android.R.layout.simple_list_item_2, null,
            		new String[] { Contacts.DISPLAY_NAME, Contacts.CONTACT_STATUS },
            		new int[] { android.R.id.text1, android.R.id.text2 }, 0);
            setListAdapter(mAdapter);
            
            setListShown(false);
            
            getLoaderManager().initLoader(0, null, this);
            
        }
        
        @Override public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
            // Place an action bar item for searching.
            MenuItem item = menu.add("Search");
            item.setIcon(android.R.drawable.ic_menu_search);
            item.setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM
                    | MenuItem.SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW);
            SearchView sv = new SearchView(getActivity());
            sv.setOnQueryTextListener(this);
            item.setActionView(sv);
        }
		
		@Override
		public android.support.v4.content.Loader<Cursor> onCreateLoader(int id, Bundle args) {

			Uri baseUri;
			if(mCurFilter != null) {
                baseUri = Uri.withAppendedPath(Contacts.CONTENT_FILTER_URI, Uri.encode(mCurFilter));
			} else {
				baseUri = Contacts.CONTENT_URI;
			}
			
			String select = "((" + Contacts.DISPLAY_NAME + " NOTNULL) AND ("
                    + Contacts.HAS_PHONE_NUMBER + "=1) AND ("
                    + Contacts.DISPLAY_NAME + " != '' ))";
			
			return new CursorLoader(getActivity(), baseUri, CONTACTS_SUMMARY_PROJECTION, select, null, Contacts.DISPLAY_NAME + " COLLATE LOCALIZED ASC");
		}

        @Override public void onListItemClick(ListView l, View v, int position, long id) {
            // Insert desired behavior here.
            //Log.i("FragmentComplexList", "Item clicked: " + id);
        	Intent intent = new Intent();
        	intent.putExtra("Name", "Stuff");
        	this.getActivity().setResult(RESULT_OK,intent);
        	this.getActivity().finish();
        }

		@Override
		public boolean onQueryTextChange(String newText) {
            // Called when the action bar search text has changed.  Update
            // the search filter, and restart the loader to do a new query
            // with this filter.
            String newFilter = !TextUtils.isEmpty(newText) ? newText : null;
            // Don't do anything if the filter hasn't actually changed.
            // Prevents restarting the loader when restoring state.
            if (mCurFilter == null && newFilter == null) {
                return true;
            }
            if (mCurFilter != null && mCurFilter.equals(newFilter)) {
                return true;
            }
            mCurFilter = newFilter;
            getLoaderManager().restartLoader(0, null, this);
            return true;
        }

		@Override
		public boolean onQueryTextSubmit(String arg0) {
			return true;
		}

		@Override
		public void onLoadFinished(
				android.support.v4.content.Loader<Cursor> loader, Cursor data) {
            // Swap the new cursor in.  (The framework will take care of closing the
            // old cursor once we return.)
            mAdapter.swapCursor(data);

            // The list should now be shown.
            if (isResumed()) {
                setListShown(true);
            } else {
                setListShownNoAnimation(true);
            }
			
		}

		@Override
		public void onLoaderReset(android.support.v4.content.Loader<Cursor> arg0) {
            mAdapter.swapCursor(null);
		}
		
	}
*/
}
