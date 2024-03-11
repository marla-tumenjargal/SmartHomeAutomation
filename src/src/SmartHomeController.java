import java.util.ArrayList;
import java.util.List;

public class SmartHomeController {
    private List<SmartDevice> smartDeviceList;

    public SmartHomeController() {
        this.smartDeviceList = new ArrayList<>();
    }

    public void addDevice(SmartDevice device) {
        smartDeviceList.add(device);
    }

    public void removeDevice(SmartDevice device) {
        smartDeviceList.remove(device);
    }

    public void activateDevice(SmartDevice device) {
        device.turnOn();
    }

    public void deactivateDevice(SmartDevice device) {
        device.turnOff();
    }

    public void checkDeviceStatus(SmartDevice device) {
        System.out.println(device.getStatus());
    }
}
