package oop;

public class Car {
    private String model, fuelType;
    private float maxSpeed;
    private int speedsNo, seatsNo;
    private boolean airbags, automatic, keyless, dashCam;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getSpeedsNo() {
        return speedsNo;
    }

    public void setSpeedsNo(int speedsNo) {
        this.speedsNo = speedsNo;
    }

    public int getSeatsNo() {
        return seatsNo;
    }

    public void setSeatsNo(int seatsNo) {
        this.seatsNo = seatsNo;
    }

    public boolean isAirbags() {
        return airbags;
    }

    public void setAirbags(boolean airbags) {
        this.airbags = airbags;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    public boolean isKeyless() {
        return keyless;
    }

    public void setKeyless(boolean keyless) {
        this.keyless = keyless;
    }

    public boolean isDashCam() {
        return dashCam;
    }

    public void setDashCam(boolean dashCam) {
        this.dashCam = dashCam;
    }
}
