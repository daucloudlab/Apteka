package kz.abcsoft.apteka.map;

/**
 * Created by daulet on 6/4/15.
 */
public class MapObjectsCoord {
    private String objectName ;
    private double longitude ;
    private double latitude ;

    public MapObjectsCoord(){}
    public MapObjectsCoord(String objectName, double longitude, double latitude)
    {
        this.objectName = objectName ;
        this.longitude = longitude ;
        this.latitude = latitude ;
    }

    public String getObjectName(){
        return objectName ;
    }

    public void setObjectName(String objectName){
        this.objectName = objectName ;
    }

    public double getLongitude(){
        return longitude ;
    }

    public void setLongitude(double longitude){
        this.longitude = longitude ;
    }

    public double getLatitude(){
        return latitude ;
    }

    public void setLatitude(double latitude){
        this.latitude = latitude ;
    }
}
