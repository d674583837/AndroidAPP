package com.example.mapforwebservice;

import java.util.ArrayList;
import java.util.List;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.AbsListView;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;

public class AboutQuestion extends Activity {
	private List<String> GroupData;// ����������
	private List<List<String>> ChildrenData;// �������е�������

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about_question);
		LoadListDate();
		ImageView returnbtn = (ImageView) findViewById(R.id.returnbtn);
		returnbtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				// Intent intent = new Intent();
				// intent.setClass(detail_information.this, MainActivity.class);
				// startActivity(intent);
				finish();
			}

		});

		ExpandableListView expandableListView1 = (ExpandableListView) findViewById(R.id.expandableListView1);
		expandableListView1.setAdapter(new ExpandableAdapter());
	}

	private class ExpandableAdapter extends BaseExpandableListAdapter {

		@Override
		public int getGroupCount() {
			// TODO Auto-generated method stub
			return GroupData.size();
		}

		@Override
		public int getChildrenCount(int groupPosition) {
			// TODO Auto-generated method stub
			return ChildrenData.get(groupPosition).size();
		}

		@Override
		public Object getGroup(int groupPosition) {
			// TODO Auto-generated method stub
			return GroupData.get(groupPosition);
		}

		@Override
		public Object getChild(int groupPosition, int childPosition) {
			// TODO Auto-generated method stub
			return ChildrenData.get(groupPosition).get(childPosition);

		}

		@Override
		public long getGroupId(int groupPosition) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public long getChildId(int groupPosition, int childPosition) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public boolean hasStableIds() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public View getGroupView(int groupPosition, boolean isExpanded,
				View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			TextView myText = null;
			if (convertView != null) {
				myText = (TextView) convertView;
				myText.setText(GroupData.get(groupPosition));
			} else {
				myText = createView(GroupData.get(groupPosition));
			}
			myText.setTextSize(17);
			myText.setTextColor(Color.rgb(70, 70, 70));
			return myText;
		}

		@Override
		public View getChildView(int groupPosition, int childPosition,
				boolean isLastChild, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			TextView myText = null;
			if (convertView != null) {
				myText = (TextView) convertView;
				myText.setText(ChildrenData.get(groupPosition).get(
						childPosition));
			} else {
				myText = createView(ChildrenData.get(groupPosition).get(
						childPosition));
			}
			myText.setTextSize(16);
			myText.setBackgroundResource(R.color.bgcolor);
			return myText;
		}

		@Override
		public boolean isChildSelectable(int groupPosition, int childPosition) {
			// TODO Auto-generated method stub
			return false;
		}

		private TextView createView(String content) {
			AbsListView.LayoutParams layoutParams = new AbsListView.LayoutParams(
					ViewGroup.LayoutParams.FILL_PARENT,
					ViewGroup.LayoutParams.WRAP_CONTENT);
			TextView myText = new TextView(AboutQuestion.this);
			myText.setLayoutParams(layoutParams);
			myText.setGravity(Gravity.CENTER_VERTICAL | Gravity.LEFT);
			myText.setPadding(30, 30, 30, 30);
			myText.setText(content);
			return myText;
		}
	}

	private void LoadListDate() {
		GroupData = new ArrayList<String>();
		GroupData.add("Q : ���֣������ң���ֵ���ɸ�����֣������ң���ֵ���̼Ҹ���");
		GroupData.add("Q : ���ֺʹ�ֵ�Ĳ�����ʲô��");
		GroupData.add("Q : ���֧����");
		GroupData.add("Q : ��λ�ÿ����ң�");
		GroupData.add("Q : Ϊ��Ҫ�˳���¼��");

		ChildrenData = new ArrayList<List<String>>();
		List<String> Child1 = new ArrayList<String>();
		Child1.add("    �����Ա���֣������ң����ߴ�ֵ���̼����ˣ���������һ�̼Ҹ����Ա�Ļ��֣������ң��������������̼�ʹ�á�"
				+ '\n' + "    ��һ���֣������ң���ת��Ϊ���̼ҵı��ش�ֵ��" + '\n'
				+ "    ��Ա�ʻ��������Ļ��֣������ң����ߴ�ֵ����Ӱ�졣");
		ChildrenData.add(Child1);

		List<String> Child2 = new ArrayList<String>();
		Child2.add("    ����ϵͳ�ڵĻ����趨Ϊ����ͨ��ͨ�ң������ǻ��һ�����ʹ�á��������ǳ�֮�����ҡ�"
				+ '\n'
				+ "    ��ֵ�Ǿ���ģ�ֻ�����̼��趨��ͬϵͳ��λʹ�á�ͬϵͳ��λ������һ��Ͷ�����壬��Աһ��������ֵ��ʱ�򣬾��ܻ�֪��һ��ֵ��ʹ�÷�Χ��"
				+ '\n' + "    ��Ա������������ص��̼ҷֱ�ֵ�Ļ�����������ֵ�Ǹ��Զ����������ŵġ�" + '\n'
				+ "    ��Ա��ͬϵͳ�̼ҵ������̼ҷֱ�ֵ�Ļ�����������ֵ���Ե���ʹ�á�");
		ChildrenData.add(Child2);

		List<String> Child3 = new ArrayList<String>();
		Child3.add("    ��Ա�����ڡ��������ġ�ѡ���̼ҽ��п����һ�ֵ֧������ʱ��Ҫ����֧����"
				+ '\n'
				+ "    Ҳ�����ڡ����֧�������ɶ�̬ƥ���룬���ֻ��źͶ�̬ƥ�����ύ���̼ң���֪�̼�ʹ�ÿ����һ�ֵ�����̼��������ѽ�������֧����");
		ChildrenData.add(Child3);

		List<String> Child4 = new ArrayList<String>();
		Child4.add("    ���������̼Ҷ����Ļ�Ա�ƻ�����Ա�ֽ����ѿɰ����ֱ�����ÿ����ҡ�" + '\n'
				+ "    ʹ�ÿ�������ͬʹ���ֽ�һ����ÿ����ҡ�" + '\n' + "    ʹ�ô�ֵ��Ȳ����������ҡ�");
		ChildrenData.add(Child4);

		List<String> Child5 = new ArrayList<String>();
		Child5.add("    �ڵ�¼״̬�²�������֧�������ɶ�̬ƥ���롣" + '\n' + "    �˳���¼�������Ӱ�ȫ�ԡ�"
				+ '\n' + "    �����ڸ��������˳���¼��");
		ChildrenData.add(Child5);

	}
}
