import java.util.Scanner;

public class Hava {
    public static void main(String[] args) {
        int sicaklik;
        Scanner input= new Scanner(System.in);
        System.out.print("Bugün hava kaç derece?");
        sicaklik=input.nextInt();
        if (sicaklik<5) {
           System.out.print("Kayak yapabilirsin.");
        }else if ((sicaklik>5) && (sicaklik<15)){
            System.out.print("Sinemaya gidebilirsin.");
        }else if ((sicaklik>15) && (sicaklik<25)){
            System.out.print("Piknik yapabilirsin.");
        }else if (sicaklik>25) {
            System.out.print("Yüzmeye gidebilirsin.");
        }
    }
}
