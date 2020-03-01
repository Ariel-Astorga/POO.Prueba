package cl.AWAKELAB.PRUEBA.ELECTRODOMESTICOS;

public class Lavadora extends Electrodomesticos implements IElectrodomesticos, ILavadora {
	private int carga;

	public Lavadora() {
		super();
		this.carga = carga_por_defecto;
		
	}

	public Lavadora(int peso, int precioBase) {
		super(peso, precioBase);
		this.carga = carga_por_defecto;
	}

	public Lavadora(String color, int precioBase, char consumo, int peso, int carga) {
		super(color, precioBase, consumo, peso);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}
	public float precioFinal() {
		float p = super.precioFinal();
		
		if ( this.carga>30) {
			p+=50;
		}
		return p;

	}
}
