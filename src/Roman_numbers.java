public class Roman_numbers {
    private final String[] digits = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public String[] getDigits() {
        return digits;

    }

    public boolean isRoman(String digit) {
        for (String a : digits) {
            if (a.equals(digit))
                return true;
        }
        return false;
    }

    public String calculate(String[] count) {
        switch (count[1]) {
            case "+":
                return toRoman(sum(toArabic(count[0]), toArabic(count[2])));
            case "-":
                return toRoman(sub(toArabic(count[0]), toArabic(count[2])));
            case "*":
                return toRoman(mult(toArabic(count[0]), toArabic(count[2])));
            case "/":
                return toRoman(div(toArabic(count[0]), toArabic(count[2])));
            default:
                return null;
        }

    }

    private int toArabic(String digit) { // переводим число из одной в другую входные
        switch (digit) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            default:
                System.out.println("Я без понятия а это случилось");
                return 0;
        }
    }

    private int sum(int a, int b) {
        return a + b;
    }  // выполняем арифмитическую операцию

    private int sub(int a, int b) {
        if (a - b <= 0) {
            System.out.println("в римской системе нет отрицательных чисел и нуля");
            System.exit(0);
        }
        return a - b;
    }

    private int mult(int a, int b) {
        return a * b;
    }

    private int div(int a, int b) {
        return a / b;
    }

    private String toRoman(int result) {

        String roman = "";
        switch (result % 10) { // тут мы трехзнаные число делим по разрядам, тут у нас еденичные числа
            case 1:
                roman = "I";
                break;
            case 2:
                roman = "II";
                break;
            case 3:
                roman = "III";
                break;
            case 4:
                roman = "IV";
                break;
            case 5:
                roman = "V";
                break;
            case 6:
                roman = "VI";
                break;
            case 7:
                roman = "VII";
                break;
            case 8:
                roman = "VIII";
            case 9:
                roman = "IX";
                break;
            case 0:
                roman = "";
                break;
        }
        switch ((result/10)%10) {
            case 1:
                roman = "X" + roman; // + roman здесь мы добавляем еденичные
                break;
            case 2:
                roman = "XX" + roman;
                break;
            case 3:
                roman = "XXX" + roman;
                break;
            case 4:
                roman = "XL" + roman;
                break;
            case 5:
                roman = "L" + roman;
                break;
            case 6:
                roman = "LX" + roman;
                break;
            case 7:
                roman = "LXX" + roman;
                break;
            case 8:
                roman = "LXXX" + roman;
            case 9:
                roman = "XC" + roman;
                break;
        }
        if (result/100%10 == 1) roman = "C" + roman;
        return roman;
    }
}
