package ua.consultation;

public class Main {

	public static void main(String[] args) {
		Plane plane = new Plane();
		plane.setModel("Airobus 360");
		Plane plane2 = new Plane("AN - 24", 900);
		System.out.println(plane.getModel());
		System.out.println(plane2);
		System.out.println(plane.fly(1000, 1,900));
		
		

	}

}
