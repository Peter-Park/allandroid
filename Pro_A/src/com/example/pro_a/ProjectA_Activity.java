package com.example.pro_a;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Toast;

public class ProjectA_Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void myClickHandler(View v) {
		switch (v.getId()) {
		case R.id.button1:
			Toast.makeText(ProjectA_Activity.this, "Scissors",
					Toast.LENGTH_SHORT).show();
			break;
		case R.id.button2:
			Toast.makeText(ProjectA_Activity.this, "Rock",
					Toast.LENGTH_SHORT).show();
			break;
		case R.id.button3:
			Toast.makeText(ProjectA_Activity.this, "Paper",
					Toast.LENGTH_SHORT).show();
			break;
		}
	}

}
