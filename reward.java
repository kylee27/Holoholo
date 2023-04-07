public class reward {
    private static int rewardID = 0;
    private String description = "";
    private int retailerID = 0;
    private int points = 0;

    public reward(String desc, int retailerID, int points) {
        description = desc;
        this.retailerID = retailerID;
        this.points = points;
        rewardID++;
    }

    public int getRewardID() {
        return rewardID;
    }

    public String getDesc() {
        return description;
    }

    public void setDesc(String desc) {
        description = desc;
    }

    public int getRetailerID() {
        return retailerID;
    }

    public void setRetailerID(int retailerID) {
        this.retailerID = retailerID;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
