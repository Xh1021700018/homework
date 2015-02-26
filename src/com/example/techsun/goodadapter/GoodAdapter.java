package com.example.techsun.goodadapter;

import java.util.List;

import com.example.techsun.activity.R;
import com.example.techsun.bean.Goods;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GoodAdapter extends BaseAdapter{
	
	private List<Goods> list;
	private Context context;
	
	public List<Goods> getList() {
		return list;
	}

	public void setList(List<Goods> list) {
		this.list = list;
	}

	public GoodAdapter(List<Goods> list, Context context) {
		super();
		this.list = list;
		this.context = context;
	}

	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public Object getItem(int arg0) {
		return list.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		return arg0;
	}

	@Override
	public View getView(int position, View v, ViewGroup arg2) {
		ViewHolder holder = null;
		if(v == null){
			System.out.println("goodAdapte-------if");
			v = LayoutInflater.from(context).inflate(R.layout.show_goods_item,null);
			holder = new ViewHolder();
			holder.text_item_name = (TextView) v.findViewById(R.id.text_item_name);
			holder.text_item_price = (TextView) v.findViewById(R.id.text_item_price);
			holder.btn_item_add = (Button) v.findViewById(R.id.btn_item_add);
			v.setTag(holder);
		}else{
			System.out.println("goodAdapte-------else");
			holder = (ViewHolder) v.getTag();
		}
		holder.text_item_name.setText("商品名："+list.get(position).getName());
		holder.text_item_price.setText("价格："+list.get(position).getPrice()+"元");
		holder.btn_item_add.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
			}
		});
		return v;
	}

	private class ViewHolder{
		TextView text_item_name;
		TextView text_item_price;
		Button btn_item_add;
	}
}
