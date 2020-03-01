package cl.AWAKELAB.PRUEBA.ELECTRODOMESTICOS;

public class Televisor extends Electrodomesticos implements IElectrodomesticos, ITelevisor {
	
	private int resolucion;
	private boolean sintonizadorTDT;

	public Televisor() {
		super();
		this.resolucion = resolucion_por_defecto;
		this.sintonizadorTDT = sintonizador_TDT;
		
	}

	public Televisor(int peso, float precioBase) {
		super(peso, precioBase);
		this.resolucion = resolucion_por_defecto;
		this.sintonizadorTDT = sintonizador_TDT;
		// TODO Auto-generated constructor stub
	}

	public Televisor(String color, float precioBase, char consumo, int peso, int resolucion, boolean sintonizadorTDT) {
		super(color, precioBase, consumo, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
		// TODO Auto-generated constructor stub
	}

	public boolean isSintonizadorTDT() {
		// TODO Auto-generated method stub
		return sintonizadorTDT;
	}


	public int getResolucion() {
		// TODO Auto-generated method stub
		return resolucion;
	}
	  @Override
	    public float precioFinal() {
	        float total = super.precioFinal();
	        char consumo = super.getConsumoEnergetico();
	        double peso = super.getPeso();
	        
	        if(consumo == 'A')
	            total += 100;
	        else if(consumo == 'B')
	            total += 80;
	        else if(consumo == 'C')
	            total += 60;
	        else if(consumo == 'D')
	            total += 50;
	        else if(consumo == 'E')
	            total += 30;
	        else
	            total += 10;
	        
	        if(peso < 20)
	            total += 10;
	        else if(peso < 50)
	            total += 50;
	        else if(peso < 80)
	            total += 80;
	        else
	            total += 100;
	        
	        if(this.sintonizadorTDT)
	            total += 50;
	        
	        if(this.resolucion > 40)
	            total *= 1.3;
	        
	        return total;
	    }
}
