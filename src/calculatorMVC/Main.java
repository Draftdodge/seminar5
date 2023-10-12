package calculatorMVC;

import calculatorMVC.db.db;
import calculatorMVC.db.fetch.FetchFromMSSql;
import calculatorMVC.db.save.SaveToMSSql;
import calculatorMVC.view.consoleView;
import calculatorMVC.view.IView;
import calculatorMVC.view.input.SystemInInput;
import calculatorMVC.view.output.ConsoleOutput;

public class Main {
    public static void main(String[] args) {
        db databaseManagement = new db(new FetchFromMSSql(), new SaveToMSSql());
        IView view = new consoleView(new SystemInInput(), new ConsoleOutput());
        view.runCalculator();
    }
}