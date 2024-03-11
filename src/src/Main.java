
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmartHomeController smartHomeController = new SmartHomeController();

        while (true) {
            System.out.println("Welcome to the Smart Home Automation System! Please select an option: \n 1. Add a new smart device \n 2. Turn on a device \n 3. Turn off a device \n 4. Adjust device settings \n 5. Exit ");
            System.out.println("Your choice");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Select the type of device to add: \n 1. Light \n 2. Thermostat \n 3. Security Camera");
                    int addDeviceType = scanner.nextInt();
                    scanner.nextLine();

                    switch (addDeviceType) {
                        case 1:
                            System.out.print("Enter brightness level (1-10): ");
                            int userBrightnessLevel = scanner.nextInt();
                            System.out.print("Enter light color: ");
                            String userLightColor = scanner.next();
                            Light light = new Light(userBrightnessLevel, userLightColor);
                            light.adjustBrightness(userBrightnessLevel);
                            smartHomeController.addDevice(light);
                            System.out.println("Light added successfully.");
                            break;

                        case 2:
                            System.out.print("Enter current temperature: ");
                            int userCurrentTemperature = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter target temperature: ");
                            int userTargetTemperature = scanner.nextInt();
                            scanner.nextLine();
                            Thermostat thermostat = new Thermostat(userCurrentTemperature, userTargetTemperature);
                            smartHomeController.addDevice(thermostat);
                            System.out.println("Thermostat added successfully.");
                            break;

                        case 3:
                            System.out.print("Enter camera resolution (e.g., 1080p): ");
                            int userCameraResolution = scanner.nextInt();
                            SecurityCamera camera = new SecurityCamera(userCameraResolution);
                            smartHomeController.addDevice(camera);
                            System.out.println("Security Camera added successfully.");
                            break;

                        default:
                            System.out.println("Invalid input. Please try again.");
                    }

                case 2:
                    System.out.println("Select a device to turn on: \n 1. Light \n 2. Thermostat \n 3. Security Camera");
                    int userDeviceOnChoice = scanner.nextInt();
                    scanner.nextLine();

                case 3:
                    System.out.println("Select the device turn off: \n 1. Light \n 2. Thermostat \n 3. Security Camera");
                    int userDeviceOffChoice = scanner.nextInt();
                    scanner.nextLine();

                case 4:
                    System.out.println("Select the device to adjust: \n 1. Light \n 2. Thermostate \n 3. Security Camera");
                    int userDeviceAdjustChoice = scanner.nextInt();
                    scanner.nextLine();

                    switch (userDeviceAdjustChoice) {
                        case 1:
                            System.out.println("Enter the new brightness level: ");
                            int userLightChoice = scanner.nextInt();
                            System.out.println("Enter the new color: ");
                            String userColorChoice = scanner.next();
                            System.out.println("Light settings adjusted.");

                        case 2:
                            System.out.println("Enter the new target temperature: ");
                            int userTargetTemperature = scanner.nextInt();
                            System.out.println("Thermostat settings adjusted.");

                        case 3:
                            System.out.println("Select an option: \n 1. Start recording \n 2. Stop recording");
                            int userSecurityCameraChoice = scanner.nextInt();

                            switch (userSecurityCameraChoice) {
                                case 1:
                                    System.out.println("Security camera recording started");
                                case 2:
                                    System.out.println("Security cameria recording stopped. ");
                            }
                    }

                case 5:
                    System.exit(0);

                default:
                    System.out.println("The details you have entered are incorrect. Please try again. ");
            }
        }
    }
}
