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
	 * 添加的方法
	 */
	
	public void add(Goods goods){
		
	}
	
	/**
	 * 删除的方法
	 */
	
	public void delete(Goods goods){
		
	}
	
	/**
	 * 修改的方法
	 */
	public void update(Goods goods){
		
	}
	
	/**
	 * 按类型查询的方法
	 */
	
	public void queryType(Goods goods){
		
	}
	
	/**
	 * 查询所有的方法
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