import java.util.Scanner;

public class ComputeBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char letter;
        // double weight;
        // final float POUND = 0.45359237f;
        // final float KILO = 0.0254f;
        // double height;

        // System.out.println("What is your height");
        // height = input.nextDouble();

        // System.out.println("what is your weight");
        // weight =input.nextDouble();

        // double newHeight= height * KILO;
        // double newWeight = weight*POUND;

        // double BMI=newWeight/(newHeight *newHeight);
        // System.out.println(BMI);

        System.out.println("Enter a letter of your choice: ");
        letter = input.next().charAt(1);

        int choice = switch (letter) {
            case 'a', 'b', 'c' -> 2;
            case 'd', 'e', 'f' -> 3;
            case 'g', 'h', 'i' -> 4;
            case 'j', 'k', 'l' -> 5;
            case 'm', 'n', 'o' -> 6;
            case 'p', 'q', 'r', 's' -> 7;
            case 't', 'u', 'v' -> 8;
            case 'w', 'x', 'y', 'z' -> 9;
            default -> 0;
        };

        System.out.println("This is the corresponding number" + choice);

        input.close();
    }
}