package tk.yuqibit.myfirstapp;

import android.app.Application;

public class MyApp extends Application
{
	private String myName;

	public String getMyName()
	{
		return myName;
	}

	public void setMyName( String myName )
	{
		this.myName = myName;
	}
	
	@Override
	public void onCreate()
	{
		super.onCreate();
		setMyName( "Charlie" );
	}
}
