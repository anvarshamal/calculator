import java.util.Scanner;

public class Test {
    public static void main(String [] args) {
        Roman_numbers roman_numbers = new Roman_numbers();
        Arabic_numbers arabic_numbers = new Arabic_numbers();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше выражение");
        String string = scanner.nextLine();
        String[] count = string.split("\\s+"); // делит по заданному регулярному выражению
        if (count.length != 3) {
            System.out.println("Неверный формат ввода!");
            System.exit(0);
        }
        boolean isRoman = false;
        if (roman_numbers.isRoman(count[0]) && roman_numbers.isRoman(count[2])) isRoman = true;
        else if (arabic_numbers.isArabic(count[0]) && arabic_numbers.isArabic(count[2])) isRoman = false;
        else if ((arabic_numbers.isArabic(count[0]) || roman_numbers.isRoman(count[0])) && (arabic_numbers.isArabic(count[2]) || roman_numbers.isRoman(count[2]))) {
            System.out.println("Нельзя складывать римсие и арабские числа");
            System.exit(0);
        }
        else {
            System.out.println("Операнды должны быть римскими или арабскими числами от 1 до 10");
            System.exit(0);
        }
        if (isRoman) System.out.println(string + " = " + roman_numbers.calculate(count)); // выводим исходные выражение = выводим ответ
        else System.out.println(string + " = " + arabic_numbers.calculate(count));
    }

}
