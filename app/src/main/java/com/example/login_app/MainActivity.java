package com.example.login_app;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText editText1, editText2;
    private Button button;
    private TextView txtV1, txtV2;

    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        button = findViewById(R.id.button);
        txtV1 = findViewById(R.id.textView2);
        txtV2 = findViewById(R.id.textView);


        button.setBackground(getDrawable(R.drawable.before_changed_btn));

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        editText1.addTextChangedListener(new TextWatcher(){
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!editText1.getText().toString().equals("") && !editText2.getText().toString().equals("")) {
                    button.setBackground(getDrawable(R.drawable.before_changed_btn));
                } else {
                    button.setBackground(getDrawable(R.drawable.before_changed_btn));
                }
            }
        });

            {
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (editText1.getText().toString().equals("admin@gmail.com") && editText2.getText().toString().equals("admin")) {
                            editText1.animate().alpha(0);
                            editText2.animate().alpha(0);
                            button.animate().alpha(0);
                            txtV1.animate().alpha(0);
                            txtV2.animate().alpha(0);
                        } else {
                            Toast.makeText(MainActivity.this, "Неверный пароль!", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        }

    public void onClick(View view) {
    }
}
