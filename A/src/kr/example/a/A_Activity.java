package kr.example.a;

import kr.example.a.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class A_Activity extends Activity {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void myClickHandler(View v) {
		switch (v.getId()) {
		case R.id.button1:
			Toast.makeText(A_Activity.this, "Button id is Rock",
					Toast.LENGTH_SHORT).show();
			break;
		case R.id.button2:
			Toast.makeText(A_Activity.this, "Button id is Scissors",
					Toast.LENGTH_SHORT).show();
			break;
		case R.id.button3:
			Toast.makeText(A_Activity.this, "Button id is Paper",
					Toast.LENGTH_SHORT).show();
			break;
		}
	}

}