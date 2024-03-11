public class SecurityCamera implements SmartDevice {
    private int cameraResolution;
    private boolean recordingStatus;
    private boolean isOn;

    public SecurityCamera(int cameraResolution) {
        this.cameraResolution = cameraResolution;
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
            return "Security camera is recording";
        }
        return "Security camera is not recording";
    }

    void startRecording() {
        recordingStatus = true;
    }

    void stopRecording() {
        recordingStatus = false;
    }
}
