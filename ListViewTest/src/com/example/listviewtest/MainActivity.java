package com.example.listviewtest;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private List<Fruit> fruitList  = new ArrayList<Fruit>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initFruit();
		FruitAdapter adapter = new FruitAdapter(MainActivity.this, R.layout.fruit_item,
				fruitList);
		ListView listView = (ListView) findViewById(R.id.list_view);
		listView.setAdapter(adapter);

		listView.setOnItemClickListener(new OnItemClickListener(){
			@Override
			public void onItemClick(AdapterView<?> parent,View view,int position,long id){
				Fruit fruit = fruitList.get(position);
				Toast.makeText(MainActivity.this, fruit.getName().toString(), Toast.LENGTH_SHORT).show();
			}

		});	
	}

	private void initFruit(){
		Fruit apple = new Fruit("Apple",R.drawable.hello);
		fruitList.add(apple);
		Fruit banana = new Fruit("Banana",R.drawable.hello);
		fruitList.add(banana);
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
