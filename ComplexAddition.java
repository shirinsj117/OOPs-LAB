import java.util.Scanner;

class Complex{
    double real, imag;

    Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    static Complex add(Complex c1,Complex c2) {
        return new Complex(c1.real + c2.real, c1.imag + c2.imag);
    }
    void display(){
        System.out.println("Sum:"+ real + "+"+ imag + "i");
    }
}
public class ComplexAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter real and imaginay parts of first complex number:");
        double real1 = scanner.nextDouble();
        double imag1 = scanner.nextDouble();
        Complex c1 = new Complex(real1, imag1);

        System.out.println("Enter real and imaginary parts of second complex number:");
        double real2= scanner.nextDouble();
        double imag2= scanner.nextDouble();
        Complex c2= new Complex(real2, imag2);

        Complex sum = Complex.add(c1, c2);
        sum.display();

        scanner.close();
    }
}