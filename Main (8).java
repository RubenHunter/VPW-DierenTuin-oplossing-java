import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner invoer = new Scanner(System.in);

        int testGevallen = invoer.nextInt();
        int uitkomst = 0;

        for (int t = 0; t < testGevallen; t++){

            //aantal dieren inlezen
            int aantalDieren = invoer.nextInt();


            // voor aantal dieren een nummer inlezen
            for (int g = 0; g < aantalDieren; g++){
               uitkomst += invoer.nextInt();
            }
            System.out.println((t+1) + " " + uitkomst);
            uitkomst = 0;
        }
    }
}
