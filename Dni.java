import java.util.Scanner;

public class Dni {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int dni;
        char[] letras={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        System.out.println("Introduce num dni: ");
        dni =sc.nextInt();

        while(dni != 0){

            int resto = dni%23;
            char letra;
            System.out.println("DNI: "+ dni + "-"+ letras[resto]);

            System.out.println("Introduce tu dni:");
            dni=sc.nextInt();

        }
    }
    
}
