package DevicesFactory;

import AbstractFactory.DeviceFactory;

import DevicesInterfaces.Headphones;
import DevicesInterfaces.Keyboard;
import DevicesInterfaces.Mouse;

import LogitechDevices.LogitechHeadphones;
import LogitechDevices.LogitechKeyboard;
import LogitechDevices.LogitechMouse;

public class LogitechFactory implements DeviceFactory {
    @Override
    public Keyboard createKeyboard() {
        return new LogitechKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new LogitechMouse();
    }

    @Override
    public Headphones createHeadphones() {
        return new LogitechHeadphones();
    }
}
