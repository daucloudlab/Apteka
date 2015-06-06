package kz.abcsoft.apteka.map;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

import kz.abcsoft.apteka.R;

public class MapsActivity extends FragmentActivity {

    ArrayList<MapObjectsCoord> mapObjects ;

    private GoogleMap mMap; // Might be null if Google Play services APK is not available.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        setUpMapIfNeeded();
    }

    @Override
    protected void onResume() {
        super.onResume();
        setUpMapIfNeeded();
    }

    /**
     * Sets up the map if it is possible to do so (i.e., the Google Play services APK is correctly
     * installed) and the map has not already been instantiated.. This will ensure that we only ever
     * call {@link #setUpMap()} once when {@link #mMap} is not null.
     * <p/>
     * If it isn't installed {@link SupportMapFragment} (and
     * {@link com.google.android.gms.maps.MapView MapView}) will show a prompt for the user to
     * install/update the Google Play services APK on their device.
     * <p/>
     * A user can return to this FragmentActivity after following the prompt and correctly
     * installing/updating/enabling the Google Play services. Since the FragmentActivity may not
     * have been completely destroyed during this process (it is likely that it would only be
     * stopped or paused), {@link #onCreate(Bundle)} may not be called again so we should call this
     * method in {@link #onResume()} to guarantee that it will be called.
     */
    private void setUpMapIfNeeded() {
        // Do a null check to confirm that we have not already instantiated the map.
        if (mMap == null) {
            // Try to obtain the map from the SupportMapFragment.
            mMap = ((SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map))
                    .getMap();
            // Check if we were successful in obtaining the map.
            if (mMap != null) {
                setUpMap();
            }
        }
    }

    /**
     * This is where we can add markers or lines, add listeners or move the camera. In this case, we
     * just add a marker near Africa.
     * <p/>
     * This should only be called once and when we are sure that {@link #mMap} is not null.
     */
    private void setUpMap() {
        mMap.addMarker(new MarkerOptions().position(new LatLng(42.31854237, 69.5962429)).title("Marker"));

        mMap.setMyLocationEnabled(true);

        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setCompassEnabled(true);
        mMap.getUiSettings().setMyLocationButtonEnabled(true);

//        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
//        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        //mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);
        //mMap.setMapType(GoogleMap.MAP_TYPE_NONE);

        mMap.addMarker(new MarkerOptions().position(new LatLng(42.31854237, 69.5962429)).title("Аптека"));

        CameraPosition cameraPosition = new CameraPosition.Builder()
                .target(new LatLng(42.31854237, 69.5962429))
                .zoom(12)
                .build() ;
        CameraUpdate cameraUpdate = CameraUpdateFactory.newCameraPosition(cameraPosition) ;
        mMap.animateCamera(cameraUpdate);




//        mapObjects = new ArrayList<MapObjectsCoord>() ;
//        mapObjects.add(new MapObjectsCoord("Аптека 1", 42.31854237, 69.5962429)) ;
//        mapObjects.add(new MapObjectsCoord("Аптека 2", 42.30003979, 69.60808754)) ;
//        mapObjects.add(new MapObjectsCoord("Аптека 3", 42.33751535, 69.57873344)) ;
//        mapObjects.add(new MapObjectsCoord("Аптека 4", 42.33082152, 69.60199356)) ;
//        mapObjects.add(new MapObjectsCoord("Аптека 5", 42.34224184, 69.62353706)) ;
//        mapObjects.add(new MapObjectsCoord("Аптека 6", 42.33532645, 69.63632584)) ;
//        mapObjects.add(new MapObjectsCoord("Аптека 7", 42.34763404, 69.56800461)) ;
//        mapObjects.add(new MapObjectsCoord("Аптека 8", 42.32022415, 69.56731796)) ;
//        mapObjects.add(new MapObjectsCoord("Аптека 9", 42.30841899, 69.60611343)) ;
//        mapObjects.add(new MapObjectsCoord("Аптека 10", 42.32542787, 69.59177971)) ;
//
//        for(MapObjectsCoord m : mapObjects){
//            LatLng cat_monument_position = new LatLng(m.getLongitude(), m.getLatitude());
//            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cat_monument_position,
//                    13));
//
//            mMap.addMarker(new MarkerOptions().title(m.getObjectName())
//                    .snippet("Бла-бла-бла!")
//                    .position(cat_monument_position));
//
//        }

//---------------------------
//        mMap.addMarker(new MarkerOptions().position(new LatLng(0, 0)).title("Marker").snippet("Snippet"));
//
//        // Enable MyLocation Layer of Google Map
//        mMap.setMyLocationEnabled(true);
//
//        // Get LocationManager object from System Service LOCATION_SERVICE
//        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
//
//        // Create a criteria object to retrieve provider
//        Criteria criteria = new Criteria();
//
//        // Get the name of the best provider
//        String provider = locationManager.getBestProvider(criteria, true);
//
//        // Get Current Location
//        Location myLocation = locationManager.getLastKnownLocation(provider);
//
//        // set map type
//        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
//
//        // Get latitude of the current location
//        double latitude = myLocation.getLatitude();
//
//        // Get longitude of the current location
//        double longitude = myLocation.getLongitude();
//
//        // Create a LatLng object for the current location
//        LatLng latLng = new LatLng(latitude, longitude);
//
//        // Show the current location in Google Map
//        mMap.moveCamera(CameraUpdateFactory.newLatLng(latLng));
//
//        // Zoom in the Google Map
//        mMap.animateCamera(CameraUpdateFactory.zoomTo(14));
//        mMap.addMarker(new MarkerOptions().position(new LatLng(latitude, longitude)).title("You are here!").snippet("Consider yourself located"));


    }
}
