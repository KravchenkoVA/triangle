import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Triangle triangle = new Triangle();
        triangle.createTriangle(sc.nextInt());
    }
}
