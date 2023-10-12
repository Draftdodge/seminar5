package calculatorMVC.db;

import calculatorMVC.db.fetch.IFetchFromDB;
import calculatorMVC.db.save.ISaveToDB;

public class db {
    private final IFetchFromDB fetchFromDB;
    private final ISaveToDB saveToDB;

    public db(IFetchFromDB fetchFromDB, ISaveToDB saveToDB) {
        this.fetchFromDB = fetchFromDB;
        this.saveToDB = saveToDB;
    }

    public void saveData(String data) {
        // Реализация сохранения данных в базу данных
        saveToDB.saveToDB(data);
    }

    public String fetchData() {
        // Реализация извлечения данных из базы данных
        return fetchFromDB.fetchFromDB();
    }
}
