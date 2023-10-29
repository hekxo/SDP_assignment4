package AbstractFactory;

import DevicesInterfaces.Headphones;
import DevicesInterfaces.Keyboard;
import DevicesInterfaces.Mouse;

public interface DeviceFactory {
    Keyboard createKeyboard();

    Mouse createMouse();

    Headphones createHeadphones();
}
