package Lesson9_1;

public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;
    private int speed;
    private String mac;

    public Monitor(String manufacturer, float price, String serialNumber) {
        super(manufacturer, price, serialNumber);
    }

    public void EthernetAdapter(int speed, String mac) {
        this.speed = speed;
        this.mac = mac;
    }

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }
}
