package basis;

import java.util.Scanner;

public class UseScanner {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        System.out.println(num);
//        scanner.close();
        UseScanner useScanner = new UseScanner();
        useScanner.sum();
    }

    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int sum() {
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();
        System.out.println("a + b = " + (a + b));
        scanner.close();
        return a + b;
    }
}
