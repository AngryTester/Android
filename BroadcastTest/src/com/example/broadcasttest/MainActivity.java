package com.example.broadcasttest;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private IntentFilter intentFilter;
	private LocalReceiver localReceiver;
	private LocalBroadcastManager localBroadcastManager;
	
	private NetWorkChangeReceiver networkChangeReceiver;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		
		localBroadcastManager = LocalBroadcastManager.getInstance(this);
		Button button = (Button)findViewById(R.id.button);
		button.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				Intent intent = new Intent("com.example.broadcasttest.LOCAL_BROADCAST");
				localBroadcastManager.sendBroadcast(intent);
			}
		});
		intentFilter = new IntentFilter();
		intentFilter.addAction("com.example.broadcasttest.LOCAL_BROADCAST");
		localReceiver = new LocalReceiver();
		localBroadcastManager.registerReceiver(localReceiver, intentFilter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	class NetWorkChangeReceiver extends BroadcastReceiver{
		@Override
		public void onReceive(Context context,Intent intent){
			ConnectivityManager connectionManeger = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
			NetworkInfo networkInfo = connectionManeger.getActiveNetworkInfo();
			if(networkInfo!=null&&networkInfo.isAvailable()){
				Toast.makeText(context, "network is available", Toast.LENGTH_SHORT).show();
			} else{
				Toast.makeText(context, "network is unavailable", Toast.LENGTH_SHORT).show();
			}
			
		}
	}
	
	@Override
	protected void onDestroy(){
		super.onDestroy();
		localBroadcastManager.unregisterReceiver(localReceiver);
	}
	
	class LocalReceiver extends BroadcastReceiver{
		@Override
		public void onReceive(Context context, Intent intent) {
			Toast.makeText(context, "received local broadcast", Toast.LENGTH_SHORT).show();
		}
		
	}
	
}
