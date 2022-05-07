package org.solid.LSP;

public class SQLDataBase extends DataBaseManager {

    public SQLDataBase(String dataBaseName) {
        super(dataBaseName);
    }

    public SQLDataBase() {
    }

    @Override
    protected void connect() {
        super.connect();
    }

    @Override
    protected void fetch() {
        super.fetch();
    }

    @Override
    protected void save() {
        super.save();
    }

    protected void joinTable() {

    }
}
