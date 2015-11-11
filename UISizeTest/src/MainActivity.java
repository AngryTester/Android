import com.example.uisizetest.R;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;

public class MainActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		float xdpi = getResources().getDisplayMetrics().xdpi;
		float ydpi = getResources().getDisplayMetrics().ydpi;
		Log.d("MainActivity", "xdpi is "+xdpi);
		Log.d("MainActivity", "ydpi is "+ydpi);
	}
}
