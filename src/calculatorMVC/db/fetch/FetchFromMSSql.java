package calculatorMVC.db.fetch;

public class FetchFromMSSql implements IFetchFromDB {

    @Override
    public String fetchFromDB() {
        return "return from MSSql";
    }
}