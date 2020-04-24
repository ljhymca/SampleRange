package com.sample.range;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MapFragment mapFragment= (MapFragment)getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }
    @Override
    public void OnMapReady(@NonNull NaverMap naverMap) {
        //FusedLocationSource locationSource = new FusedLocationSource{};
        //naverMap.setLocationSource(locationSource);
        //UiSettings uiSettings = naverMap.getUiSettings();
        //uiSettings.setLocationButtonEnable(true);
    }
}
