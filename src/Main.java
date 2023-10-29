import AbstractFactory.DeviceFactory;
import DevicesFactory.HyperxFactory;
import DevicesFactory.LogitechFactory;
import DevicesFactory.RazerFactory;

public class Main {
    public static void main(String[] args) {
        DeviceFactory logitechFactory = new LogitechFactory();
        DeviceFactory razerFactory = new RazerFactory();
        DeviceFactory hyperxFactory = new HyperxFactory();

        logitechFactory.createMouse();
        logitechFactory.createKeyboard();
        logitechFactory.createHeadphones();

        System.out.println();

        razerFactory.createMouse();
        razerFactory.createKeyboard();
        razerFactory.createHeadphones();

        System.out.println();

        hyperxFactory.createMouse();
        hyperxFactory.createKeyboard();
        hyperxFactory.createHeadphones();

    }
}
