import java.util.Scanner;

public class Ut5_1 {

    public static void main(String[] args) {

        int num, numMaquina=0;

        Scanner entrada = new Scanner(System.in);
        StringBuffer numeros = new StringBuffer();
        StringBuilder numerosMaquina = new StringBuilder();

        for (int i = 0; i < 20; i++) {
            numMaquina = (int) (Math.random()*100+1);
            numerosMaquina.append(numMaquina+" ");
        }


        for (int i = 10; i > 0 ; i--) {

            System.out.println("quedan "+i+":");
            num = entrada.nextInt();

            while (num < 1 || num > 100){
                System.out.println("NO VALIDO, INTRODUCE OTRO");
                System.out.println("quedan "+i+":");
                num = entrada.nextInt();
            }

            /*while (numeros.compareTo(num)){
                System.out.println("REPETIDO,INTRODUCE OTRO");
                System.out.println("quedan "+i+":");
                num = entrada.nextInt();
            }*/

            numeros.append(num + " " );

        }

        System.out.println(numeros);
        System.out.println(numerosMaquina);

    }

}
