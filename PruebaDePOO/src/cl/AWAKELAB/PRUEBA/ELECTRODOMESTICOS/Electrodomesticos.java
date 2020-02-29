package cl.AWAKELAB.PRUEBA.ELECTRODOMESTICOS;

import java.util.Arrays;

public abstract class Electrodomesticos implements IElectrodomesticos {
	
    
    public float precioBase;
    public char consumoEnergetico;
    public String color;
    public int peso;
    

    public Electrodomesticos() {
        this.color = color_por_defecto;
        this.consumoEnergetico = consumo_por_defecto;
        this.precioBase = precio_por_defecto;
        this.peso = peso_por_defecto;
        
    }
    
    public Electrodomesticos(int peso, float precioBase) {
        this();
        this.peso = peso;
        this.precioBase = precioBase;
        
    }
    
    public Electrodomesticos(String color, float precioBase, char consumo, int peso) {
        this.color = comprobarColor(color);
        this.consumoEnergetico = verificarConsumo(consumo);
        this.peso = peso;
        this.precioBase = precioBase;
    }
        
  
    public char verificarConsumo(char consumoEnergy) {
    	char letra = consumo_por_defecto;
    	String l = consumoEnergy +"";
    	l.toUpperCase();
        for (int i = 0; i < TablaConsumo.length; i++) {
        	if(l.charAt(0)==TablaConsumo[i]) {
        		letra = TablaConsumo[i];
        	}
        }
		return letra; 
        
   
    }
    public String comprobarColor(String color) {
        
    	String c = color;
        c.equalsIgnoreCase(color);
        for (int i = 0; i < tablaColores.length; i++) {
			if(c.equalsIgnoreCase(tablaColores[i])) {
				c = tablaColores[i];
			}
		
		}
        return c;
    }
    
    
    public float getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}


	

	@Override
    public String toString() {
        return "Electrodomesticos [precioBase=" + precioBase + 
                ", color=" + color + ", consumoEnergetico="
                + consumoEnergetico + ", peso=" + peso + "]";
    }
	public float precioFinal() {
		float p=this.precioBase;
		
		if (this.peso<20) {
			p+=10;
		}else if (this.peso<50 && this.peso>19) {
			p+=50;
		}else if (this.peso<80 && this.peso>49) {
			p+=80;
		}else
			p+=100;
		
		if ( this.consumoEnergetico==('A')) {
			p+=100;
		}else if (this.consumoEnergetico==('B')) {
			p+=80;
		}else if (this.consumoEnergetico==('C')) {
			p+=60;
		}else if (this.consumoEnergetico==('D')) {
			p+=50;
		}else if (this.consumoEnergetico==('E')) {
			p+=30;
		}else
			p+=10;
		
		return p;
	}
    
    

}