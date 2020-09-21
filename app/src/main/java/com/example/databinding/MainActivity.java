package com.example.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private User user;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        user = new User("Ionut","Grigore");
        binding.setUser(user);

    }

    public void onClickChange(View v)
    {
        user.firstName = "I clicked the text";
        Log.d("aa",user.firstName);
        binding.setUser(user);
    }
}