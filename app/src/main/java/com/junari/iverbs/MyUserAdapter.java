package com.junari.iverbs;


 import java.util.List;
 import android.app.Activity;
 import android.content.Context;
 import android.view.LayoutInflater;
 import android.view.View;
 import android.view.ViewGroup;
 import android.widget.BaseAdapter;
 import android.widget.ImageView;
 import android.widget.TextView;

 public class MyUserAdapter extends BaseAdapter {

 Context context;
 List<UserItem> rowItem;

 MyUserAdapter(Context context, List<UserItem> rowItem) {
 this.context = context;
 this.rowItem = rowItem;

 }

 @Override
 public int getCount() {

 return rowItem.size();
 }

 @Override
 public Object getItem(int position) {

 return rowItem.get(position);
 }

 @Override
 public long getItemId(int position) {

 return rowItem.indexOf(getItem(position));
 }

 @Override
 public View getView(int position, View convertView, ViewGroup parent) {

 if (convertView == null) {
 LayoutInflater mInflater = (LayoutInflater) context
 .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
 convertView = mInflater.inflate(R.layout.usr_list_row, null);
 }

 ImageView imgIcon = (ImageView) convertView.findViewById(R.id.list_image);
 TextView txtTitle = (TextView) convertView.findViewById(R.id.tvCity);

     UserItem row_pos = rowItem.get(position);
 // setting the image resource and title
 imgIcon.setImageResource(row_pos.getIcon());
 txtTitle.setText(row_pos.getTitle());

 return convertView;
 }

 }