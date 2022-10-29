package lab3progra1josebendaña;

import java.util.Scanner;

public class Lab3Progra1JoseBendaña {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String punto = ".";
        int ejercicio = 0;
        do{
            System.out.print("Ingrese el ejercicio que quiere hacer[1,2 o 3]: ");
            ejercicio = sc.nextInt();
            switch (ejercicio) {
                case 1:
                    System.out.print("Ingrese una cadena: ");
                    String cadena = sc.nextLine();
                    for (int c = 0;c<cadena.length();c++){
                        char caracter = cadena.charAt(c);
                        String comp = ""+caracter;
                    }

                case 2:
                    Scanner caso2 = new Scanner(System.in);
                    System.out.print("Ingrese un numero: ");
                    int k = caso2.nextInt();
                    double respnk=0;
                    double resp = 0.0;
                    double resptotal = 0.0;
                    double temp = 0.0;
                    double nominador = 0.00;
                    double denominador= 0.00;  
                    for (int n = 1; n <= k; n++) {
                        nominador = (2 * n) + 1;
                        denominador = (n * n) + 3;
                        double den3=1.00;
                        for(double den2 = 1;den2<=denominador;den2++){
                            den3*=den2;
                        }
                        denominador = den3;
                        resp = nominador/denominador;
                        resptotal += resp;
                    }
                    System.out.println("La respuesta es: " + resptotal);
                    break;
                case 3:
                    Scanner caso3 = new Scanner(System.in);
                    System.out.println("Ingrese la altura: ");
                    int altura = caso3.nextInt();
                    break;
            }        
        }while (ejercicio > 0 && ejercicio <4);
        System.out.println("solo hay 3 ejercicios");
    }
    
}
