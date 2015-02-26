package com.example.techsun.activity;

import java.util.List;

import com.example.techsun.bean.Goods;
import com.example.techsun.goodadapter.GoodAdapter;
import com.example.techsun.method.Method;
import com.example.techsun.util.Help;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.view.Menu;
import android.widget.ListView;

public class ShowGoodsActivity extends Activity {
	private SQLiteDatabase db;
	private Context context;
	private GoodAdapter adapter;
	private List<Goods> list;
	private ListView listView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_show_goods);
		
		context = this;
		db = new Help(context).getWritableDatabase();
		listView = (ListView) this.findViewById(R.id.list_show_goods);
		
		list = new Method(context).queryAll();
		adapter = new GoodAdapter(list, context);
		listView.setAdapter(adapter);
		
	}
}
