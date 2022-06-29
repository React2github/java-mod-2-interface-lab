import java.util.Scanner;

public class AnimalRunner {
   public static void main(String[] args) {
         // Logic for Monster attributes

      try (Scanner myobj = new Scanner(System.in)) {
         System.out.print("Speed of the monster(MPH)? ");
         int monsterSpeed = myobj.nextInt();
         System.out.println("You picked " + monsterSpeed + " MPH");

         // Logic for Bird Selection

         System.out.println("What type of Bird will you test?");
         System.out.print("You can pick an Owl or Hawk: ");
         String birdType = myobj.next();

         // Logic for Bird Identification

         if (birdType.equalsIgnoreCase("Owl")) {
            CanFly birdChoice = new Owl();
            int birdSpeed = birdChoice.fly();

            if (birdSpeed > monsterSpeed) {
               System.out
                     .println("Owl speed was " + birdSpeed + " MPH." + " Monster speed was " + monsterSpeed + " MPH.");
               System.out.println("You live another day buddy!");
            } else {
               System.out
                     .println("Owl speed was " + birdSpeed + " MPH." + " Monster speed was " + monsterSpeed + " MPH.");
               System.out.println("Sad day. You died");
            }
         } else if (birdType.equalsIgnoreCase("Hawk")) {
            CanFly birdChoice = new Hawk();
            int birdSpeed = birdChoice.fly();

            if (birdSpeed > monsterSpeed) {
               System.out
                     .println("Hawk speed was " + birdSpeed + " MPH." + " Monster speed was " + monsterSpeed + " MPH.");
               System.out.println("You live another day buddy!");
            } else {
               System.out
                     .println("Hawk speed was " + birdSpeed + " MPH." + " Monster speed was " + monsterSpeed + " MPH.");
               System.out.println("Sad day. You died!");
            }
         } else {
            System.out.println("Pick one of these two birds!");
         }
      } catch (Exception e) {
         System.out.println("Enter a Positive Number!");
      }

   }

}
