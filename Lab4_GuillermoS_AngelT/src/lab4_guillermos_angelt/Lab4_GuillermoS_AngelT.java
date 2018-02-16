package lab4_guillermos_angelt;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4_GuillermoS_AngelT {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        
        ArrayList<Ingenieros> usuarios= new ArrayList();
        ArrayList<Primates> primates = new ArrayList();
        ArrayList<NaveEspacial> nave = new ArrayList();
        ArrayList<MediosTransporte> medios = new ArrayList();
        ArrayList<String> idiomas = new ArrayList();
        
        
        do {
            switch (menu()) {
            case 1:
                int agregarIng;
                do{
                System.out.println("Menú Agregar\n"
                        + "1 - Ingenieros\n"
                        + "0 - regresar\n");
                agregarIng = sc.nextInt();
                
                switch(agregarIng){
                    case 1: 
                        
                        System.out.println("Escriba el nombre: ");
                        String nombre= sc.next();
                        
                        System.out.println("Escriba el grupo sanguíneo: ");
                        String grupo = sc.next();
                        
                        System.out.println("Escriba el sexo: ");
                        String sexo = sc.next();
                        
                        System.out.println("Ingrese la altura: ");
                        double altura= sc.nextDouble();
                        
                        System.out.println("Ingrese el peso: ");
                        double peso=sc.nextDouble();
                        
                        System.out.println("Crear Ingenieros\n"
                                + "Ingrese el email: ");
                        String email = sc.next();
                        
                        System.out.println("Ingrese un usuario: ");
                        String user = sc.next();
                        
                        System.out.println("Ingrese la contraseña: ");
                        String pwd = sc.next();
                        
                        String resp="";
                        do{
                            System.out.println("Ingrese idioma: ");
                            idiomas.add(sc.next());
                            System.out.println("Desea ingresar otro idioma: (si/no)\n");
                            resp=sc.next();
                        } while(resp.equalsIgnoreCase("si"));
                        
                                               
                        System.out.println("Ingrese la cantidad de café: ");
                        int cafe = sc.nextInt();
                        
                        System.out.println("Fecha de nacimiento: ");
                        String fecha = sc.next();
                        
                        usuarios.add(new Ingenieros(email, user, pwd, idiomas, cafe, fecha, nombre, grupo, sexo, altura, peso));
                        
                        break;
                    default:
                        if (agregarIng<0 || agregarIng >1){
                        System.err.println("Seleccione una opción válida\n");}
                        break;
                }
                
                } while(agregarIng!=0);
                
                break;
            case 2:
                String usuario, pwd;
                System.out.println("Login\n"
                        + "Ingrese el usuario: ");
                usuario=sc.next();
                
                System.out.println("Ingrese la contraseña: ");
                pwd=sc.next();
                
                for (Object temp : usuarios) {
                    if (temp instanceof Ingenieros) {
                        System.out.println("");
                        
                        
                        do {
                            switch(menu2()){
                                case 1:
                                    System.out.println("Ingenieros\n");
                                    
                                    do{
                                        switch(CRUD()){
                                            case 1:
                                                System.err.println("¡No se puede crear desde este menú!\n");
                                                break;
                                            case 2:
                                                System.out.println("Modificar Ingenieros\n"
                                                        + "Ingrese la posición del ingeniero a eliminar: ");
                                                int pos_mod= sc.nextInt();
                                                
                                                break;
                                            case 3:
                                                System.out.println("Eliminar Ingenieros\n"
                                                        + "Ingrese la posición del ingeniero a eliminar: ");
                                                int pos= sc.nextInt();
                                                usuarios.remove(pos);
                                                
                                                break;
                                            default:
                                                if (CRUD()<0 || CRUD() >3){
                                                System.err.println("Seleccione una opción válida\n");}
                                                break;
                                                
                                        }
                                        
                                    }while(CRUD()!=0);
                                    break;
                                case 2:
                                     System.out.println("Primates\n");
                                    
                                    do{
                                        switch(CRUD()){
                                            case 1:
                                                System.out.println("Agregar Primates\n");
                                                
                                                
                                                
                                                break;
                                            case 2:
                                                System.out.println("Modificar Primates\n"
                                                        + "Ingrese la posición del Primate a eliminar: ");
                                                int pos_mod_prim= sc.nextInt();
                                                
                                                
                                                break;
                                            case 3:
                                                System.out.println("Eliminar Primates\n"
                                                        + "Ingrese la posición del Primate a eliminar: ");
                                                int pos= sc.nextInt();
                                                usuarios.remove(pos);
                                                
                                                break;
                                            default:
                                                if (CRUD()<0 || CRUD() >3){
                                                System.err.println("Seleccione una opción válida\n");}
                                                break;
                                                
                                        }
                                        
                                    }while(CRUD()!=0);
                                    break;
                                case 3:
                                    System.out.println("Transportes\n");
                                    
                                    do{
                                        switch(CRUD()){
                                            case 1:
                                                System.out.println("Agregar Transportes\n");
                                                break;
                                            case 2:
                                                System.out.println("Modificar Transportes\n"
                                                        + "Ingrese la posición del transporte a eliminar: ");
                                                int pos_mod_prim= sc.nextInt();
                                                
                                                
                                                break;
                                            case 3:
                                                System.out.println("Eliminar Transportes\n"
                                                        + "Ingrese la posición del Transporte a eliminar: ");
                                                int pos= sc.nextInt();
                                                usuarios.remove(pos);
                                                
                                                break;
                                            default:
                                                if (CRUD()<0 || CRUD() >1){
                                                System.err.println("Seleccione una opción válida\n");}
                                                break;
                                                
                                        }
                                        
                                    }while(CRUD()!=0);
                                    break;
                                case 4:
                                    System.out.println("Viajes\n");
                                    
                                    do{
                                        switch(CRUD()){
                                            case 1:
                                                System.out.println("Agregar Viajes\n");
                                                break;
                                            case 2:
                                                System.out.println("Modificar Viajes\n"
                                                        + "Ingrese la posición del Viaje a eliminar: ");
                                                int pos_mod_prim= sc.nextInt();
                                                
                                                
                                                break;
                                            case 3:
                                                System.out.println("Eliminar Viajes\n"
                                                        + "Ingrese la posición del Viaje a eliminar: ");
                                                int pos= sc.nextInt();
                                                usuarios.remove(pos);
                                                
                                                break;
                                            default:
                                                if (CRUD()<0 || CRUD() >1){
                                                System.err.println("Seleccione una opción válida\n");}
                                                break;
                                                
                                        }
                                        
                                    }while(CRUD()!=0);
                                    break;
                                default:
                                    break;
                                    
                            }
                            
                        } while(menu2()!=0);
                        
                    } else
                        System.err.println("Usuario o contraseña incorrecta\n");
                    
                }
                
                
                break;
           
            default:
                if (menu()<0 || menu() >2){
                        System.err.println("Seleccione una opción válida\n");}
                break;
        }
        }while(menu()!=0);


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
    
    public static int CRUD() {
        System.out.println("1 - Agregar\n"
                + "2 - Modificar\n"
                + "3 - Eliminar\n"
                + "0 - Salir\n"
                + "Ingrese Opcion:");
        int op = sc.nextInt();
        return op;
    }

}
