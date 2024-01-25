class Expr7 {
    public static String expr(char a) {
        if (Character.toString(a).equals(" ")) {
            throw new RuntimeException("Пустая строка введена");
        }
        return "Ваш ввод - " + a;
    }
}

public class Printer7 {
    public static void main(String[] args) {
        char a;

        if (args.length==0) {
            a = 'J';
        }else {
            a = args[0].charAt(0);
        }

        String res = Expr7.expr(a);
        System.out.println(res);
    }
}
