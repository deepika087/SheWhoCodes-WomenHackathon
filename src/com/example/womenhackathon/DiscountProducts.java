package com.example.womenhackathon;

import java.util.ArrayList;
import java.util.List;

import com.example.adapters.ProductDiscountAdapter;
import com.example.dataHolders.SpecialDiscountProducts;
import com.example.R;

import android.app.ListActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ListView;

public class DiscountProducts extends ListActivity {

	List<SpecialDiscountProducts> details;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		details = getDataSourceInfo();

		LayoutInflater inflater = (LayoutInflater) DiscountProducts.this
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		final ListView lv1 = getListView();

		lv1.setAdapter(new ProductDiscountAdapter(this, details));
	}

	public List<SpecialDiscountProducts> getDataSourceInfo() {

		List<SpecialDiscountProducts> result = new ArrayList<SpecialDiscountProducts>();

		result.add(new SpecialDiscountProducts("Lenovo Laptop", "Rs. 10000",
				R.drawable.lenovolaptop, "-25%", "Rs 7500", R.drawable.snapdeal));
		result.add(new SpecialDiscountProducts("Wireless mouse", "Rs. 5000",
				R.drawable.wirelessmouse, "-50%", "Rs 2500", R.drawable.walmart));
		result.add(new SpecialDiscountProducts("Data Structures and algorithms",
				"Rs. 1000", R.drawable.dsac, "-35%", "Rs 650",
				R.drawable.snapdeal));
		result.add(new SpecialDiscountProducts("Python", "Rs. 2000",
				R.drawable.pyhtonbook, "-10%", "Rs 1800", R.drawable.walmart));
		result.add(new SpecialDiscountProducts("HP Laptop", "Rs. 40000",
				R.drawable.hplaptop, "-50%", "Rs 20000", R.drawable.snapdeal));
		result.add(new SpecialDiscountProducts("Dell Laptop", "Rs. 50000",
				R.drawable.delllaptop, "-10%", "Rs 45000", R.drawable.snapdeal));
		result.add(new SpecialDiscountProducts("Lenovo Laptop", "Rs. 2000",
				R.drawable.dellkeyboard, "-50%", "Rs 1000", R.drawable.walmart));
		result.add(new SpecialDiscountProducts("Lenovo Laptop", "Rs. 4000",
				R.drawable.transcendharddrive, "-25%", "Rs 3000", R.drawable.snapdeal));
		result.add(new SpecialDiscountProducts("Zebronics Speaker", "Rs. 3000",
				R.drawable.loudspeakers, "-50%", "Rs 1500", R.drawable.walmart));
		result.add(new SpecialDiscountProducts("Lenovo Laptop", "Rs. 10000",
				R.drawable.lenovolaptop, "-25%", "Rs 7500", R.drawable.snapdeal));
		result.add(new SpecialDiscountProducts("Wireless mouse", "Rs. 5000",
				R.drawable.wirelessmouse, "-50%", "Rs 2500", R.drawable.walmart));
		result.add(new SpecialDiscountProducts("Data Structures and algorithms",
				"Rs. 1000", R.drawable.dsac, "-35%", "Rs 650",
				R.drawable.snapdeal));
		result.add(new SpecialDiscountProducts("Python", "Rs. 2000",
				R.drawable.pyhtonbook, "-10%", "Rs 1800", R.drawable.walmart));
		result.add(new SpecialDiscountProducts("HP Laptop", "Rs. 40000",
				R.drawable.hplaptop, "-50%", "Rs 20000", R.drawable.snapdeal));
		result.add(new SpecialDiscountProducts("Dell Laptop", "Rs. 50000",
				R.drawable.delllaptop, "-10%", "Rs 45000", R.drawable.snapdeal));
		result.add(new SpecialDiscountProducts("Lenovo Laptop", "Rs. 2000",
				R.drawable.dellkeyboard, "-50%", "Rs 1000", R.drawable.walmart));
		result.add(new SpecialDiscountProducts("Lenovo Laptop", "Rs. 4000",
				R.drawable.transcendharddrive, "-25%", "Rs 3000", R.drawable.snapdeal));
		result.add(new SpecialDiscountProducts("Zebronics Speaker", "Rs. 3000",
				R.drawable.loudspeakers, "-50%", "Rs 1500", R.drawable.walmart));

		return result;
	}
}
