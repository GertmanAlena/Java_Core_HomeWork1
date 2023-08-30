package lesson1.mathOperations;

/**
 * класс математическиз вычислений
 */
public class mathOper {

    /**
     * метод для вычисления суммы
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return сумма
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * метод для вычисления вычитания
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return разность
     */
    public static int subtraction(int a, int b){
        return a - b;
    }

    /**
     * метод для вычисления деления
     * @param a делимое
     * @param b делитель
     * @return частное
     */
    public static int del(int a, int b){
        return a/b;
    }

    /**
     * метод для вычисления умножения
     * @param a первый множитель
     * @param b второй множитель
     * @return произведение
     */
    public static int mult(int a, int b){
        return a * b;
    }
}
