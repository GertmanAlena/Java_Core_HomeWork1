package lesson1.mathOperations;

/**
 * класс декоратор для вывода результата
 * математических действий
 * в форматированной строке
 */
public class Decorator {
    /**
     * метод форматированного вывода высичлений
     * @param value результат вычислений
     * @return форматированная строка
     */
    public static String decorator(int value){
        return String.format("= %d.", value);
    }
}
