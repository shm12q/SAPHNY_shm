package com.example.shm_msi.saphny_shm.View;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import com.example.shm_msi.saphny_shm.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
  private Button bt_login, bt_register;
  private EditText et_login, et_mima;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
    setContentView(R.layout.activity_login);
    init();
  }

  private void init() {
    bt_login = (Button) findViewById(R.id.bt_login);
    bt_register = (Button) findViewById(R.id.bt_register);
    et_login = (EditText) findViewById(R.id.et_login);
    et_mima = (EditText) findViewById(R.id.et_mima);
    bt_login.setOnClickListener(this);
    bt_register.setOnClickListener(this);
  }

  @Override
  public void onClick(View view) {
    switch (view.getId()) {
      case R.id.bt_register:
        Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
        startActivity(intent);
        break;
      case R.id.bt_login:
        Intent intent1 = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(intent1);
//                MediaType mediaType = MediaType.parse("text/x-markdown; charset=utf-8");
//                RequestBody body=new FormBody.Builder()
//                        .add("userid", "hys")
//                        .add("password", "123456")
//                        .build();
//                Request request = new Request.Builder()
//                        .url("http://localhost/.php")
//                        .post(body)
//                        .build();
//                OkHttpClient okHttpClient = new OkHttpClient();
//                okHttpClient.newCall(request).enqueue(new Callback() {
//                    @Override
//                    public void onFailure(Call call, IOException e) {
//                        runOnUiThread(new Runnable() {
//                            @Override
//                            public void run() {
//                                Toast.makeText(LoginActivity.this,"请求失败",Toast.LENGTH_SHORT)
//                                .show();
//                            }
//                        });
//
//                    }
//
//                    @Override
//                    public void onResponse(Call call, Response response) throws IOException {
//                        if(response.body().toString().equals("1")){
//                            runOnUiThread(new Runnable() {
//                                @Override
//                                public void run() {
//                                    Toast.makeText(LoginActivity.this,"登陆成功",Toast
//                                    .LENGTH_SHORT).show();
//                                    Intent intent1=new Intent(LoginActivity.this,MainActivity
//                                    .class);
//                                    startActivity(intent1);
//                                }
//                            });
//                        }
//                        else{
//                            runOnUiThread(new Runnable() {
//                                @Override
//                                public void run() {
//                                    Toast.makeText(LoginActivity.this,"登陆失败",Toast
//                                    .LENGTH_SHORT).show();
//                                }
//                            });
//                        }
//                    }
//                });


    }
  }
}
