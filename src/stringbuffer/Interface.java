package stringbuffer;


interface P{default void show() {System.out.println("A");}}
//
interface B{default void show() {System.out.println("Bv");}}


public class Interface implements P,B  {
//	
//	@Override
//	public void show() {
//		System.out.println("shqw");
//	}
	
	
	public void show() {
		B.super.show();
	}

	public static void main(String[] args) {
		
	
		P f=new Interface();
		f.show();
	


	
	}
}
