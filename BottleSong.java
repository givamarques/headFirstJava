/*a class with a main
an int and a String variables
a while loop and a if test
 */

public class BottleSong {
    public static void main(String[] args) {
        int bottleNum = 10;
        String word = "bottles";

        while (bottleNum > 0) {

            if (bottleNum == 1) {
                word = "bottle"; //no que restar apenas 1 garrafa muda para o singular
            }
            System.out.println("\n" + bottleNum + " green " + word + ", hanging on the wall");
            System.out.println(bottleNum + " green " + word + ", hanging on the wall");
            System.out.println("And if one green bottle should accidentally fall,");

            bottleNum = bottleNum - 1;

            if (bottleNum > 0) {
                System.out.println("There'll be " + bottleNum + " green " + word + ", hanging on the wall");
            } else {
                System.out.println("There'll be no green bottles, hanging on the wall");
            } //end else
        } //end while loop
    } //end main method
} //end class
