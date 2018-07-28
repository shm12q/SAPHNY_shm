package com.example.shm_msi.saphny_shm.Model;


import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by SHM-MSI on 2018/7/28.
 */

public class LoginModel {


    OkHttpClient okHttpClient = new OkHttpClient();
    Request request;
    public LoginModel(){

        String url = "http://localhost/login.php";
        request = new Request.Builder()
                .url(url)
                .get()//默认就是GET请求，可以不写
                .build();
    }

}
