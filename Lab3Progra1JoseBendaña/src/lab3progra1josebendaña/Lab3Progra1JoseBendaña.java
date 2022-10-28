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
//                        if (comp = punto);
                    }

                case 2:
                    Scanner caso2 = new Scanner(System.in);
                    System.out.print("Ingrese un numero: ");
                    int k = caso2.nextInt();
                    double den3 = 0.0;
                    double respnk = 0.0;
                    double resp = 0.0;
                    double resptotal = 0.0;
                    double temp = 0.0;
                    int copiak = k;
                    double copiaden3=0.0;
                    for (int n = 1; n <= copiak; n++) {
                        double nominador = (2 * n) + 1;
                        double denominador = (n * n) + 3;
                        for(double den2 = denominador;den2>0;den2--){
                            den3=den3 + (den2*den2-1);
                        }
                        denominador = den3/2;

                        for (int i = 1; i <= copiak; i++) {
                            respnk = n * n;
                            temp = respnk * n;
                        }

                        resp = (nominador / denominador) * temp;

                    }
                    resptotal = resptotal + resp;
                    System.out.println("La respuesta es: " + resptotal);
                    break;
                case 3:
                    System.out.println("hola");
                    break;
            }        
        }while (ejercicio > 0 && ejercicio <4);
        System.out.println("solo hay 3 ejercicios");
    }
    
}
