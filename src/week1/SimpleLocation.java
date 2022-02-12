package week1;

public class SimpleLocation {

    private double latitude;
    private double longitude;

    public double getLatitude(){
        return this.latitude;
    }

    public void setLatitude(double latitude){
        if(latitude < -180 || latitude > 180){
            System.out.println("Illegal value. Must be between -180 and 180.");
        }
        else{
            this.latitude = latitude;
        }
    }

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
