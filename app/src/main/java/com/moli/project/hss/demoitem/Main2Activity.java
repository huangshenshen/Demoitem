package com.moli.project.hss.demoitem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.AbsCallback;
import com.lzy.okgo.callback.StringCallback;

import okhttp3.Call;
import okhttp3.Response;

public class Main2Activity extends AppCompatActivity {
    String url="http://api.jisuapi.com/iqa/query?appkey= 6988c84de528898a&question=郑州天气";
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv = (TextView) findViewById(R.id.tv);
        newWork();
    }
    private void newWork(){
        OkGo.get(url).execute(new StringCallback() {
            @Override
            public void onSuccess(String s, Call call, Response response) {
                tv.setText("字符串是"+s+"反应的"+response.toString());
               Log.i("aaa","字符串是"+s+"反应的"+response.toString());
            }
        });
    }
}
