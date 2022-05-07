package org.solid.LSP;

public class MongoDB extends NoSQLDatabase {

    private Long dataBaseID;

    public MongoDB(String dataBaseName) {
        super(dataBaseName);
    }

    public MongoDB() {
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

    @Override
    protected void mergeDocument() {
        super.mergeDocument();
    }
}
