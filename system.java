import java.util.ArrayList;

public class system {
    
    private ArrayList<user> userList;
    private ArrayList<mission> missionList;
    private ArrayList<retailer> retailerList;
    private ArrayList<reward> rewardList;

    public system() {
        userList = new ArrayList<user>();
        retailerList = new ArrayList<retailer>();
        missionList = new ArrayList<mission>();
        rewardList = new ArrayList<reward>();
    }

    public void addUser(String name) {
        name = (name==null)? "New User" : name;
        userList.add(new user(name));
    }

    public void addRetailer(String name) {
        retailerList.add(new retailer(name));
    }

    public void addMission(String desc, int retailerID, int points, String answer) {
        missionList.add(new mission(desc, retailerID, points, answer));
    }

    public void addReward(String desc, int retailerID, int points) {
        rewardList.add(new reward(desc, retailerID, points));
    }

    public int genMissionID(int userID) {
        double[] userGPS = userList.get(userID).getGPS();
        for (int i=0; i < missionList.size(); i++) {
            if (!userList.get(userID).checkCompletedMission(i) && !userList.get(userID).checkAssignedMission(i)) {
                double[] retailerGPS = retailerList.get(missionList.get(i).getRetailerID()).getCentreGPS();
                double range = retailerList.get(missionList.get(i).getRetailerID()).getRange();
                if (((retailerGPS[0] - userGPS[0]) < range || (userGPS[0] - retailerGPS[0]) < range)
                && ((retailerGPS[1] - userGPS[1]) < range || (userGPS[1] - retailerGPS[1]) < range)) {
                    return i;
                }
            }
        }
        return -1; //completed all missions in the database

    }

    public void assignMissionToUser(int userID, int missionID) {
        userList.get(userID).addAssignedMission(missionID);
    }

    public void checkAnswer(int userID, int missionID, String submitted) {
        if (submitted == missionList.get(missionID).getAnswer()) {
            int points = missionList.get(missionID).getPoints();
            userList.get(userID).changePoints(points);
            userList.get(userID).addCompletedMission(missionID);
        }
    }

}
