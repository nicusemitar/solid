package org.solid.LSP;

public class PostGreSQL extends SQLDataBase {

    private Long dataBaseID;

    public PostGreSQL(String dataBaseName, Long dataBaseID) {
        super(dataBaseName);
        this.dataBaseID = dataBaseID;
    }

    public PostGreSQL() {
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
    protected void joinTable() {
        super.joinTable();
    }
}
