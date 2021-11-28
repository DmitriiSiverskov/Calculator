package Calculator;


import java.util.Scanner;

public class Main {

    public static Scanner reader = new Scanner(System.in);

    private static DataArrA dataArrTest = new DataArrA();
    private static DataArrR dataArrTestR = new DataArrR();

    public static void main(String[] args) {


        System.out.print("Cистема исчесления Арабская - 0, Римская - 1 : ");

        int st = Integer.parseInt(reader.nextLine());
        if (st == 0) {
            System.out.print("Вы выбрали арабскую систему\n");
            dataArrTest.dataArr();
        }
        else if (st == 1) {
            System.out.print("Вы выбрали римскую систему\n");
            dataArrTestR.dataArrRtest();
        }
        else {
            System.err.print("Вы не выбрали ничего");
        }
    }
}

