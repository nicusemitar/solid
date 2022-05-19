package org.solid;

import org.solid.DIP.highlevel.Switch;
import org.solid.DIP.highlevel.Switchable;
import org.solid.DIP.lowlevel.ElectricPowerSwitch;
import org.solid.DIP.lowlevel.LightBulb;
import org.solid.LSP.DataBaseManager;
import org.solid.LSP.NoSQLDatabase;
import org.solid.LSP.SQLDataBase;

public class App {
    public static void main(String[] args) {

        /* Testing LSP principe */
        SQLDataBase sqlDataBase = new SQLDataBase("MySQL");
        NoSQLDatabase noSQLDatabase = new NoSQLDatabase("Mongo");

        print(sqlDataBase);
        print(noSQLDatabase);

        /* Testing DIP principe */
        Switchable lightBulb = new LightBulb();
        Switch electricPowerSwitch = new ElectricPowerSwitch(lightBulb);
        electricPowerSwitch.press();
        electricPowerSwitch.press();

    }

    static String print(DataBaseManager dataBaseManager) {
        System.out.println(dataBaseManager.getDataBaseName());
        return dataBaseManager.getDataBaseName();
    }

}
