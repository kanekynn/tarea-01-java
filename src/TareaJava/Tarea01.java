package TareaJava;

import java.util.Scanner;

public class Tarea01 {
    public static void main(String[] args) {



        //Ejercicio 1 : Contador de numeros pares

       Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        int numero = sc.nextInt();
        for (int i=2; i<= numero ;i=i+2){
            System.out.println(i);
        }



        //Ejercicio 2 : Suma de numeros inpares

        Scanner scp = new Scanner(System.in);
        System.out.println("Ingresar numero ");
        int numero2 = scp.nextInt();
        int sumaImpares = 0;

        for (int e =1 ; e <= numero2 ;e=e+2){
             sumaImpares = sumaImpares+e ;
        }
        System.out.println("La suma de inpares desde "+numero2+" es "+sumaImpares);



        //Ejercico 3 : Tabla de multiplicar

        int numero3 = 6;
        for (int q = 5 ; q < numero3 ; q++){
            for (int w = 1 ; w <= 10 ; w++){
                int multiplicacion= q*w;
                System.out.println(q+"*"+w+" es "+multiplicacion);
            }
            System.out.println();
        }




        // Ejercicio 4 : Factorial de un numero
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingresar numero ");
        int numero4 = scn.nextInt();
        int factorial = 1;

        for (int s = 1; s<=numero4 ; s++){
            factorial = factorial*s;
        }
        System.out.println("El factorial del numero "+numero4+" es "+factorial);




        // Ejercicio 5 :Suma de digitos
        Scanner sdf = new Scanner(System.in);
        System.out.println("Ingresar numero ");
        int numero5 = sdf.nextInt();
        int none = Math.abs(numero5);
        int sumaDigitos = 0;
        while(none>0){
            sumaDigitos = sumaDigitos + none%10;
            none=none/10;
        }
        System.out.println(sumaDigitos);






        // Ejercicio 6 : Cuadrados perfectos

        Scanner scv = new Scanner(System.in);
        System.out.println("Ingresar numero ");
        double numero6 = scv.nextDouble();
        double numero7 = Math.sqrt(numero6);
        for (int d =1 ; d<=numero7 ; d++){
            int cuadradoPerfecto =d*d;
            System.out.println(cuadradoPerfecto);
        }


    }
}
