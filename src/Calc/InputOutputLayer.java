package Calc;


// Горизонтальные уровни архитектуры калькулятора

// Уровень ввода и вывода
public class InputOutputLayer {
    public String getInput() {
        // Чтение ввода пользователя
        return null;
    }

    void displayOutput(String result) {
        // Вывод результата на экран
    }
}

// Уровень управления
class ControlLayer {
    InputOutputLayer ioLayer;
    CalculationLayer calcLayer;

    ControlLayer() {
        ioLayer = new InputOutputLayer();
        calcLayer = new CalculationLayer();
    }

    void runCalculator() {
        String input = ioLayer.getInput();
        // Анализ ввода и управление вычислениями
        // Вывод результата с использованием ioLayer
    }
}