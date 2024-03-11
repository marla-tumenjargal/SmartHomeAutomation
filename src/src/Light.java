public class Light implements SmartDevice {
    private int brightness;
    private String color;
    private boolean isOn;

    public Light(int brightness, String color) {
        this.brightness = brightness;
        this.color = color;
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
            return "The lights are on";
        }
        return "The lights are off";
    }

    void adjustBrightness(int level) {
        brightness = level;
    }
}
