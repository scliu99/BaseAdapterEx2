package com.example.cafeburger.baseadapterex1;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import java.io.ByteArrayOutputStream;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Button ok = findViewById(R.id.ok);
        Button cancel = findViewById(R.id.cancel);



        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        String description = intent.getStringExtra("description");
        byte[] imageBytes =intent.getByteArrayExtra("image");
        Bitmap bmp = BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.length);

        final EditText etName = findViewById(R.id.name);
        final EditText etDescription = findViewById(R.id.description);
        final ImageView ivImage = findViewById(R.id.image);

        etName.setText(name);
        etDescription.setText(description);
        ivImage.setImageBitmap(bmp);


        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.putExtra("name", etName.getText().toString());
                intent.putExtra("description",etDescription.getText().toString());
                Bitmap bmp = ((BitmapDrawable)ivImage.getDrawable()).getBitmap();
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
                byte[] byteArray = stream.toByteArray();


                intent.putExtra("image",byteArray);
                setResult(RESULT_OK,intent);
                finish();
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(RESULT_CANCELED);
            }
        });


    }
}
