package com.example.retrofitapp;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    public BookRepository bookRepository;
    public Button btnGoToAdd;
    public ListView lwBooks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        btnGoToAdd = findViewById(R.id.btnGotoAdd);
        lwBooks = findViewById(R.id.lwBooks);

        AppComponent appComponent ;
    }
}