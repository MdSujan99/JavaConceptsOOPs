package pkg.b;

import pkg.a.A;

public class MainB {
	public static void main(String[] args) {
		A a1 = new A(1, 2, 3, 4);
//		a1.getDetails();
//		the above function is default,i.e., 
//		it can only be accessed from classes in its own package
		a1.getDetailsPublic();
		a1.pub=10;
//		a1.pri=11;
//		private members can only be accessed by the same class
		a1.pro=12;
	}
}
