package geometricas;

public class Triangulo extends Poligono {

	public Triangulo(double base, double altura) {
		super(base, altura);
	}

	@Override
	public double area() {
		return (getBase() * getAltura()) / 2;
	}

	@Override
	public double perimetro() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double volume() {
		// TODO Auto-generated method stub
		return 0;
	}

}
