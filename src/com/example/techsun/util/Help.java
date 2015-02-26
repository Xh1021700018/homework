package com.example.techsun.util;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class Help extends SQLiteOpenHelper{

	public Help(Context context) {
		super(context,"goods.db",null,3);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL("create table good (id Integer primary key autoincrement,name varchar(20),price varchar(20),type varchar(20))");
		db.execSQL("insert into good values(null,'MP1','1500','电子产品')");
		db.execSQL("insert into good values(null,'MP2','1500','电子产品')");
		db.execSQL("insert into good values(null,'MP3','1500','电子产品')");
		db.execSQL("insert into good values(null,'MP4','1500','电子产品')");
		db.execSQL("insert into good values(null,'大衣1','200','衣服')");
		db.execSQL("insert into good values(null,'大衣2','200','衣服')");
		db.execSQL("insert into good values(null,'大衣3','200','衣服')");
		db.execSQL("insert into good values(null,'大衣4','200','衣服')");
		db.execSQL("insert into good values(null,'礼包1','200','美食茶酒')");
		db.execSQL("insert into good values(null,'礼包2','200','美食茶酒')");
		db.execSQL("insert into good values(null,'礼包3','200','美食茶酒')");
		db.execSQL("insert into good values(null,'礼包4','200','美食茶酒')");
	}
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("create table pay (pay_id Integer primary key autoincrement,name varchar(20),price varchar(20))");	
	}
}