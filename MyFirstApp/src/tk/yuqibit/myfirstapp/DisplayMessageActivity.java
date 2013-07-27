package tk.yuqibit.myfirstapp;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.MenuItem;
import android.widget.TextView;
import android.support.v4.app.NavUtils;
import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;

public class DisplayMessageActivity extends Activity
{
	
	private MyApp myApp;
	public final static String TAG = "MainActivity";
	
	@Override
	public void onCreate( Bundle savedInstanceState )
	{
		super.onCreate( savedInstanceState );

		//get the name from Application
		myApp = (MyApp) getApplication();
		String name =  myApp.getMyName() + " Qiao";
		
		// Get the message from the intent
		Intent intent = getIntent();
		String message = intent.getStringExtra( MainActivity.EXTRA_MESSAGE );

		message = name + " " + message;
		
		// Create the text view
		TextView textView = new TextView( this );
		textView.setTextSize( 40 );
		textView.setText( message );

		// Set the text view as the activity layout
		setContentView( textView );	
		Log.i(TAG, "sub onCreate is excuted");
	}
	
    @Override
    protected void onStart() {
    	// TODO Auto-generated method stub
    	super.onStart();
    	Log.i(TAG, "sub onStart is excuted");
    }
    
    @Override
    protected void onRestart() {
    	// TODO Auto-generated method stub
    	super.onRestart();
    	Log.i(TAG, "sub onRestart is excuted");
    }
    
    @Override
    protected void onResume() {
    	// TODO Auto-generated method stub
    	super.onResume();
    	Log.i(TAG, "sub onResume is excuted");
    }
    
    @Override
    protected void onPause() {
    	// TODO Auto-generated method stub
    	super.onPause();
    	Log.i(TAG, "sub onPause is excuted");
    }
    
    @Override
    protected void onStop() {
    	// TODO Auto-generated method stub
    	super.onStop();
    	Log.i(TAG, "sub onStop is excuted");
    }
    
    @Override
    protected void onDestroy() {
    	// TODO Auto-generated method stub
    	super.onDestroy();
    	Log.i(TAG, "sub onDestroy is excuted");
    }

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi( Build.VERSION_CODES.HONEYCOMB )
	private void setupActionBar()
	{
		if( Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB )
		{
			getActionBar().setDisplayHomeAsUpEnabled( true );
		}
	}

	@Override
	public boolean onOptionsItemSelected( MenuItem item )
	{
		switch( item.getItemId() )
		{
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask( this );
			return true;
		}
		return super.onOptionsItemSelected( item );
	}

}
