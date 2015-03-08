package com.example.womenhackathon;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.R;
import com.example.dataHolders.ProjectsDetails;
import com.example.utility.IntentFields;
import com.example.utility.ViewProjectsData;

public class ViewProjects extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		final List<ProjectsDetails> details = getDetailsOfProjects();

		LayoutInflater inflater = (LayoutInflater) ViewProjects.this
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

		final ListView lv1 = (ListView) getListView();
		lv1.setAdapter(new ProjectsAdapter(this, details));

		lv1.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				try {
					Class cls = Class
							.forName("com.example.fullScreenHandlers.ViewProjectsAndRate");
					Intent ourIntent = new Intent(arg1.getContext(), cls);
					final ProjectsDetails data = details.get(arg2);

					ourIntent.putExtra(IntentFields.PROJECT_TITLE, data.getTitle());
					ourIntent.putExtra(IntentFields.PROJECT_TAG,
							data.getTags());
					ourIntent.putExtra(IntentFields.PROJECT_RATING,
							data.getRatings());
					ourIntent.putExtra(IntentFields.PROJECT_DESCRIPTION,
							data.getDescription());
					ourIntent.putExtra(IntentFields.PROJECT_COMMENT, data.getComments());

					startActivity(ourIntent);

				} catch (ClassNotFoundException ex) {
					ex.printStackTrace();
				}
			}
		});
	}

	private List<ProjectsDetails> getDetailsOfProjects() {

		List<ProjectsDetails> details = new ArrayList<ProjectsDetails>();
		details.add(new ProjectsDetails(ViewProjectsData.PROJECT1_NAME,
				ViewProjectsData.PROJECT1_TAG,
				ViewProjectsData.PROJECT1_DESCRIPTION,
				ViewProjectsData.PROJECT1_COMMENT,
				ViewProjectsData.PROJECT1_RATING));
		details.add(new ProjectsDetails(ViewProjectsData.PROJECT2_NAME,
				ViewProjectsData.PROJECT2_TAG,
				ViewProjectsData.PROJECT2_DESCRIPTION,
				ViewProjectsData.PROJECT2_COMMENT,
				ViewProjectsData.PROJECT2_RATING));
		details.add(new ProjectsDetails(ViewProjectsData.PROJECT1_NAME,
				ViewProjectsData.PROJECT1_TAG,
				ViewProjectsData.PROJECT1_DESCRIPTION,
				ViewProjectsData.PROJECT1_COMMENT,
				ViewProjectsData.PROJECT1_RATING));
		details.add(new ProjectsDetails(ViewProjectsData.PROJECT2_NAME,
				ViewProjectsData.PROJECT2_TAG,
				ViewProjectsData.PROJECT2_DESCRIPTION,
				ViewProjectsData.PROJECT2_COMMENT,
				ViewProjectsData.PROJECT2_RATING));
		details.add(new ProjectsDetails(ViewProjectsData.PROJECT1_NAME,
				ViewProjectsData.PROJECT1_TAG,
				ViewProjectsData.PROJECT1_DESCRIPTION,
				ViewProjectsData.PROJECT1_COMMENT,
				ViewProjectsData.PROJECT1_RATING));
		details.add(new ProjectsDetails(ViewProjectsData.PROJECT2_NAME,
				ViewProjectsData.PROJECT2_TAG,
				ViewProjectsData.PROJECT2_DESCRIPTION,
				ViewProjectsData.PROJECT2_COMMENT,
				ViewProjectsData.PROJECT2_RATING));
		details.add(new ProjectsDetails(ViewProjectsData.PROJECT1_NAME,
				ViewProjectsData.PROJECT1_TAG,
				ViewProjectsData.PROJECT1_DESCRIPTION,
				ViewProjectsData.PROJECT1_COMMENT,
				ViewProjectsData.PROJECT1_RATING));
		details.add(new ProjectsDetails(ViewProjectsData.PROJECT2_NAME,
				ViewProjectsData.PROJECT2_TAG,
				ViewProjectsData.PROJECT2_DESCRIPTION,
				ViewProjectsData.PROJECT2_COMMENT,
				ViewProjectsData.PROJECT2_RATING));
		details.add(new ProjectsDetails(ViewProjectsData.PROJECT1_NAME,
				ViewProjectsData.PROJECT1_TAG,
				ViewProjectsData.PROJECT1_DESCRIPTION,
				ViewProjectsData.PROJECT1_COMMENT,
				ViewProjectsData.PROJECT1_RATING));
		details.add(new ProjectsDetails(ViewProjectsData.PROJECT2_NAME,
				ViewProjectsData.PROJECT2_TAG,
				ViewProjectsData.PROJECT2_DESCRIPTION,
				ViewProjectsData.PROJECT2_COMMENT,
				ViewProjectsData.PROJECT2_RATING));
		details.add(new ProjectsDetails(ViewProjectsData.PROJECT1_NAME,
				ViewProjectsData.PROJECT1_TAG,
				ViewProjectsData.PROJECT1_DESCRIPTION,
				ViewProjectsData.PROJECT1_COMMENT,
				ViewProjectsData.PROJECT1_RATING));
		details.add(new ProjectsDetails(ViewProjectsData.PROJECT2_NAME,
				ViewProjectsData.PROJECT2_TAG,
				ViewProjectsData.PROJECT2_DESCRIPTION,
				ViewProjectsData.PROJECT2_COMMENT,
				ViewProjectsData.PROJECT2_RATING));
		details.add(new ProjectsDetails(ViewProjectsData.PROJECT1_NAME,
				ViewProjectsData.PROJECT1_TAG,
				ViewProjectsData.PROJECT1_DESCRIPTION,
				ViewProjectsData.PROJECT1_COMMENT,
				ViewProjectsData.PROJECT1_RATING));
		details.add(new ProjectsDetails(ViewProjectsData.PROJECT2_NAME,
				ViewProjectsData.PROJECT2_TAG,
				ViewProjectsData.PROJECT2_DESCRIPTION,
				ViewProjectsData.PROJECT2_COMMENT,
				ViewProjectsData.PROJECT2_RATING));
		details.add(new ProjectsDetails(ViewProjectsData.PROJECT1_NAME,
				ViewProjectsData.PROJECT1_TAG,
				ViewProjectsData.PROJECT1_DESCRIPTION,
				ViewProjectsData.PROJECT1_COMMENT,
				ViewProjectsData.PROJECT1_RATING));
		details.add(new ProjectsDetails(ViewProjectsData.PROJECT2_NAME,
				ViewProjectsData.PROJECT2_TAG,
				ViewProjectsData.PROJECT2_DESCRIPTION,
				ViewProjectsData.PROJECT2_COMMENT,
				ViewProjectsData.PROJECT2_RATING));
		return details;
	}

	private class ProjectsAdapter extends BaseAdapter {

		List<ProjectsDetails> data;
		LayoutInflater layoutInflater;

		public ProjectsAdapter(Context aContext, List<ProjectsDetails> details) {
			this.data = details;
			layoutInflater = LayoutInflater.from(aContext);
		}

		@Override
		public int getCount() {
			return data.size();
		}

		@Override
		public Object getItem(int arg0) {
			return data.get(arg0);
		}

		@Override
		public long getItemId(int arg0) {
			return 0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup arg2) {
			ProjectsDetails holder;

			if (convertView == null) {

				/**
				 * Here you give the reference of the XML used for Each custom
				 * Item of the list
				 */
				convertView = layoutInflater.inflate(
						R.layout.view_projects_each_item, null, true);
			}

			TextView title = (TextView) convertView
					.findViewById(R.id.postTitle);
			TextView tags = (TextView) convertView.findViewById(R.id.tags);
			TextView description = (TextView) convertView
					.findViewById(R.id.postdescription);

			holder = data.get(position);

			title.setText(holder.getTitle());
			tags.setText(holder.getTags());
			description.setText(holder.getDescription());

			convertView.setTag(holder);

			return convertView;
		}
	}
}
