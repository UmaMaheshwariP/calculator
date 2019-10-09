package calculator;

/**
 * @author user
 *
 */
public class calculator {
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

public int Add(int a,int b) {
	return a+b;
}

public int Subtract(int a,int b) {
	return a-b;
}

public int Divide(int a,int b) {
	return a/b;
}

public int Multiply(int a,int b) {
	return a*b;
}

}
