public class Exercise1a {
    public static void main(String[] args) {
        int x = 1;
        while (x < 10) {
           // if ( x > 3) won't compile
            if (x > 0) { //fix
                System.out.println("big x");
                break;
            }
        }
    }
}
