import java.util.ArrayList;
import java.util.List;

public class user {
    private static int userID = 0;
    private String name = "";
    private int points = 0;
    private String answer = "";
    private List<Integer> completedMissionID = new ArrayList<>();
    private List<Integer> assignedMissionID = new ArrayList<>();
    private double[] GPS = {0, 0}; //latitude and longtitude

    public user(String name) {
        this.name = name;
        userID++;
    }

    public int getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void changePoints(int change) {
        points += change;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void addCompletedMission(int missionID) {
        completedMissionID.add(missionID);
        assignedMissionID.remove(missionID);
    }

    public boolean checkCompletedMission(int missionID) {
        return completedMissionID.contains(missionID);
    }

    public void addAssignedMission(int missionID) {
        assignedMissionID.add(missionID);
    }

    public boolean checkAssignedMission(int missionID) {
        return assignedMissionID.contains(missionID);
    }

    public double[] getGPS() {
        return GPS;
    }

    public void setGPS(double[] GPS) {
        this.GPS = GPS;
    }
}
