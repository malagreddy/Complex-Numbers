//program to find the sum of two complex numbers
public class ComplexNumber {
	private int real; // instance members
	private int imaginary;

	public ComplexNumber(int real, int imaginary) {
		super();
		this.real = real;
		this.imaginary = imaginary;
	}

	// constructor
	public ComplexNumber() {
		super();
	}
	// getter and setter methods

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImaginary() {
		return imaginary;
	}

	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}

	// sum function to find the sum of real and imaginary part
	public void sum(ComplexNumber complexnum1, ComplexNumber complexnum2) {
		real = complexnum1.real + complexnum2.real;
		imaginary = complexnum1.imaginary + complexnum2.imaginary;
		display();
	}

	// display function
	public void display() {
		System.out.println(real + "+i" + imaginary);
	}

}
