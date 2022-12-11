import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Игра 15 палочек с компьютером." +
                " Каждый ход уменьшает количество палочек на заданное число." +
                "При достижении нуля или отрицательном значении вы проигрываете");
        int score = 15;
      while (score >=0) {

          Scanner scanner = new Scanner(System.in);
          System.out.println("Введите число от 1 до 3");
          int a = scanner.nextInt();
          switch (a) {
              case 1:
                  System.out.println("Вы выбрали 1");
                  break;
              case 2:
                  System.out.println("Вы выбрали 2");
                  break;
              case 3:
                  System.out.println("Вы выбрали 3");
                  break;
              default:
                  System.out.println("Нет такого значения");
                  break;
          }


           int result1 = score - a;
           System.out.println("Палочек осталось: " + result1);
           if(result1 == 1){
               System.out.println("Вы выиграли!");
               return;
           } else if (result1 <= 0) {
               System.out.println("Вы проиграли!");
               return;
           }
          int moveCpu = getRandomInteger(1, 3);
           System.out.println("Компьютер делает ход: " + moveCpu);
           int result2 = result1 - moveCpu;
          if (result2 == 1){
              System.out.println("Компьютер выиграл!");
              return;
          } else if (result2 <= 0) {
              System.out.println("Компьютер проиграл!");
              return;
          }
           System.out.println("Палочек осталось: " + result2);
          if (result2 == 1) {
              score = result2;
          }else{
              return;
          }
      }
    }

    public static int getRandomInteger(int min,int max){
        int x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }

}