package lab4_guillermos_angelt;

import java.util.Scanner;

public class Lab4_GuillermoS_AngelT {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        switch (menu()) {

        }
    }

    public static int menu() {
        System.out.println("Menu");
        System.out.println("1: Agregar");
        System.out.println("2: Modificar");
        System.out.println("3: Eliminar");
        System.out.println("4: Lanzar Viaje");
        System.out.println("Ingrese Opcion:");
        int op = sc.nextInt();
        return op;
    }//fin menu

    public static void menu2() {

    }
}
