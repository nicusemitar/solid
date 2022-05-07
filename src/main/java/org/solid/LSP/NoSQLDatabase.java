package org.solid.LSP;

public class NoSQLDatabase extends DataBaseManager {

    public NoSQLDatabase(String dataBaseName) {
        super(dataBaseName);
    }

    public NoSQLDatabase() {
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

    protected void mergeDocument() {
    }
}
