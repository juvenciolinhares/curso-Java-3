package polimorfismoINterfaces;

public class InterfaceTest {
	
	public static void area(AreaCalculavel obj) {
		System.out.println(obj.calcularArea());
	}
	public static void volume(VolumeCalculavel obj) {
		System.out.println(obj.calculaVolume());
	}
	

	public static void main(String[] args) {
		Quadrado q = new Quadrado(2);
		AreaCalculavel a = q;
		
		area(new Quadrado(2));
		volume(new Cubo(2));
		

	}

}
