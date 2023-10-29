package DevicesFactory;

import AbstractFactory.DeviceFactory;

import DevicesInterfaces.Headphones;
import DevicesInterfaces.Keyboard;
import DevicesInterfaces.Mouse;

import RazerDevices.RazerHeadphones;
import RazerDevices.RazerKeyboard;
import RazerDevices.RazerMouse;

public class RazerFactory implements DeviceFactory {
    @Override
    public Keyboard createKeyboard() {
        return new RazerKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new RazerMouse();
    }

    @Override
    public Headphones createHeadphones() {
        return new RazerHeadphones();
    }
}
