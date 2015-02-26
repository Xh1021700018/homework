package com.example.techsun.activity;

import java.io.InputStream;
import java.util.List;

import com.example.techsun.util.Help;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends Activity {
	private Button btn_login, btn_go_regis;
	private EditText edit_username,edit_passwrod;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		init();
		Intent intent = getIntent();
		String username = intent.getStringExtra("username");
		String password = intent.getStringExtra("password");
		edit_username.setText(username);
		edit_passwrod.setText(password);
		btn_go_regis.setOnClickListener(listener);
		btn_login.setOnClickListener(listener);
		new Thread(){
			public void run() {
			};
		}.start();
	}

	private void init() {
		btn_login = (Button) this.findViewById(R.id.btn_login);
		btn_go_regis = (Button) this.findViewById(R.id.btn_go_regis);
		edit_username = (EditText) this.findViewById(R.id.edit_username);
		edit_passwrod = (EditText) this.findViewById(R.id.edit_password);
	}

	OnClickListener listener = new OnClickListener() {
		@Override
		public void onClick(View v) {
			switch (v.getId()) {
			case R.id.btn_login:
				Intent it  = new Intent(LoginActivity.this,ShowGoodsActivity.class);
				startActivity(it);
				break;
			case R.id.btn_go_regis:
				Intent intent = new Intent(LoginActivity.this,RegisActivity.class);
				startActivity(intent);
				break;
			}
		}
	};
}