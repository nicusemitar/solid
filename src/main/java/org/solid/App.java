package org.solid;

import org.solid.LSP.DataBaseManager;
import org.solid.LSP.NoSQLDatabase;
import org.solid.LSP.SQLDataBase;

public class App {
    public static void main(String[] args) {

        SQLDataBase sqlDataBase = new SQLDataBase("MySQL");
        NoSQLDatabase noSQLDatabase = new NoSQLDatabase("Mongo");

        print(sqlDataBase);
        print(noSQLDatabase);
    }

    static String print(DataBaseManager dataBaseManager) {
        System.out.println(dataBaseManager.getDataBaseName());
        return dataBaseManager.getDataBaseName();
    }

}
