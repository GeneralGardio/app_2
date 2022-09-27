package com.example.app_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity_criacao extends AppCompatActivity {

    EditText edittxtNome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_criacao);

        //ActivityResultLauncher<PickVisualMediaRequest> pickMedia =
        //registerForActivityResult(new PickVisualMedia(), uri -> {
        // Callback is invoked after the user selects a media item or closes the
        // photo picker.
        // if (uri != null) {
        //  Log.d("PhotoPicker", "Selected URI: " + uri);
        // } else {
        //  Log.d("PhotoPicker", "No media selected");
        // }
        // });

        //pickMedia.launch(new PickVisualMediaRequest.Builder()
        //  .setMediaType(PickVisualMedia.ImageOnly.INSTANCE)
        // .build());



    }
}