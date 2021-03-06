package com.zeoflow.anidero.sample;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.zeoflow.anidero.AnideroAnimationView;
import com.zeoflow.compat.ActivityCore;

public class MainActivity extends ActivityCore
{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnideroAnimationView zAnideroAnimationView = findViewById(R.id.zAnideroAnimationView);

        zAnideroAnimationView.setAnimation("animation.json");
        zAnideroAnimationView.playAnimation();
        zAnideroAnimationView.setSpeed(1f);

    }
}
