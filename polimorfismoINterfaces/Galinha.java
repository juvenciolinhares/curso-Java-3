package polimorfismoINterfaces;

public class Galinha extends Animals implements AreaCalculavel {
	void fazerBarulho() {
		System.out.println("cócó");
	}

	@Override
	public double calcularArea() {
		
		return 0;
	}

}
