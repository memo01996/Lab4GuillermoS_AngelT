package lab4_guillermos_angelt;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4_GuillermoS_AngelT {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Ingenieros> usuarios = new ArrayList();

        menu();
        do {
            switch (menu()) {
                case 1:
                    int agregarIng;
                    do {
                        System.out.println("Menú Agregar\n"
                                + "1 - Ingenieros\n"
                                + "2 - Primates\n"
                                + "0 - regresar\n");
                        agregarIng = sc.nextInt();

                        switch (agregarIng) {
                            case 1:
                                break;
                            case 2:
                                break;
                            default:
                                if (agregarIng < 0 || agregarIng > 2) {
                                    System.out.println("Seleccione una opción válida\n");
                                }
                                break;
                        }

                    } while (agregarIng != 0);

                    break;
                case 2:
                    String usuario,
                     pwd;
                    System.out.println("Login\n"
                            + "Ingrese el usuario: ");
                    usuario = sc.next();

                    System.out.println("Ingrese la contraseña: ");
                    pwd = sc.next();

                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        } while (menu() != 0);

    }

    public static int menu() {
        System.out.println("Menu");
        System.out.println("1: Agregar");
        System.out.println("2: Login");
        System.out.println("0: Salir");
        System.out.println("Ingrese Opcion:");
        int op = sc.nextInt();
        return op;
    }//fin menu

    public static int menu2() {

        System.out.println("Administrar sistema\n"
                + "1 - Ingenieros\n"
                + "2 - Primates\n"
                + "3 - Transportes\n"
                + "4 - Viajes\n"
                + "0 - regresar\n");
        int admin = sc.nextInt();
        return admin;
    }

}
