import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opt = 0, d = 0;
        System.out.println("Ingrese el punto que desea validar");
        opt = sc.nextInt();
        System.out.println("ingrese la dimension de la matriz");
        d = sc.nextInt();
        switch (opt) {
            case 1:
                Punto1 p1 = new Punto1();
                p1.P1(d);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;

            default:
                break;
        }
    }
}