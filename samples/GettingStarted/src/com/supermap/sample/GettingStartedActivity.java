package com.supermap.sample;


import com.supermap.android.maps.LayerView;
import com.supermap.android.maps.MapView;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;

public class GettingStartedActivity extends Activity {
	// SuperMap iServer提供的地图采用固定地址传递
	private static final String DEFAULT_URL = "http://support.supermap.com.cn:8090/iserver/services/map-china400/rest/maps/China";
	protected MapView mapView;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 setContentView(R.layout.iclient_android_app);
		 mapView = (MapView) this.findViewById(R.id.mapview);

		LayerView layerView = new LayerView(this);
		layerView.setURL(DEFAULT_URL);

		mapView.setBuiltInZoomControls(true);
		mapView.addLayer(layerView);

	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
	}

}