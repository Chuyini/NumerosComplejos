#Main Principal
>package POO;

import java.util.Scanner;

public class Main {
public void trabaja(Numero n1,int num1, int num2) {
int op;
Scanner entrada=new Scanner(System.in);
Menu m1=new Menu();
do {

            m1.muestraMenu();
            op=entrada.nextInt();

            switch (op) {
                case 1:System.out.println(n1.sumate(num1,num2)+"J");
                    break;
                case 2:System.out.println(n1.multiplicate(num1,num2)+"J");
                    break;
                case 3:System.out.println("SON "+n1.comparate(num1,num2)+"MENTE IGUALES");
                    break;
                case 4:System.out.println(n1.multiplicateConEntero(num1,num2));
                    break;

            }

        } while (op != 5);
    }
    public static void main(String [] args)
    {

            int num1=0, num2=0,op;

            Scanner entrada=new Scanner(System.in);
            System.out.println("Numero 1 ");
            num1=entrada.nextInt();
            System.out.println("Entrada 2 ");
            num2=entrada.nextInt();
            if(num1==num2)
            {
                Numero n1=new Numero(num1);
                Main M=new Main();
                M.trabaja(n1,num1,num2);


            }else
            {
                Numero n1=new Numero(num1,num2);
                Main M=new Main();
                M.trabaja(n1,num1,num2);

            }






    }
}
