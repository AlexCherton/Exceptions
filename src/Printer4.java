class IsFloat {
    public static Float isFloat(String a) {
        Float x = 0f;
        try {
            x = Float.parseFloat(a);
        } catch (NumberFormatException e) {
            System.out.println("Your input is not a float number. Please try again");
        }
        return x;
    }
}

public class Printer4 {
    public static void main(String[] args) {

String input;
        if (args.length == 0){
            input = "3.14";
        } else {
            input = args[0];
        }

        Float result = IsFloat.isFloat(input);
        System.out.println(result);
    }
}
