package com.example.techsun.method;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.techsun.bean.Goods;
import com.example.techsun.util.Help;

public class Method {
	
	private Context context;
	private SQLiteDatabase db;
	private Help help;
	public Method(Context context) {
		super();
		this.context = context;
		help = new Help(context);
	}
	
	/**
	 * ��ӵķ���
	 */
	
	public void add(Goods goods){
		
	}
	
	/**
	 * ɾ���ķ���
	 */
	
	public void delete(Goods goods){
		
	}
	
	/**
	 * �޸ĵķ���
	 */
	public void update(Goods goods){
		
	}
	
	/**
	 * �����Ͳ�ѯ�ķ���
	 */
	
	public void queryType(Goods goods){
		
	}
	
	/**
	 * ��ѯ���еķ���
	 */

	public List<Goods> queryAll(){
		List<Goods> list = new ArrayList<Goods>();
		db = help.getWritableDatabase();
		Cursor cursor = db.rawQuery("select * from good", null);
		while(cursor.moveToNext()){
			int id = cursor.getInt(cursor.getColumnIndex("id"));
			String name = cursor.getString(cursor.getColumnIndex("name"));
			String price = cursor.getString(cursor.getColumnIndex("price"));
			String type = cursor.getString(cursor.getColumnIndex("type"));
			list.add(new Goods(id, name, price, type));
		}
		return list;
	}
}