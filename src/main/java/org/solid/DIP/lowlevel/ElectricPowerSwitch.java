package org.solid.DIP.lowlevel;

import org.solid.DIP.highlevel.Switch;
import org.solid.DIP.highlevel.Switchable;

public class ElectricPowerSwitch implements Switch {
    public Switchable switchable;
    public boolean on;

    public ElectricPowerSwitch(Switchable switchable) {
        this.switchable = switchable;
        this.on = false;
    }

    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void press() {
        boolean checkOn = isOn();
        if (checkOn) {
            switchable.turnOff();
            this.on = false;
        } else {
            switchable.turnOn();
            this.on = true;
        }
    }
}
