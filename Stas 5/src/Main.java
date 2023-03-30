import java.util.Scanner;

public class Main {

    // IsPositiv
    public static boolean IsPositiv(int positiv) {
        if (positiv >= 0) {
            return true;
        }
        return false;

    }
      //IsNegativ
      public static boolean IsNegativ(int negativ) {
          if (negativ <= 0) {
              return true;
          }
          return false;
      }
          //IsZero
          public static boolean IsZero(int zero) {
              if (zero == 0) {
                  return true;
              }
              return false;
          }
              //Четное
              public static boolean IsEven(int even) {
                  if (even % 2 == 0) {
                      return true;
                  }
                  return false;
              }
                  //Нечетное
                  public static boolean IsNoEven(int noEven) {
                      if (noEven %2==1) {
                          return true;
                      }
                      return false;

      }
    public static void main(String[] args) {
        System.out.println(IsPositiv(100));
        System.out.println(IsNegativ(-100));
        System.out.println(IsZero(-100));
        System.out.println(IsEven(10));
        System.out.println(IsNoEven(11));

       //Возвращает крадрат1
       Scanner scanner = new Scanner (System.in);
       System.out.println("Введите число:");
       int i = scanner.nextInt();
       int e = i*i;
       System.out.println("Ваше число в квадрате "+e);


       //Возвращает куб
       System.out.println("Введите число:");
       int q = scanner.nextInt();
       int r = q*q*q;
       System.out.println("Ваше число в кубе "+r);


       //Возвращает степень
       System.out.println("Введите число:");
       int t = scanner.nextInt();
       System.out.println("Введите степень:");
       int w = scanner.nextInt();
       int degree = (int) Math.pow(t, w);
       System.out.println("Ваше число в степени "+degree);

       //Возвращает сумму
       System.out.println("Введите число:");
       int a = scanner.nextInt();
       int y = a+a;
       System.out.println("Сумма "+y);

 }






    }