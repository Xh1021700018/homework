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
		db.execSQL("insert into good values(null,'MP1','1500','���Ӳ�Ʒ')");
		db.execSQL("insert into good values(null,'MP2','1500','���Ӳ�Ʒ')");
		db.execSQL("insert into good values(null,'MP3','1500','���Ӳ�Ʒ')");
		db.execSQL("insert into good values(null,'MP4','1500','���Ӳ�Ʒ')");
		db.execSQL("insert into good values(null,'����1','200','�·�')");
		db.execSQL("insert into good values(null,'����2','200','�·�')");
		db.execSQL("insert into good values(null,'����3','200','�·�')");
		db.execSQL("insert into good values(null,'����4','200','�·�')");
		db.execSQL("insert into good values(null,'���1','200','��ʳ���')");
		db.execSQL("insert into good values(null,'���2','200','��ʳ���')");
		db.execSQL("insert into good values(null,'���3','200','��ʳ���')");
		db.execSQL("insert into good values(null,'���4','200','��ʳ���')");
	}
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("create table pay (pay_id Integer primary key autoincrement,name varchar(20),price varchar(20))");	
	}
}