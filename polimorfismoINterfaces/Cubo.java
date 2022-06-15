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

		return lado * lado * lado;// formula cal �rea;
	}

}

/*
 * aqui aconteceu a heran�a multipla: o cubo herdou de �rea calculavel e de
 * volume calculavel
 */
