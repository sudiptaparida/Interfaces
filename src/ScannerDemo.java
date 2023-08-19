import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args)
    {
        Scanner Scanner=new Scanner(System.in);
        System.out.println("enter the first number");
        int num=Scanner.nextInt();
        Scanner.nextLine(); //CONSUME EXTR NEW LINE
        System.out.println("enter the name");
        String name=Scanner.nextLine();
        System.out.println(name);
    }
}
