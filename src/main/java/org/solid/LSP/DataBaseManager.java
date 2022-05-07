package org.solid.LSP;

public class DataBaseManager {

    private String dataBaseName;

    public DataBaseManager() {
    }

    public DataBaseManager(String dataBaseName) {
        this.dataBaseName = dataBaseName;
    }

    public String getDataBaseName() {
        return dataBaseName;
    }

    public void setDataBaseName(String dataBaseName) {
        this.dataBaseName = dataBaseName;
    }

    protected void connect() {
    }

    protected void fetch() {
    }

    protected void save() {
    }
}
