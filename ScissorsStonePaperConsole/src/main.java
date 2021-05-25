
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CS Ariunbuyan
 */
public class main {

    int user, computer, human, com, tie;
    Scanner scan;
    Random rand;
    String weapon[] = {"", "Хайч", "Давуу", "Чулуу"};
    int choose = 0;

    public void start() {
        rand = new Random();
        System.out.println("1==Хайч 2==Давуу 3==Чулуу");
        System.out.println("Та зэвсгээ оруулна уу:\n");
        scan = new Scanner(System.in);
        user = scan.nextInt();
        rand = new Random();
        computer = rand.nextInt(3) + 1;
        System.out.println("Таны сонголт: " + weapon[user] + " Компьютер сонголт: " + weapon[computer]);
        if (user == 1 && computer == 2 || user == 2 && computer == 3 || user == 3 && computer == 1) {
            System.out.println("Та хожлоо\n");
            human = human + 1;
        } else if (user == 2 && computer == 1 || user == 3 && computer == 2 || user == 1 && computer == 3) {
            System.out.println("Компьютер хожлоо\n");
            com = com + 1;
        } else {
            System.out.println("Та тэнцлээ:\n");
            tie = tie + 1;
        }
        System.out.println("Та дахин тогловол 1-г дарна уу! || Үгүй бол 0-г дарна уу!");
        choose = scan.nextInt();
        if (choose == 1) {
            start();
        } else if (choose == 0) {
            System.out.println("Тоглоом дууслаа");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        main game = new main();
        game.start();
    }
}
