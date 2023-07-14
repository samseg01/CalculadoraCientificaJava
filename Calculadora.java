import java.io.IOException;
import java.util.Scanner;

public class Calculadora {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String []args) throws IOException, InterruptedException {

    menu();
    
    }
    public static void menu() throws IOException, InterruptedException{
        int opt;
        do{
            System.out.println("----\tCALCULADORA\t----");
            System.out.println("1 - soma");
            System.out.println("2 - subtração");
            System.out.println("3 - multiplicação");
            System.out.println("4 - divisão");
            System.out.println("5 - seno");
            System.out.println("6 - cosseno");
            System.out.println("7 - tangente");
            System.out.println("0 - sair\n");

            opt=teclado.nextInt();

            switch(opt){
                case 1:
                    System.out.println(soma());
                    break;
                case 2:
                    System.out.println(subtração());
                    break;
                case 3:
                    System.out.println(multipli());
                    break;
                case 4:
                    System.out.println(divis());
                    break;
                case 5:
                    System.out.println("o seno é " + sen());
                    break;
                case 6:
                    System.out.println("o cosseno é " + cos());
                    break;
                case 7:
                    System.out.println("a tangente é " + tan());
                    break;
            }

            int e;
            do{
                System.out.println("Continuar? SIM(1) - NÃO(0)");
                e = teclado.nextInt();
            }while(e!=0 && e!=1);


            if(e==1){
                if (System.getProperty("os.name").contains("Windows")){
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                }else{
                    Runtime.getRuntime().exec("clear");
                }
            }else if(e==0){
                opt=0;
            }

        }while(opt!=0);
    }


    public static double[] teclado(int i){
            double num[] = new double[i];
        if(i==2) {

            System.out.print("Digite o primeiro número: ");
            num[0]=teclado.nextInt();

            System.out.print("Digite o segundo número: ");
            num[1] = teclado.nextInt();

        }else if (i==1) {
            num[0]=teclado.nextInt();
        }
        return num;
    }

    public static double soma(){
        double num[] = teclado(2);

        double a = num[0];
        double b = num[1];

        return a+b;
    }

    public static double subtração(){
        double num[] = teclado(2);

        double a = num[0];
        double b = num[1];

        return a-b;
    }

    public static double multipli(){
        double num[] = teclado(2);

        double a = num[0];
        double b = num[1];

        return a*b;
    }

    public static double divis(){
        double num[] = teclado(2);

        double a = num[0];
        double b = num[1];

        return a/b;
    }

    public static double sen(){
        System.out.print("Escreva o numero em graus: ");
        double num[] = teclado(1);

        double a = num[0];
        double rad = Math.toRadians(a);

        return Math.sin(rad);
    }

    public static double cos(){
        System.out.print("Escreva o numero em graus: ");
        double num[] = teclado(1);

        double a = num[0];
        double rad = Math.toRadians(a);

        return Math.cos(rad);
    }

    public static double tan(){
        System.out.print("Escreva o numero em graus: ");
        double num[] = teclado(1);

        double a = num[0];
        double rad = Math.toRadians(a);

        return Math.tan(rad);
    }


}