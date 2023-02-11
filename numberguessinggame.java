import java.util.Scanner;
import java.util.Random;
class No_Guessinggame {

  void Guess_the_no() {
   
    Random rand = new Random();
    int rnum = rand.nextInt(100);
   int guess_num;
   int  count = 1;
   int score = 0;
   Scanner sc1 = new Scanner(System.in);
   System.out.println("Enter the number to be guessed:");
    guess_num = sc1.nextInt();

    if (rnum == guess_num) 
    {
      System.out.println("The number is guessed correctly!!");
    } else if (guess_num != rnum) 
    {
      while (guess_num != rnum) {
        if (rnum > guess_num) {
          System.out.println("The number is greater than " + guess_num);
          System.out.println("Enter the  number greater than " + guess_num);
          System.out.println("Try again ");
          guess_num = sc1.nextInt();
          count++;
        } else if (rnum < guess_num) {
          System.out.println("The number is less than" + guess_num);
          System.out.println("Enter the  number less than " + guess_num);
          System.out.println("Try again ");
          guess_num = sc1.nextInt();
          count++;
        }
      }
      if (guess_num == rnum) {
        System.out.println(
          "Number is guessed correctly  in " + count +  "attempts!!"
        );
      }
    }
    switch (count) {
      case 1:
        score = 50;
        System.out.println("Score :" + score);
        break;
      case 2:
        score = 40;
        System.out.println("Score :" + score);
        break;
      case 3:
        score = 30;
        System.out.println("Score :" + score);
        break;
      case 4:
        score = 20;
        System.out.println("Score :" + score);
        break;
      case 5:
        score = 10;
        System.out.println("Score :" + score);
        break;
      default:
        score = 0;
        System.out.println(
          "Score : " + 0 + " Because number is not guessed within 5 attempts......\n"
        );
        break;
    }
  }
}

class Guess_Number {

  public static void main(String[] args) {
    No_Guessinggame n = new No_Guessinggame();
    n.Guess_the_no();
  }
}