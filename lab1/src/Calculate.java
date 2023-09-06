
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Scanner;

import static java.lang.Math.*;
public class Calculate {
    private double a =16.5;
    private double b = 15.0;
    private double x = -2.5;

    public double findW(){
        return sqrt(pow(x,2)+b)-pow(b,2)*pow(sin(x+a),3)/x;
    }
    public double findY (){
        return cos(x-x/(sqrt(pow(a,2)+2*pow(b,2))));
    }
    public void printLn(){
        System.out.println("W = "+ findW());
        System.out.println("Y = "+findY());
    }
    public void getDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM ");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }
    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        a=scanner.nextDouble();
        System.out.print("Enter b: ");
        b=scanner.nextDouble();
        System.out.print("Enter x: ");
        x=scanner.nextDouble();
    }
    public void inputCalculate(){
        inputData();
        printLn();
    }

    public static void main(String[]args){
        Calculate calculate = new Calculate();
        calculate.printLn();
        calculate.getDate();
        calculate.inputCalculate();
    }
}

