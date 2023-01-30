package day3;

public class Calculator {
	public void additionTwoNumber(int a, int b) {
		int c=a+b;
		System.out.println(c);
    }
    public void subtractioTwoNumber(int e, int f){
    	int c=e-f;
    	System.out.println(c);
    }
    public void multiplicationTwoNumber(double i,double j) {
    	double c=i*j;
    	System.out.println(c);
    }
    public void divisionTwoNumber(float x,float y) {
    	float c=x/y;
    	System.out.println(c);
    }public static void main(String[] args) {
		Calculator calci=new Calculator();
		calci.additionTwoNumber(7000, 600);
		calci.subtractioTwoNumber(550, 300);
		calci.multiplicationTwoNumber(16.11, 75.01);
		calci.divisionTwoNumber(1000f, 24f);
	}

}
