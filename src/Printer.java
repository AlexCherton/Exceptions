class Answer {
    public void divisionByZero() {
        int a = 5;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка! Деление на ноль");
        }
    }
    public void numberFormatException() {
        String s = "  555  ";
        int a;
        try {
            a = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка! Невозможно преобразовать строку в число");
        }
    }
}

public class Printer {
    public static void main(String[] args) {
        Answer ans = new Answer();
        try {
            ans.divisionByZero();
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }

        try {
            ans.numberFormatException();
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}
