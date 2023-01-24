package com.carylsantiago.fundandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Camera extends AppCompatActivity {

    private static final int CAMERA_REQUEST = 1888;
    ImageView image;
    Button btnCamera, btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        image = findViewById(R.id.display);
        btnCamera = findViewById(R.id.btnCam);
        btnBack = findViewById(R.id.btnHome);

        btnCamera.setOnClickListener(view -> cameraSnap());
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    public void cameraSnap(){
        Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityIfNeeded(i, CAMERA_REQUEST);
    }


    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap bp =(Bitmap)data.getExtras().get("data");
        image.setImageBitmap(bp);
        image.setRotation(0);
    }
}