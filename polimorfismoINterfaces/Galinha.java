package polimorfismoINterfaces;

public class Galinha extends Animals implements AreaCalculavel {
	void fazerBarulho() {
		System.out.println("c�c�");
	}

	@Override
	public double calcularArea() {
		
		return 0;
	}

}
