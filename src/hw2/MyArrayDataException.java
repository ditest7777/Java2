package hw2;

public class MyArrayDataException extends Exception {
    public int i;
    public int j;

    MyArrayDataException(int i, int j) {
        this.i = i + 1; //если вывод сообщения предназначен для того, кто не знает, что яйчейки в масиве начинаются с ноля;
        this.j = j + 1;

    }

}
