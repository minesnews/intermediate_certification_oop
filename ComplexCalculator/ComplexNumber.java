package ComplexCalculator;

public class ComplexNumber {
    public float a;
    public float b;

    public ComplexNumber(float real, float imaginary) {
        this.a = real;
        this.b = imaginary;
    }

    public String getComplexNumber() {
        if (b >= 0) {
            return a + " + " + b + "i";
        } else {
            return a + " - " + Math.abs(b) + "i";
        }
    }
}
