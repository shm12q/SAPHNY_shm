package com.example.shm_msi.saphny_shm.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

import com.example.shm_msi.saphny_shm.R;

public class RegisterActivity extends AppCompatActivity  implements View.OnClickListener {
    private Button bt_register_re, bt_register_fanhui;
    private EditText et_yonghuming, et_register_mima, et_telephone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_register);
        init();
    }

    private void init() {
        bt_register_fanhui = (Button) findViewById(R.id.bt_register_fanhui);
        bt_register_fanhui.setOnClickListener(this);
        bt_register_re = (Button) findViewById(R.id.bt_register_re);
        bt_register_re.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_register_fanhui:
                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}
