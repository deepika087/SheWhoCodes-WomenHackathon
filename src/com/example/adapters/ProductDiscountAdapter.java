package com.example.adapters;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dataHolders.SpecialDiscountProducts;
import com.example.R;

public class ProductDiscountAdapter extends BaseAdapter{

	private List<SpecialDiscountProducts> listResult;

	private LayoutInflater layoutInflater;
	Activity context;

	public ProductDiscountAdapter(Context context, List<SpecialDiscountProducts> listData) {
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
		SpecialDiscountProducts holder;

		if (convertView == null) {

			/**
			 * Here you give the reference of the XML used for Each Item of special discount
			 * of the list
			 */
			convertView =  layoutInflater.inflate(R.layout.purchase_special_discount_each_product, null, true);
		}
		
		ImageView image = (ImageView) convertView.findViewById(R.id.productImage);
		TextView description = (TextView) convertView.findViewById(R.id.productDescription);
		TextView originalPrice = (TextView) convertView.findViewById(R.id.productCost);
		originalPrice.setPaintFlags(originalPrice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
		TextView specialdiscount = (TextView) convertView.findViewById(R.id.productSpecialDiscount);
		TextView finalPrice = (TextView) convertView.findViewById(R.id.productFinalCost);
		ImageView sponsoredBy = (ImageView) convertView.findViewById(R.id.productSponsor);
		
		holder = listResult.get(position);

		description.setText(holder.getDescription());
		originalPrice.setText(holder.getOriginalPrice());
		image.setImageResource(holder.getPhoto());
		specialdiscount.setText(holder.getDiscountPercentage());
		finalPrice.setText(holder.getFinalPrice());
		sponsoredBy.setImageResource(holder.getSponseredBy());
		
		convertView.setTag(holder);
		return convertView;
	}
}
