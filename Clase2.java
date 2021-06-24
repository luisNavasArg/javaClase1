
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisnavas
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> alumnos = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        String dato = "9";
        System.out.println("Ingresa una letra para comenzar");
        dato = scanner.next();
        
        while(dato.equals("0")){
            System.out.println("Ingresa el nombre del usuario a agregar");
            String nombre = scanner.next();
            alumnos.add(nombre);
            System.out.println("Escribe 0 si desea seguir agregando");
            dato = scanner.next(); 
        }
        System.out.println("Número de usuarios agregados: " + alumnos.size());
        for(int a=0; a < alumnos.size(); a++){
            System.out.println(alumnos.get(a)); 
        }
        int variable= 1;
        switch(variable){
            case 1:
                System.out.println("Seleccionaste al opción 1");
                break;
             case 2:
                System.out.println("Seleccionaste al opción 2");
                break;
             default:
                 System.out.println("Seleccionaste una opción incorrecta");
        }
    }
    
}
