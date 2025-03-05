/*
Phoenix Systems is a well known computer hardware store located in L.A., California. The manager of
the store wishes to develop a software through which he can store and view data about the hardware
devices that he sells. The manager has hired a programmer to develop the software. The programmer
has written the following class to store and view details about the devices:

The program is giving compilation errors and not functioning as expected. Modify the program as
follows:
• The user should be able to specify all details about a device at a time.
• The user should be able to specify only deviceNo and devicePrice when needed.
• The variables should not be accessible outside the class.
• The program should display all details of a device properly even when some details are not
provided.
 */


    class PhoenixSystems {

        private int deviceNo;
        private String deviceName;
        private String deviceType;
        double devicePrice;

        PhoenixSystems(int deviceNo, String deviceName, String deviceType, double devicePrice) {
            this.deviceName = deviceName;
            this.deviceNo = deviceNo;
            this.deviceType = deviceType;
            this.devicePrice = devicePrice;
        }

        PhoenixSystems(int deviceNo, String deviceType) {
            this.deviceNo = deviceNo;
            this.deviceType = deviceType;
        }

        void someDetails() {
            System.out.println("Device No: " + deviceNo);
            System.out.println("Device Type: " + deviceType);
        }

        void displayDetails() {
            System.out.println("Device No: " + deviceNo);
            System.out.println("Device Name: " + deviceName);
            System.out.println("Device Type: " + deviceType);
            System.out.println("Device Price: " + devicePrice);
        }
    }
         public class Device {
            public static void main(String[] args) {
                PhoenixSystems phoenixSystems = new PhoenixSystems(101,"Mobile Phone","Android",10000);
                new PhoenixSystems(101,"Android");
                System.out.println("All Details of Device");
                phoenixSystems.displayDetails();
                System.out.println("Only Device Type and Device No");
                phoenixSystems.someDetails();
            }
        }


