package week1;

public class SimpleLocation {

    public double latitude;
    public double longitude;

    public SimpleLocation(){
        this.latitude = 32.9;
        this.longitude = -117.2;
    }

    public SimpleLocation(double lat, double lon){
        this.latitude = lat;
        this.longitude = lon;
    }

    public double distance(SimpleLocation other){
        //placeholder return statement
        return 0.00;
    }

    public double distance(double otherLat, double otherLon){
        //placeholder return statement
        return 0.00;
    }

}
