package es.daw.main;

import es.daw.model.Calculadora;
import es.daw.model.Utilidades;
import java.util.Scanner;

/**
 *
 * @author melola
 */
public class CalculadoraPOO {
    
    // Declaro el scanner a nivel global de la clase para poder utilizarlo
    // en todos los métodos de la clase
    static Scanner sc = new Scanner(System.in);
    
    static float operando1, operando2;
    
    /**
     * @param args
     */
    public static void main(String[] args) {

        //Variable donde almacenamos el valor seleccionado
        //del menú
        int opcion = 0;
        
        Calculadora calculadora1 = new Calculadora();
        calculadora1.getTipo("Estándar");
        
        Calculadora calc2 = new Calculadora("Científica");
        System.out.println(calc2.getTipo());
        
        
        do {
            //1. Pintar el menú por consola
            Utilidades.pintaMenu();
            
            
            //2. Leer opción elegida por el usuario
            
            //(Más adelante) Estas líneas de código nos permiten leer del teclado
            //y transformar el valor leído de String a int
            // 1) Recoger el valor escrito en el teclado
            // 2) Transformar esa cadena de caracteres en un valor entero
            //opcion = Integer.parseInt(sc.nextLine());
            
            opcion = sc.nextInt();

            //Si la opcion es menor que 0 o mayor que 5, no es una
            //opción válida
            if (opcion < 0 ) {
                
                //Si la opcion es diferente a cero, solicitamos los 
                //dos operandos
            } else if (opcion != 0) {

                System.out.println("\n");

                // Leer operandos
                leerOperandos();
                
                calc2.setOperando1(operando1);
                calc2.setOperando2(operando2);

                System.out.println("\n");
                switch (opcion) {
                    case 1: //Suma
                        System.out.println("El resultado de la suma es " + calc2.sumar());
                        break;
                    case 2: //Resta
                        System.out.println("El resultado de la resta es " + calc2.restar());
                        break;
                    case 3: //Multiplicación
                        System.out.println("El resultado de la multiplicación es " + calc2.multiplicar());
                        break;
                    case 4: //División
                        System.out.println("El resultado de la división es " + calc2.dividir());
                        break;
                    case 5: //Resto
                        System.out.println("El resto de dividir " + calc2.getOperando1() + " entre " + calc2.getOperando2() + " es " + calc2.resto());
                        break;
                    case 6:
                        System.out.println("Opción no válida. Vuelva a escoger");
                        break;

                }

            }

        } while (opcion != 0); //opcion == 0 implicar salir del programa

        //Indicamos que no vamos a leer ningún valor más por teclado.
        sc.close();

        System.out.println("Finalizando la ejecución de la calculadora");

    }// end main
    
    
    // DECLARACIÓN DE NUEVOS MÉTODOS ESTÁTICOS (FUNCIONES)
    
    /**
     * Método estático que lee e inicializa los dos operandos
     */
    public static void leerOperandos(){

        System.out.print("Introduzca el primer operando: ");
        //operando1 = Float.parseFloat(sc.nextLine());
        operando1 = sc.nextFloat();

        
        System.out.print("Introduzca el segundo operando: ");
        //operando2 = Float.parseFloat(sc.nextLine());
        operando2 = sc.nextFloat();
        
    }
    
    
}