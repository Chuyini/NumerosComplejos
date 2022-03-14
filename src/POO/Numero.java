package POO;

public class Numero {
    private int num1,num2,suma,multiplicacion;

    Numero(int num1, int num2)
    {
        this.num1=num1;
        this.num2=num2;
    }
    Numero(int num1)
    {
        this.num2=this.num1=num1;

    }
    public int sumate(int num1, int num2)
    {
        int suma;
        suma=num1+num2;

        return suma;
    }
    public int multiplicate(int num2,int num1)
    {
        int mult;
        mult=num1*num2;

        return mult;
    }
    public boolean comparate(int num1,int num2)
    {
        boolean preg;
        if(num1==num2)
        {
            preg=true;
        }else
        {
            preg=false;
        }
        return preg;

    }
    public String multiplicateConEntero(int num2, int num1)
    {
        return num2+"j + "+num1;

    }
}
