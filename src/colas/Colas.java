
package colas;

import java.util.Scanner;

/**
 *
 * @author FAMILIA TOJ GARCÍA
 */
public class Colas {
    Scanner op = new Scanner(System.in);
    Cola cola = new Cola();
    
    public void menu(){
        boolean salir = false;
        int opcion;
        
        while(!salir){
           System.out.println("------BIENVENIDO-----"); 
           System.out.println("1. Agregar"); 
           System.out.println("2. Eliminar dato");
           System.out.println("3. Mostrar el primer dato");
           System.out.println("4. Mostrar todos los datos");
           System.out.println("5. Esta vacia");
           System.out.println("6. Mostrar tamaño");
           System.out.println("7. Vaciar lista");
           System.out.println("8. Salir");
           System.out.println("Selecciona la opción");
           opcion = op.nextInt();
           op.nextLine();
           switch(opcion){
            case 1:
                System.out.println("Ingrese dato: ");
                cola.push(op.nextInt());
                break;
            case 2:
                cola.pop();              
                break;
            case 3:
                System.out.println("El primer dato es:"+ cola.primero());             
                break;
            case 4:
                cola.imprimirDatos();
                break;
            case 5:
                if(!cola.vacia()){
                    System.out.println("La lista tiene datos");
                }else{
                    System.out.println("La lista esta vacia");
                }
                break;
            case 6:
                System.out.println("El tamaño de la lista es: "+cola.size());
                
                break;
            case 7: 
                cola.limpiar();
                break;
            case 8:
                salir = true;               
                break;
            default:
                System.out.println("La opción ingresada es incorrecta");          
            }
        }
    }
    public static void main(String[] args) {
        Colas objeto = new Colas();
        objeto.menu();
    }
    
}
