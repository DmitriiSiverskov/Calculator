package Calculator;

import java.util.Scanner;

public class DataArrA {

    Operator op = new Operator();

    String st;
   // int sum;
    Main m = new Main();
    char a = op.operatorAction;


    public void dataArr() {

        try {

            Scanner reader = new Scanner(System.in);
            st = reader.nextLine();
            int[] numArr = new int[st.length() - 1];

            for (int i = 0, j = 0; i < st.length(); i++, j++) {
                if(st.length() > 7){
                    System.err.print("Пример ввода данных 10 + 10 или 10+10");
                    break;
                }

                if (st.charAt(i) != ' ' && st.charAt(i) != '+' && st.charAt(i) != '-'
                        && st.charAt(i) != '*' && st.charAt(i) != '/') {

                    numArr[j] = Integer.parseInt(String.valueOf(st.charAt(i)));
                    if (st.charAt(i) == '0' && j > 0 && st.length() > 3) {
                        numArr[j - 1] *= 10;
                        --j;
                    }
                }
                if (st.charAt(i) == ' ' || st.charAt(i) == '+' || st.charAt(i) == '-'
                        || st.charAt(i) == '*' || st.charAt(i) == '/') {
                    --j;
                }
            }

            op.operatorTest(st);
            op.funcOperator(numArr);
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.err.print("Формат математической операции не удовлетворяет заданию" +
                    " - два операнда и один оператор ( + , - , * , /)");
        }catch (ArithmeticException e){
            System.err.print("На ноль делить нельзя");
        }
    }
}
