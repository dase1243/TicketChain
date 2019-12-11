package come.manager.direct.hackuniversity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

import net.glxn.qrgen.android.QRCode;

public class MainActivity  extends AppCompatActivity {

    private final int SPLASH_DISPLAY_LENGHT = 2_000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Bitmap myBitmap = QRCode.from("www.example.org").bitmap();
//        ImageView imageView = findViewById(R.id.logo);
//        imageView.setImageBitmap(myBitmap);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(MainActivity.this, LoginActivity.class);
                MainActivity.this.startActivity(mainIntent);
                MainActivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGHT);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

    }

}
