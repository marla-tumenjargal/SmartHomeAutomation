public class Thermostat implements SmartDevice {
    private int currentTemperature;
    private int targetTemperature;
    private boolean isOn;

    public Thermostat(int currentTemperature, int targetTemperature) {
        this.currentTemperature = currentTemperature;
        this.targetTemperature = targetTemperature;
    }

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    @Override
    public String getStatus() {
        if (isOn == true) {
            return "The thermostat is on";
        }
        return "The thermostat is off";
    }

    void setTemperature(int temperature) {
        targetTemperature = temperature;
    }
}
