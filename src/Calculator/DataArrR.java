package Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DataArrR {

    Main m = new Main();
    Operator op = new Operator();
    String number_1;
    String number_2;
    String operant;
    int sum = 0;

    String[] arrRim = new String[]{
            "0", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
            "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX",
            "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII",
            "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI",
            "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV",
            "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV",
            "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV",
            "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII",
            "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII",
            "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI",
            "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX",
            "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
    };

    String st;
    boolean add = true;
    int result;

    public void dataArrRtest() {
        try {
            Scanner reader = new Scanner(System.in);
            st = reader.nextLine();
            String[] arrNum = new String[3];

            for (int i = 0, j = 0; i < st.length(); i++) {

                if (st.charAt(i) != ' ' || st.charAt(i) != '+') {

                    if (add == true) {
                        arrNum[j] = String.valueOf(st.charAt(i));
                        add = false;
                    } else if (st.charAt(i) != ' ' && st.charAt(i) != '+') {
                        arrNum[j] += String.valueOf(st.charAt(i));
                    } else if (st.charAt(i) == ' ' | st.charAt(i) == '+') {
                        j++;
                        arrNum[j] = String.valueOf(st.charAt(i));
                        if (st.charAt(i) == '+') {
                            j++;
                        }
                        add = true;
                    }
                }
            }


            findingNumberR(arrNum);
            int h1 = returnNumber(number_1);
            int h2 = returnNumber(number_2);
            sum = calculationTest(h1,h2,operant);
            System.out.println(arrRim[sum]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.print("Формат математической операции не удовлетворяет задания - два операнда и один оператор ( + , - , * , /)");
        } catch (NullPointerException e){
            System.err.print("в римской системе нет отрицательных чисел");
        }

    }

    void findingNumberR(String[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                number_1 = a[i];
            }
            if (i == 1) {
                operant = a[i];
            }
            if (i == 2) {
                number_2 = (a[i]);
            }
        }

    }

    int returnNumber(String a) {
        int result = 0;
        switch (a) {
            case "0":
                result = 0;
                break;
            case "I":
                result = 1;
                break;
            case "II":
                result = 2;
                break;
            case "III":
                result = 3;
                break;
            case "IV":
                result = 4;
                break;
            case "V":
                result = 5;
                break;
            case "VI":
                result = 6;
                break;
            case "VII":
                result = 7;
                break;
            case "VIII":
                result = 8;
                break;
            case "IX":
                result = 9;
                break;
            case "X":
                result = 10;
                break;
        }
        return result;
    }
    int calculationTest(int a, int b, String c){
        int sum = 0;
        switch (c){
            case "+": sum = a + b;
            break;
            case "-": sum = a - b;
            break;
            case "*": sum = a * b;
            break;
            case "/": sum = a / b;
        }
        return sum;
    }
}

