import java.util.Scanner;

public class main{
    public void run(){
    Scanner sc = new Scanner(System.in);

    System.out.println("ENTER 1st NUMERATOR   : ");
       double num = sc.nextDouble();
    System.out.println("ENTER 1st DENOMINATOR   : ");
       double deno = sc.nextDouble();

     fraction f1 =  new fraction(num, deno);
      System.out.println("The value of f1 numerator and denominator : ");
         f1.printFraction();

     
     System.out.println("ENTER 2nd NUMERATOR  : ");
       double num2 = sc.nextDouble();
    System.out.println("ENTER 2nd DENOMINATOR : ");
       double deno2 = sc.nextDouble();
      
      fraction f2 = new fraction(num2, deno2);
        System.out.println("The value of f2 numerator and denominator : ");
        f2.printFraction();   
        
        
        fraction sum = f1.add(f2);
        fraction diff = f1.substract(f2);
        fraction product = f1.multiple(f2);
        fraction div = f1.divide(f2);
       
       System.out.println("SUM of n1 and d1 is : " );
        sum.printFraction();
       System.out.println("diff of n1 and d1 is : ");
        diff.printFraction();
       System.out.println("Multiple of n1 and d1 is : " );
       product.printFraction();
       System.out.println("Division of n1 and d1 is : " );
        div.printFraction();
        System.out.println("dcimal value of f1 : " + f1.toDecimal());
        System.out.println("decimal value of f2 : " + f2.toDecimal());

        System.out.println("-----------------------------------------------------------------");

        System.out.println("---------------CLONE OF ALL OF THEM------------------------------");


        fraction cloneSum = sum.clone();
        fraction cloneDiff = diff.clone();
        fraction cloneProduct = product.clone();
        fraction cloneDiv = div.clone();

        System.out.println("SUM of n1 and d1 is : " );
       cloneSum.printFraction();
       
       System.out.println("diff of n1 and d1 is : ");
        cloneDiff.printFraction();

       System.out.println("Multiple of n1 and d1 is : " );
       cloneProduct.printFraction();

       System.out.println("Division of n1 and d1 is : " );
        cloneDiv.printFraction();
        
        f1.clone();
        System.out.println("dcimal value of f1 : " + f1.toDecimal());
        f2.clone();
        System.out.println("decimal value of f2 : " + f2.toDecimal());
       
        System.out.println("------------------------------------------------------------------");

        System.out.println("-----------------------CHECING EQUALITY----------------------------");
        
        boolean sum1 = sum.equals(cloneSum);
        System.out.println(sum1);

        boolean diff1 = diff.equals(cloneDiff);
        System.out.println(diff1);

        boolean product1 = product.equals(cloneProduct);
        System.out.println(product1);

        boolean divide1 = div.equals(cloneDiv);
        System.out.println(divide1);

        sc.close();

    }
}