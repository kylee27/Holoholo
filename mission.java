public class mission {
    private static int missionID = 0;
    private String description = "";
    private int retailerID = 0;
    private int points = 0;
    private String answer = "";

    public mission(String desc, int retailerID, int points, String answer) {
        description = desc;
        this.retailerID = retailerID;
        this.points = points;
        this.answer = answer;
        missionID++;
    }

    public int getMissionID() {
        return missionID;
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

    public String getAnswer() {
        return answer;
    }
    
    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
