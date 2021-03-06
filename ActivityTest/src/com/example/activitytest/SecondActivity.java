package com.example.activitytest;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends BaseActivity{
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		Log.d("SecondActivity", "Task id is "+getTaskId());
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.second_layout);
//		Intent intent = getIntent();
//		String data = intent.getStringExtra("extra_data");
//		Toast.makeText(SecondActivity.this, data, Toast.LENGTH_SHORT).show();
		Button button2 = (Button)findViewById(R.id.button2);
		button2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v){
				Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
//				intent.putExtra("data_return", "Hello FirstActivity");
//				setResult(RESULT_OK,intent);
//				finish();
				startActivity(intent);
			}
		});
	}
	
	@Override
	public void onBackPressed(){
		Intent intent = new Intent();
		intent.putExtra("data_return", "Hello FirstActivity");
		setResult(RESULT_OK,intent);
		finish();
	}
	
	public static void actionStart(Context context,String data1,String data2){
		Intent intent = new Intent(context,SecondActivity.class);
		intent.putExtra("param1", data1);
		intent.putExtra("param2", data2);
		context.startActivity(intent);
	}

}
