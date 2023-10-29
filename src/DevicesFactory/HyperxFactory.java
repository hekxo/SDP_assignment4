package DevicesFactory;

import AbstractFactory.DeviceFactory;

import DevicesInterfaces.Headphones;
import DevicesInterfaces.Keyboard;
import DevicesInterfaces.Mouse;

import HyperxDevices.HyperxHeadphones;
import HyperxDevices.HyperxKeyboard;
import HyperxDevices.HyperxMouse;

public class HyperxFactory implements DeviceFactory {
    @Override
    public Keyboard createKeyboard() {
        return new HyperxKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new HyperxMouse();
    }

    @Override
    public Headphones createHeadphones() {
        return new HyperxHeadphones();
    }
}
