package kr.example.projecta;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class ProjectAActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void myClickHandler(View v) {
		switch (v.getId()) {
		case R.id.button1:
			Toast.makeText(ProjectAActivity.this, "Rock",
					Toast.LENGTH_SHORT).show();
			break;
		case R.id.button2:
			Toast.makeText(ProjectAActivity.this, "Scissors",
					Toast.LENGTH_SHORT).show();
			break;
		case R.id.button3:
			Toast.makeText(ProjectAActivity.this, "Paper",
					Toast.LENGTH_SHORT).show();
			break;
		}
	}

}
