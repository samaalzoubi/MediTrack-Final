package de.fhdo.sama.capstone.model;

public class AGV {
    public enum Status { IDLE, ON_TASK, CHARGING, MAINTENANCE }

    private final String id;
    private final String name;
    private Status status;
    private int batteryLevel;
    private String currentLocation;
    private String currentTask;

    public AGV(String id, String name, Status status, int batteryLevel, String location, String currentTask) {
        this.id = id; this.name = name; this.status = status; this.batteryLevel = batteryLevel;
        this.currentLocation = location; this.currentTask = currentTask;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }
    public int getBatteryLevel() { return batteryLevel; }
    public void setBatteryLevel(int batteryLevel) { this.batteryLevel = batteryLevel; }
    public String getCurrentLocation() { return currentLocation; }
    public void setCurrentLocation(String currentLocation) { this.currentLocation = currentLocation; }
    public String getCurrentTask() { return currentTask; }
    public void setCurrentTask(String currentTask) { this.currentTask = currentTask; }

    public String toDisplayString() {
        String task = (currentTask == null) ? "" : " - " + currentTask;
        return name + " | " + status + " | " + batteryLevel + "% " + task;
    }
}
