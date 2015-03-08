package com.example.womenhackathon;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.example.adapters.FamousTechnologistsAdapter;
import com.example.dataHolders.FamousTechnologistsInfo;
import com.example.utility.FamousTechnologistsData;
import com.example.utility.IntentFields;

public class FamousWomen extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		final List<FamousTechnologistsInfo> details = getDataSourceInfo();

		LayoutInflater inflater = (LayoutInflater) FamousWomen.this
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		final ListView lv1 = (ListView) getListView();

		lv1.setAdapter(new FamousTechnologistsAdapter(this, details));
		lv1.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				try {
					Class cls = Class
							.forName("com.example.fullScreenHandlers.TechnologistScreen");
					Intent ourIntent = new Intent(arg1.getContext(), cls);
					final FamousTechnologistsInfo data = details.get(arg2);

					ourIntent.putExtra(IntentFields.NAME, data.getName());
					ourIntent.putExtra(IntentFields.DESIGNATION,
							data.getCurrentDesignation());
					ourIntent.putExtra(IntentFields.INTRODUCTION,
							data.getIntroduction());
					ourIntent.putExtra(IntentFields.CURRENT_OPENINGS,
							data.getCurrentOpenings());
					ourIntent.putExtra(IntentFields.PHOTO, data.getPhoto());

					startActivity(ourIntent);

				} catch (ClassNotFoundException ex) {
					ex.printStackTrace();
				}
			}
		});
	}

	public List<FamousTechnologistsInfo> getDataSourceInfo() {

		List<FamousTechnologistsInfo> result = new ArrayList<FamousTechnologistsInfo>();
		result.add(new FamousTechnologistsInfo(
				FamousTechnologistsData.TECHNOLOGIST1_NAME,
				FamousTechnologistsData.TECHNOLOGIST1_DESIGNATION,
				FamousTechnologistsData.TECHNOLOGIST1_IMAGE,
				FamousTechnologistsData.TECHNOLOGIST1_BACKGROUND,
				FamousTechnologistsData.TECHNOLOGIST1_CURRENT_OPENINGS));
		result.add(new FamousTechnologistsInfo(
				FamousTechnologistsData.TECHNOLOGIST2_NAME,
				FamousTechnologistsData.TECHNOLOGIST2_DESIGNATION,
				FamousTechnologistsData.TECHNOLOGIST2_IMAGE,
				FamousTechnologistsData.TECHNOLOGIST2_BACKGROUND,
				FamousTechnologistsData.TECHNOLOGIST2_CURRENT_OPENINGS));
		result.add(new FamousTechnologistsInfo(
				FamousTechnologistsData.TECHNOLOGIST3_NAME,
				FamousTechnologistsData.TECHNOLOGIST3_DESIGNATION,
				FamousTechnologistsData.TECHNOLOGIST3_IMAGE,
				FamousTechnologistsData.TECHNOLOGIST3_BACKGROUND,
				FamousTechnologistsData.TECHNOLOGIST3_CURRENT_OPENINGS));
		result.add(new FamousTechnologistsInfo(
				FamousTechnologistsData.TECHNOLOGIST4_NAME,
				FamousTechnologistsData.TECHNOLOGIST4_DESIGNATION,
				FamousTechnologistsData.TECHNOLOGIST4_IMAGE,
				FamousTechnologistsData.TECHNOLOGIST4_BACKGROUND,
				FamousTechnologistsData.TECHNOLOGIST4_CURRENT_OPENINGS));
		result.add(new FamousTechnologistsInfo(
				FamousTechnologistsData.TECHNOLOGIST1_NAME,
				FamousTechnologistsData.TECHNOLOGIST1_DESIGNATION,
				FamousTechnologistsData.TECHNOLOGIST1_IMAGE,
				FamousTechnologistsData.TECHNOLOGIST1_BACKGROUND,
				FamousTechnologistsData.TECHNOLOGIST1_CURRENT_OPENINGS));
		result.add(new FamousTechnologistsInfo(
				FamousTechnologistsData.TECHNOLOGIST2_NAME,
				FamousTechnologistsData.TECHNOLOGIST2_DESIGNATION,
				FamousTechnologistsData.TECHNOLOGIST2_IMAGE,
				FamousTechnologistsData.TECHNOLOGIST2_BACKGROUND,
				FamousTechnologistsData.TECHNOLOGIST2_CURRENT_OPENINGS));
		result.add(new FamousTechnologistsInfo(
				FamousTechnologistsData.TECHNOLOGIST3_NAME,
				FamousTechnologistsData.TECHNOLOGIST3_DESIGNATION,
				FamousTechnologistsData.TECHNOLOGIST3_IMAGE,
				FamousTechnologistsData.TECHNOLOGIST3_BACKGROUND,
				FamousTechnologistsData.TECHNOLOGIST3_CURRENT_OPENINGS));
		result.add(new FamousTechnologistsInfo(
				FamousTechnologistsData.TECHNOLOGIST4_NAME,
				FamousTechnologistsData.TECHNOLOGIST4_DESIGNATION,
				FamousTechnologistsData.TECHNOLOGIST4_IMAGE,
				FamousTechnologistsData.TECHNOLOGIST4_BACKGROUND,
				FamousTechnologistsData.TECHNOLOGIST4_CURRENT_OPENINGS));
		result.add(new FamousTechnologistsInfo(
				FamousTechnologistsData.TECHNOLOGIST1_NAME,
				FamousTechnologistsData.TECHNOLOGIST1_DESIGNATION,
				FamousTechnologistsData.TECHNOLOGIST1_IMAGE,
				FamousTechnologistsData.TECHNOLOGIST1_BACKGROUND,
				FamousTechnologistsData.TECHNOLOGIST1_CURRENT_OPENINGS));
		result.add(new FamousTechnologistsInfo(
				FamousTechnologistsData.TECHNOLOGIST2_NAME,
				FamousTechnologistsData.TECHNOLOGIST2_DESIGNATION,
				FamousTechnologistsData.TECHNOLOGIST2_IMAGE,
				FamousTechnologistsData.TECHNOLOGIST2_BACKGROUND,
				FamousTechnologistsData.TECHNOLOGIST2_CURRENT_OPENINGS));
		result.add(new FamousTechnologistsInfo(
				FamousTechnologistsData.TECHNOLOGIST3_NAME,
				FamousTechnologistsData.TECHNOLOGIST3_DESIGNATION,
				FamousTechnologistsData.TECHNOLOGIST3_IMAGE,
				FamousTechnologistsData.TECHNOLOGIST3_BACKGROUND,
				FamousTechnologistsData.TECHNOLOGIST3_CURRENT_OPENINGS));
		result.add(new FamousTechnologistsInfo(
				FamousTechnologistsData.TECHNOLOGIST4_NAME,
				FamousTechnologistsData.TECHNOLOGIST4_DESIGNATION,
				FamousTechnologistsData.TECHNOLOGIST4_IMAGE,
				FamousTechnologistsData.TECHNOLOGIST4_BACKGROUND,
				FamousTechnologistsData.TECHNOLOGIST4_CURRENT_OPENINGS));

		return result;
	}

}