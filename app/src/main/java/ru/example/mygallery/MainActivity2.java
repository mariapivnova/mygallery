package ru.example.mygallery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {
// ещё какой-то метод
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageView img=findViewById(R.id.imageView);
        img.setImageBitmap(ImageHelper.decodeSampleBitmapFromPath(getIntent().getStringExtra("key"),200,200));
    }

}