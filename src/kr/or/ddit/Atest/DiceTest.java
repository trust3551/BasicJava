package kr.or.ddit.Atest;

public class DiceTest {
   public static void main(String[] args) {
      Dice dice = new Dice();
      dice.printHisto();
   }
}

class Dice {
   
   int [] num = new int[6];
   
   Dice () {
      for(int i=0; i<50; i++) {         		// 50번 던짐
         int ran = (int)(Math.random()*6)+1;    // ran = 1~6 난수
         num[ran-1]++;         					// 1~6
      }
   }
   
   public void printHisto() {
      for(int i=0; i<num.length; i++) {
         System.out.print((i+1)+"|");
         for(int j=0; j<num[i]; j++) {
            System.out.print("*");
         }
         System.out.print(num[i]);
         System.out.println();
      }
   }
}