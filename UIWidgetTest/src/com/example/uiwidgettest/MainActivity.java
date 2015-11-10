package com.example.uiwidgettest;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
//		Button button = (Button) findViewById(R.id.Login);
//		button.setOnClickListener(this);
//		Button editbutton = (Button) findViewById(R.id.title_edit);
//		editbutton.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
//		switch (v.getId()) {// 布局内可能有多个按钮
//		case R.id.Login:
			// ImageView imageView = (ImageView)findViewById(R.id.image_view);
			// imageView.setImageResource(R.drawable.hello);
			// ProgressBar progressBar = (ProgressBar)
			// findViewById(R.id.progress_bar);
			// if (progressBar.getVisibility() == View.GONE) {
			// progressBar.setVisibility(View.VISIBLE);
			// } else
			// progressBar.setVisibility(View.GONE);
			// int progress = progressBar.getProgress();
			// progress+=10;
			// progressBar.setProgress(progress);
			// AlertDialog.Builder dialog = new
			// AlertDialog.Builder(MainActivity.this);
			// dialog.setTitle("This is Dialog");
			// dialog.setMessage("Something important.");
			// dialog.setCancelable(false);
			// dialog.setPositiveButton("OK", new
			// DialogInterface.OnClickListener(){
			// @Override
			// public void onClick(DialogInterface dialog,int which){
			//
			// }
			// });
			// dialog.setNegativeButton("Cancel", new
			// DialogInterface.OnClickListener(){
			// @Override
			// public void onClick(DialogInterface dialog,int which){
			//
			// }
			// });
			// dialog.show();
			// ProgressDialog progressDialog = new
			// ProgressDialog(MainActivity.this);
			// progressDialog.setTitle("This is ProgressDialog");
			// progressDialog.setMessage("Loading...");
			// progressDialog.setCancelable(true);
			// progressDialog.show();

//			TextView account = (TextView) findViewById(R.id.account);
//			TextView password = (TextView) findViewById(R.id.password);
//			if (account.getText().toString().equals("admin") && password.getText().toString().equals("123456")) {
//				Toast.makeText(MainActivity.this, "login success!", Toast.LENGTH_SHORT).show();
//			} else
//				Toast.makeText(MainActivity.this, "login failed!", Toast.LENGTH_SHORT).show();
//
//			break;
//		case R.id.title_edit:
//			Toast.makeText(MainActivity.this, "you clicked edit button", Toast.LENGTH_SHORT).show();
//			break;
//		default:
//			break;
//		}

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
}
