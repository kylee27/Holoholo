public class retailer {
    private static int retailerID = 0;
    private String name = "";
    private String[] location = {"", ""}; //{floor, shop position} e.g. {"G", "G04"}
    private double[] centreGPS = {0, 0}; //latitude and longitude at the centre of the store
    private double range = 0.0001;
    
    public retailer(String name) {
        this.name = name;
        retailerID++;
    }

    public int getRetailerID() {
        return retailerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getLocation() {
        return location;
    }

    public void setLocation(String[] location) {
        this.location = location;
    }

    public double[] getCentreGPS() {
        return centreGPS;
    }

    public void setCentreGPS(double[] centreGPS) {
        this.centreGPS = centreGPS;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range){
        this.range = range;
    }
}
