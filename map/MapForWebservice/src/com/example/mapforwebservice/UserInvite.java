package com.example.mapforwebservice;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.onekeyshare.OnekeyShare;

public class UserInvite extends Activity {
	private LinearLayout shortmsgLayout;
	private LinearLayout otherLayout;
	private String Str="������Ա������ - ��Ա��������  www.kezhu.com";
	private TextView inviteCode;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.user_invite);

		//
		shortmsgLayout = (LinearLayout) findViewById(R.id.shortmsgLayout);
		User_information.changeBackground(shortmsgLayout);
		shortmsgLayout.setOnClickListener(new OnClickListener() {
			// ���ŷ���
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Uri smsToUri = Uri.parse("smsto:");
				Intent intent = new Intent(Intent.ACTION_SENDTO, smsToUri);
				intent.putExtra("sms_body", Str);
				startActivity(intent);
			}
		});
		
		otherLayout = (LinearLayout) findViewById(R.id.otherLayout);
		User_information.changeBackground(otherLayout);
		otherLayout.setOnClickListener(new OnClickListener() {
			// ������ʽ����
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showShare();
			}
		});

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
	}
	private void showShare() {
        ShareSDK.initSDK(this);
        OnekeyShare oks = new OnekeyShare();
        //�ر�sso��Ȩ
        oks.disableSSOWhenAuthorize();
        // ����ʱNotification��ͼ�������
        oks.setNotification(R.drawable.ic_launcher, getString(R.string.app_name));
        // title���⣬ӡ��ʼǡ����䡢��Ϣ��΢�š���������QQ�ռ�ʹ��
        oks.setTitle(getString(R.string.share));
        // titleUrl�Ǳ�����������ӣ�������������QQ�ռ�ʹ��
        oks.setTitleUrl("http://www.kezhu.com");
        // text�Ƿ����ı�������ƽ̨����Ҫ����ֶ�
        oks.setText(Str);
        // imagePath��ͼƬ�ı���·����Linked-In�����ƽ̨��֧�ִ˲���
        oks.setImagePath("/sdcard/test.jpg");
        // url����΢�ţ��������Ѻ�����Ȧ����ʹ��
        oks.setUrl("http://www.kezhu.com");
        // comment���Ҷ�������������ۣ�������������QQ�ռ�ʹ��
        oks.setComment("���������ı�");
        // site�Ƿ�������ݵ���վ���ƣ�����QQ�ռ�ʹ��
        oks.setSite(getString(R.string.app_name));
        // siteUrl�Ƿ�������ݵ���վ��ַ������QQ�ռ�ʹ��
        oks.setSiteUrl("http://www.kezhu.com");

        // ��������GUI
        oks.show(this);
   }
}
