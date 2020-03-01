package Ejecutable;
import cl.AWAKELAB.PRUEBA.ELECTRODOMESTICOS.Electrodomesticos;
import cl.AWAKELAB.PRUEBA.ELECTRODOMESTICOS.Lavadora;
import cl.AWAKELAB.PRUEBA.ELECTRODOMESTICOS.Televisor;

public class Main {

	public static void main(String[] args) {

		Electrodomesticos arrayElectodomesticos[] = new Electrodomesticos[20];
		float TotalElectrodomesticos =0;
		float TotalTelevision = 0;
		float TotalLavadora = 0;
		
		arrayElectodomesticos[0] = new Lavadora();
		arrayElectodomesticos[1] = new Lavadora(74444, 32);
		arrayElectodomesticos[2] = new Lavadora("Gris", 333333, 'c', 35, 15);
		arrayElectodomesticos[3] = new Lavadora("rojo", 333333, 'c', 35, 15);		
		arrayElectodomesticos[4] = new Televisor();
		arrayElectodomesticos[5] = new Televisor(20, 130000);
		arrayElectodomesticos[6] = new Televisor("azul", 11111, 'C', 34, 160, true);
		arrayElectodomesticos[7] = new Televisor("negro", 22222, 'c', 80, 56, true);
		arrayElectodomesticos[8] = new Televisor("AZUL", 90000, 'A', 34, 20, false);
		arrayElectodomesticos[9] = new Televisor("Azul", 3548, 'b', 40, 56, true);
		arrayElectodomesticos[10] = new Electrodomesticos();
		arrayElectodomesticos[11] = new Electrodomesticos(74444, 32);
		arrayElectodomesticos[12] = new Electrodomesticos("azul", 320000, 'c', 65);
		arrayElectodomesticos[13] = new Televisor("amarillo", 3548, 'b', 40, 56, true);
		
		
			
		
		
		for (int i=0; i<arrayElectodomesticos.length;i++) {
			
			if (arrayElectodomesticos[i] instanceof Lavadora) {
				System.out.println("El Valor Final de esta lavadora es : $" + arrayElectodomesticos[i].precioFinal());
				TotalLavadora+=arrayElectodomesticos[i].precioFinal();
			}
		}
		
		System.out.println("");
		System.out.println("El valor de todos las Lavadoras es $" + TotalLavadora+ "€");
		System.out.println("");
		
		for (int i=0; i<arrayElectodomesticos.length;i++) {
			
			if (arrayElectodomesticos[i] instanceof Televisor) {
				System.out.println("El Valor Final de esta Television es : $" + arrayElectodomesticos[i].precioFinal()+ "€");
				TotalTelevision+=arrayElectodomesticos[i].precioFinal();
				System.out.println("su color es " + arrayElectodomesticos[i].getColor());
				System.out.println("su consumo es " + arrayElectodomesticos[i].getConsumoEnergetico());
			}
		}
		System.out.println("");
		System.out.println("El valor de todos los Televisores es $" + TotalTelevision+ "€");
	
		
		for (int i=0; i<arrayElectodomesticos.length;i++) {
			
			if (arrayElectodomesticos[i] instanceof Electrodomesticos) {
				TotalElectrodomesticos+=arrayElectodomesticos[i].precioFinal();
			}
		}
		
	
		System.out.println("");
		System.out.println("El valor de todos los Televisores es $" + TotalElectrodomesticos+ "€");
		
	}

}