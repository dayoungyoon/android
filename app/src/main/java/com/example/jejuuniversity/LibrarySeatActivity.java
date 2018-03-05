package com.example.jejuuniversity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LibrarySeatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library_seat);
        setTitle("도서관 좌석 정보");
    }
}
