package com.tnsif.multipeinhertance;
//create two interface
interface Aparna{
	void show();
}
interface Aishu{
	void display();
}
//implement the above 2 interface to another class
class Name implements Aparna,Aishu{
	@Override
	public void display() {
		System.out.println("Aparna is Our Sweet Mummy");
	}
	
	@Override
	public void show() {
		System.out.println("Aishu is Pretty");
	}
		
	
}
public class MultipleInheritanceDemo {
	public static void main(String[] args) {
		Name obj = new Name();
		obj.display();
		obj.show();
		
		
	}
	

}
