package com.example.adapters;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.R;
import com.example.dataHolders.FamousTechnologistsInfo;

/**
 * 
 * @author danand
 * This adapter is used to show each individual item of famous technologists.
 */
public class FamousTechnologistsAdapter extends BaseAdapter {

	private List<FamousTechnologistsInfo> listResult;

	private LayoutInflater layoutInflater;

	public FamousTechnologistsAdapter(Context context, List<FamousTechnologistsInfo> listData) {
		this.listResult = listData;
		layoutInflater = LayoutInflater.from(context);
	}

	@Override
	public int getCount() {
		return listResult.size();
	}

	@Override
	public Object getItem(int arg0) {
		return listResult.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		FamousTechnologistsInfo holder;

		if (convertView == null) {

			/**
			 * Here you give the reference of the XML used for Each custom Item
			 * of the list
			 */
			convertView = layoutInflater.inflate(R.layout.famous_women_each_item, null, true);
		}
		TextView name = (TextView) convertView.findViewById(R.id.ItemName);
		TextView designation = (TextView) convertView
				.findViewById(R.id.ItemDesignation);
		ImageView image = (ImageView) convertView.findViewById(R.id.ItemIcon);
		holder = listResult.get(position);

		name.setText(holder.getName());
		designation.setText(holder.getCurrentDesignation());
		image.setImageResource(holder.getPhoto());

		convertView.setTag(holder);

		return convertView;
	}

}
