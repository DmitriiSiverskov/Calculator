package Calculator;

public class Operator {
    char[] operator = new char[]{'-', '+', '*', '/'};
    char operatorAction;
    int sum;
    Integer iOne;
    Integer iTwo;

    char operatorTest(String a) {
        for (int i = 0; i < operator.length; i++) {
            for (int j = 0; j < a.length(); j++) {
                if (operator[i] == a.charAt(j)) {
                    operatorAction = operator[i];
                }
            }
        }
        return operatorAction;
    }

    void funcOperator(int a[]) {
        for (int i = 0; i <= a.length - 1; i++) {
            if (iOne == null) {
                iOne = a[i];
            } else if (iTwo == null) {
                iTwo = a[i];
            }

            if (a[i] > 10) {
                System.err.println("Число не может быть больше 10");
                break;
            }
            if (iOne >= 0 && iTwo != null) {
                switch (operatorAction) {
                    case '+':
                        sum = iOne + iTwo;
                        break;
                    case '-':
                        sum = iOne - iTwo;
                        break;
                    case '*':
                        sum = iOne * iTwo;
                        break;
                    case '/':
                        sum = iOne / iTwo;
                        break;
                    default:
                        System.err.println("Вы не ввели оператор");
                        break;
                }
            }

        }
        System.out.println(sum);
    }
}
