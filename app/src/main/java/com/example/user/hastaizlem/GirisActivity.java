package com.example.user.hastaizlem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;

public class GirisActivity extends AppCompatActivity {

    private Button giris,iptal;
    private EditText kullaniciAdi,sifre;
    private RequestQueue requestQueue;
    private static final String URL="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris);
    }
}
