package demo1;

// Тело класса
class Millionaire {
    // Тело метода
    public static void main(String args[]) {
//Эта инструкция называется обьявлением переменной.
        double amountinAccount;
        /*В данной строке используется ключевое слово  douЫe (двойной).
         Оно означает тип переменной amountinAccount.
         В переменной типа douЫe может храниться числовое значение с плавающей точкой
         в диапазоне от -1. 8х1озоs до 1. вх1озоs.
         */

        amountinAccount = 50.22;
        amountinAccount = amountinAccount + 1000000.00;
        System.out.print("Ha вашем счету сейчас ");
        System.out.print(amountinAccount);
        System.out.println(" долларов.");
    }
}