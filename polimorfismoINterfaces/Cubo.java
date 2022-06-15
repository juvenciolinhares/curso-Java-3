package polimorfismoINterfaces;

public class Cubo implements VolumeCalculavel, AreaCalculavel {

	double lado;

	public Cubo(double lado) {
		this.lado = lado;
	}

	@Override
	public double calculaVolume() {

		return 6 * lado * lado;// formula cal volume.
	}

	@Override
	public double calcularArea() {

		return lado * lado * lado;// formula cal área;
	}

}

/*
 * aqui aconteceu a herança multipla: o cubo herdou de área calculavel e de
 * volume calculavel
 */
