package com.sample.range;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.naver.maps.geometry.LatLng;
import com.naver.maps.geometry.Utmk;
import com.naver.maps.map.MapFragment;
import com.naver.maps.map.NaverMap;
import com.naver.maps.map.OnMapReadyCallback;
import com.naver.maps.map.UiSettings;
import com.naver.maps.map.overlay.Marker;
import com.naver.maps.map.util.FusedLocationSource;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MapFragment mapFragment= (MapFragment)getSupportFragmentManager().findFragmentById(R.id.map);//지도 객체 생성

        if (mapFragment == null) {
            mapFragment = MapFragment.newInstance();
            getSupportFragmentManager().beginTransaction().add(R.id.map, mapFragment).commit();

        }
        mapFragment.getMapAsync(this);

//        Utmk utmk = new Utmk(953935,1952044.1);
//        LatLng latLng = utmk.toLatLng();
//
//        Toast.makeText(this,"위도: "+latLng.latitude + "경도: " +latLng.longitude,
//                Toast.LENGTH_LONG).show();//들어갔을때 위도 경도 표시


    }


    @Override
    public void onMapReady(@NonNull NaverMap naverMap) {
        Marker marker2 = new Marker();
        marker2.setPosition(new LatLng(37.763695, 126.281796));
        marker2.setMap(naverMap);

        naverMap.setOnMapClickListener((point, coord)->  //지도 화면클릭시
                Toast.makeText(this, getString(R.string.format_map_click, coord.latitude, coord.longitude), Toast.LENGTH_SHORT).show());

//        FusedLocationSource locationSource = new FusedLocationSource(this, 100);
//        naverMap.setLocationSource(locationSource);
//        UiSettings uiSettings = naverMap.getUiSettings();
//        uiSettings.setLocationButtonEnabled(true);

    }
}