package stringbuffer;

class A{
	Object show() {
		return "A";
	}
}

public class Ex extends A {

	String show() {
		return "B";
	}
	
	public static void main(String[] args) {
		A a=new Ex();
		
		System.out.println(a.show());
	}
}
