package com.example.mapforwebservice;

import android.os.Handler;
import android.os.Message;

public class MyThread implements Runnable{
public void run(Handler handler) {
// TODO Auto-generated method stub
while (true) {
try {
Thread.sleep(10000);//�߳���ͣ10�룬��λ����
Message message=new Message();
message.what=1;
handler.sendMessage(message);//������Ϣ
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
}

@Override
public void run() {
	// TODO Auto-generated method stub
	
}
}
