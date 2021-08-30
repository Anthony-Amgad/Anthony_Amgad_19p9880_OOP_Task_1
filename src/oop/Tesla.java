package oop;

public class Tesla extends Car{
    private float batteryCapacity;

    public Tesla(String model, float maxSpeed, float batteryCapacity, int speedsNo, int seatsNo) {
        this.batteryCapacity = batteryCapacity;
        this.setModel(model);
        this.setFuelType("Electric");
        this.setMaxSpeed(maxSpeed);
        this.setSeatsNo(seatsNo);
        this.setSpeedsNo(speedsNo);
        this.setAirbags(true);
        this.setAutomatic(true);
        this.setDashCam(true);
        this.setKeyless(true);
    }

    public Tesla(String model, float maxSpeed, float batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
        this.setModel(model);
        this.setFuelType("Electric");
        this.setMaxSpeed(maxSpeed);
        this.setSeatsNo(5);
        this.setSpeedsNo(1);
        this.setAirbags(true);
        this.setAutomatic(true);
        this.setDashCam(true);
        this.setKeyless(true);
    }

    public float getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(float batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String getFuelType() {
        return "The car uses an " + super.getFuelType() + " engine with a battery capacity of " + this.batteryCapacity + "kWh";
    }
}
