package com.example.techsun.activity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class RegisActivity extends Activity {
	
	private Button btn_regis;
	private EditText edit_regis_username,edit_regis_password;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_regis);
		btn_regis = (Button) this.findViewById(R.id.btn_regis);
		edit_regis_username = (EditText) this.findViewById(R.id.edit_regis_username);
		edit_regis_password = (EditText) this.findViewById(R.id.edit_regis_password);
		final String username = edit_regis_username.getText().toString();
		final String password = edit_regis_password.getText().toString();
		btn_regis.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(RegisActivity.this,LoginActivity.class);
				intent.putExtra("username", username);
				intent.putExtra("password", password);
				startActivity(intent);
			}
		});
	}
}