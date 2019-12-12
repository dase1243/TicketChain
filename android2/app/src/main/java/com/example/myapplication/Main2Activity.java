package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;
import org.web3j.crypto.ECDSASignature;
import org.web3j.crypto.ECKeyPair;
import org.web3j.crypto.Keys;

import java.math.BigInteger;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Main2Activity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String s = intent.getStringExtra("url");
        final ImageView imageView = findViewById(R.id.status);

        String addressRecovered = null;
        boolean match = false;
        String pas = "password";
        String owner = "";
        Sign user = new Sign();
        user.setSignature(s);
        user.setTokenId("11");
        NetworkService.getInstance()
                .getJSONApi()
                .postData(user)
                .enqueue(new Callback<Example>() {
                    @Override
                    public void onResponse(@NonNull Call<Example> call, @NonNull Response<Example> response) {
                        Example post = response.body();
                        if(post.getValid()) {
                            imageView.setImageDrawable(getDrawable(R.drawable.ok));
                        }
                    }

                    @Override
                    public void onFailure(@NonNull Call<Example> call, @NonNull Throwable t) {


                        t.printStackTrace();
                    }
                });





    }
}
