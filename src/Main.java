import java.util.Scanner;
//Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
/*
    Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
    𝑢 = (a+b+c) / 2
    Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐) */
public class Main {
    public static void main(String[] args){
        int steepEdge1, steepEdge2;
        double hypotenuse;
        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter size of first steep edge: ");
        steepEdge1 = inp.nextInt();
        System.out.print("Please enter size of second steep edge: ");
        steepEdge2 = inp.nextInt();
        //System.out.println(steepEdge1+" "+steepEdge2);

        hypotenuse = Math.sqrt((steepEdge1 * steepEdge1) + (steepEdge2 * steepEdge2));
        double u = (steepEdge1 + steepEdge2+ hypotenuse) / 2;
        double perimeter = 2 * u;
        double area = Math.sqrt(u * (u-steepEdge1) * (u-steepEdge2) * (u-hypotenuse));

        System.out.println("Hypotenuse: "+hypotenuse);
        System.out.println("The perimeter of triangle: "+perimeter);
        System.out.println("The area of triangle: "+area);

    }
}
