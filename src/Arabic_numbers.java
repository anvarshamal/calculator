public class Arabic_numbers {
    private final String[] digits = {"1","2","3","4", "5", "6","7","8","9","10"};

    public boolean isArabic(String digit) {
        for (String b: digits) { // проганяет по всем элементом массива, b - это число из массива, digits - это число который мы ввели
            if (b.equals(digit))
                return true;
        }
        return false;
    }

    public int calculate(String[] count) {
        switch (count[1]) {
            case "+":
                return Integer.parseInt(count[0]) + Integer.parseInt(count[2]);
            case "-":
                return Integer.parseInt(count[0]) - Integer.parseInt(count[2]);
            case "*":
                return Integer.parseInt(count[0]) * Integer.parseInt(count[2]);
            case "/":
                return Integer.parseInt(count[0]) / Integer.parseInt(count[2]);
            default:
                return 0;
        }
    }
}
