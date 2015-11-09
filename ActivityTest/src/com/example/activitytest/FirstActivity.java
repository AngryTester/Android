package com.example.activitytest;


import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends BaseActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d("FirstActivity", "Task id is "+getTaskId());
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.first_layout);
		Button button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
//				Toast.makeText(FirstActivity.this, "This is First Activity",
//						Toast.LENGTH_SHORT).show();
//				finish();
//				Intent intent = new Intent(FirstActivity.this,SecondActivity.class);//œ‘ Ω
//				Intent intent = new Intent("com.example.activitytest.ACTION_START");//“˛ Ω
//				intent.addCategory("com.example.activitytest.MY_CATEGORY");
				
//				String data = "Hello SecondActivity";
//				intent.putExtra("extra_data", data);
//				Intent intent = new Intent(Intent.ACTION_VIEW);
//				intent.setData(Uri.parse("http://www.baidu.com"));
				
				SecondActivity.actionStart(FirstActivity.this, "data1", "data2");
				
			}
		});
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		switch(item.getItemId()){
		case R.id.add_item:
			Toast.makeText(this, "You clicked Add", Toast.LENGTH_SHORT).show();
			break;
		case R.id.remove_item:
			Toast.makeText(this, "You clicked remove", Toast.LENGTH_SHORT).show();
			break;
		default:
		}
		return true;
	}
	
	@Override
	protected void onActivityResult(int requestCode,int resultCode,Intent data){
		switch(requestCode){
		case 1:
			if(resultCode == RESULT_OK){
				String returnData = data.getStringExtra("data_return");
//				Log.d("First Activity", returnData);
				Toast.makeText(FirstActivity.this, returnData, Toast.LENGTH_SHORT).show();
			}
			break;
		default:
		}
	}
	
}
