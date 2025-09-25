import java.util.Scanner;

pulic class ComputeBMI{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double weight;
        final float POUND = 0.45359237f;
        final float KILO = 0.0254f;
        double height;

        System.out.println("What is your height");
        height = input.nextDouble();

        System.out.println("what is your weight");
        weight =input.nextDouble();

        double newHeight= height * POUND;
        double newWeight = weight*KILO;

        double BMI=newWeight/(newHeight *newHeight);
        System.out.println(BMI);
        
        
    }
}