/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg4p1_andrénavas;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author eliza
 */
public class Lab4P1_AndréNavas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random variable = new Random(); 
        System.out.print("Bienvenido a mi programa");
        entrada.nextLine(); 
        int opcion = 5;
        // esto obliga al usuario a hacer enter para que el programa pueda seguir
        while (opcion==5){
        System.out.println("Elija una de las siguientes ocpiones: ");
        System.out.println("1. opcion 1. Trapecio hueco");
        System.out.println("2. opcion 2. Juego de carreras");
        System.out.println("3. opcion 3. Intercalados");
        System.out.println("4. opcion 4. Salir del programa");
        int option = entrada.nextInt(); 
        entrada.nextLine();
        // sirve para leer un entero y darle la option al usuario
        //de ingresar un numero
        
            switch (option) {  //este swith es para crear el menu en caso de ser option 1 entonces entra en case 1 
                case 1: 
                    opcion = 5;  //aqui cambio la opcion y la declaro como cinco para que el programa pueda salir o salirse
                    System.out.println("Usted ha elegido la opción número 1.Ejercicio práctico 1 – Trapecio hueco"); 
                    /*
                      0 1 2 3 4 5 6 7 8 
                    0                * * * * * * * * *
                    1              *                   *
                    2            *                      *
                    3          *                         * 
                    4        *                            *
                    5      *                               *
                    6    *                                  *
                    7  *                                     *
                    8 * * * * * * * * * * * * * * * * * * * * *

                      0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 
                    */
                    // este dibujo solo es para pensar sobre el patron que debo tomar
                    System.out.println("\n SOBRE \n");
                    //esta cosa hace que le de doble salto de linea   
                    

        System.out.print("Ingrese la altura del trapecio(Recuerde la altura debe ser mayor de 5): ");
        int altura = entrada.nextInt(); //le doy la opción al usuario de poder entrar 
        entrada.nextLine();
        if (altura>4){ //si altura es mayor que cuatro voy entrar al ciclo porque este trapecio hueco no puede ser posible si es menor que 5
            for (int i = 1; i <= altura; i++) { //primer ciclo y i va de forma vertical según su posición es decir va hacia abajo
                // Imprime espacios en blanco para alinear a la derecha
                for (int j = 1; j <= altura - i; j++) {
                    System.out.print("   ");
                }
                // Imprime asteriscos para la parte superior del trapecio
                for (int j = 1; j <= altura + (i - 1) * 2; j++) { 
                    /* Este bucle for se encarga de imprimir los caracteres en cada columna de la fila actual del trapecio hueco. 
                    La variable j se inicializa en 1 y se incrementa en cada iteración hasta que sea menor o igual a altura + (i - 1) * 2. 
                    La expresión altura + (i - 1) * 2 determina el número total de caracteres que se imprimirán en la fila actual, 
                    teniendo en cuenta la altura y la posición actual i.
                    */
                    if (i == 1 || j == 1 || j == altura + (i - 1) * 2 || i == altura) { /* Cuando i es igual a 1, lo que significa que estamos en la primera fila del trapecio.
                    Cuando j es igual a 1, lo que significa que estamos en la primera columna de la fila actual.
                    Cuando j es igual a altura + (i - 1) * 2, lo que significa que estamos en la última columna de la fila actual.
                    Cuando i es igual a altura, lo que significa que estamos en la última fila del trapecio.
                        */
                        System.out.print(" * "); //si se cumplen las condiciones anteriores imprimimos * sino 
                    } else {
                        System.out.print("   "); //imprimimos un espacio
                    }
                }
                System.out.println(); //esto es para que no salga pegado y haga un salto de linea
            }
        }
        else{
            System.out.println("No invente ponga numeros mayores de 5 como altura"); //si el usuario pone un numero menor que 5 le pone esta sugerencia
        }       
                                    break;
                case 2: //entramos en el caso
                    opcion = 5;
                    System.out.println("Usted ha elegido la opción número 2. Juego de carreras "); //bienvenida
                    System.out.print("Ingrese el nombre del primer jugador: "); //elecci+on de jugador 1
                String jugador1 = entrada.nextLine(); //leo la elección
                System.out.print("Ingrese el nombre del segundo jugador: "); //elección d ejugador 2
                String jugador2 = entrada.nextLine();  //leo elección de jugador 2

                int posicionJugador1 = 0; //contador de jugador 1
                int posicionJugador2 = 0; //contador de jugador 2

                while (true) { //primer ciclo que entra a fuerza
                    for (int i = 0; i < 40; i++) {
                        System.out.print("*");
                    } //esto seria como la pista 
                    for (int i = 0; i < 3; i++) { //Este bucle for se utiliza para imprimir las tres filas de la pista.
                        for (int j = 0; j < 40; j++) { // Este bucle for se utiliza para imprimir las columnas de cada fila de la pista.
                            if (j == 19 || j == 29) { /* Esta condición verifica si la columna actual coincide con la posición 19 o 29, 
                                que son las posiciones donde se mostrarán los "+" en la pista. Estos símbolos "+" se utilizan para marcar 
                                las divisiones en la pista.
                                        */
                                System.out.print("+");
                            } else if (j == posicionJugador1 && i == 1) { /*Esta condición verifica si la columna actual coincide con la posición
                                del jugador 1 (posicionJugador1) y si la fila actual es la segunda fila (i == 1). 
                                Esto se utiliza para imprimir la inicial del jugador 1 en su posición correspondiente en la pista.
                                */
                                System.out.println(Character.toUpperCase(jugador1.charAt(0))); //para mayúsculas y print posicion
                                System.out.println("************************************************************"); //dividir pista
                            } else if (j == posicionJugador2 && i == 1) { 
                                System.out.print(Character.toUpperCase(jugador2.charAt(0))); //para mayusculas pero a jugador 2 solo la incial 
                            } else { 
                                System.out.print(" "); //lo demas le pongo un *
                            }
                        }
                        System.out.println();
                    }
                    for (int i = 0; i < 40; i++) {
                    System.out.print("*");
                    }        //cierro la pista

                    System.out.println("Posición actual de " + jugador1 + ": " + posicionJugador1);  //posicion del jugador comienza en 0
                    System.out.println("Posición actual de " + jugador2 + ": " + posicionJugador2); //posicion del jugador 2 comeinza en 0

                    System.out.println("Turno de " + jugador1 + ". Elija una opción:"); //primero comienza el jugador 1
                    System.out.println("1. Lanzar dado"); 
                    System.out.println("2. No hacer nada");
                    System.out.println("3. Salir");
                    //opciones ha elegir del juego
                    int opcionJugador1 = entrada.nextInt();
                    //leo opciones de jugador
                    if (opcionJugador1 == 1) {
                        int dado = variable.nextInt(6) + 1; //si es 1 giro los dados
                        posicionJugador1 += dado; //la posicion del jugador se agrega cada vez que se repite
                    } else if (opcionJugador1 == 3) { //sino me salgo
                        System.out.println(jugador1 + " ha salido. " + jugador2 + " gana,Felicidades"); //si me salgo  jugador 2 gana en autom[atico 
                        break; //cierro 
                    }

                    System.out.println("Turno de " + jugador2 + ". Elija una opción:");
                    System.out.println("1. Lanzar dado");
                    System.out.println("2. No hacer nada");
                    System.out.println("3. Salir");
                    //opciones del jugador 2
                    int opcionJugador2 = entrada.nextInt();

                    if (opcionJugador2 == 1) {
                        int dado = variable.nextInt(6) + 1;
                        posicionJugador2 += dado;
                    } else if (opcionJugador2 == 3) {
                        System.out.println(jugador2 + " ooh no ha salido. " + jugador1 + " gana,felicidades!");
                        break;
                    } //lo mismo que el 1 pero esta vez con el jugador 2

                    if (posicionJugador1 >= 40) { //si la posicion de jugaodor 1 es mayor o igual que 1 entonces gana jugador 1
                        System.out.println(jugador1 + " ha llegado a la meta. ¡" + jugador1 + " gana,felicidades!");
                        break;
                    } else if (posicionJugador2 >= 40) { //sino gana jugador 2 al llegar a 40 o mas
                        System.out.println(jugador2 + " ha llegado a la meta. ¡" + jugador2 + " gana!");
                        break; //cierro
                    }
                }
                    break; //cierro doble porque uno es para el switch y el case
                case 3: 
                    opcion =5;                    
                    System.out.println("Usted ha elegido la opción número 3. Intercalados");
                    System.out.print("Ingrese un entero mayor que 3: ");     
                    System.out.print("Ingrese un entero mayor que 3: ");
                    int n = entrada.nextInt(); //leo

                    if (n <= 3) {
                        System.out.println("El número debe ser mayor que 3."); //haga mientras sea mayor que 3
                    } else {
                        for (int i = 0; i < n; i++) { //ciclo 
                            for (int j = 0; j < n; j++) {
                                if ((i % 4 == 1 || i % 4 == 2) && (j % 4 == 1 || j % 4 == 2)) {
                                    System.out.print("- ");
                                } else {
                                    System.out.print("* ");
                                }
                            }
                            System.out.println();
                        }
                    }

                    break;
                case 4:
                    opcion =8;
                    System.out.println("Salir del Menu"); //sino salirse
                    default: 
                    opcion =5;
                    System.out.println("No invente ponga opcion valida");  //opcion invalida
            }
        }
/* Esto es como un ciclo donde uno tiene diferentes caminos a tomar,
//que son los case, la funcion del swicth es poner la condición como si
//fuera un if, el break sirve para terminar el ciclo (en otras palabras 
 terminar con el caso y no seguir adelante.La condición se pone adentro
// de los parentesis.  
*/  
// sirve para leer un entero y darle la option al usuario
//de ingresar un numero
      
    }
}
    
    
