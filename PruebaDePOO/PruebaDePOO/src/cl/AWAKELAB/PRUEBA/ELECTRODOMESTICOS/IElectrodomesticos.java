package cl.AWAKELAB.PRUEBA.ELECTRODOMESTICOS;

public interface IElectrodomesticos {
	
   
    static final int precio_por_defecto = 100000;
    static final String color_por_defecto = "Blanco";
    static final int peso_por_defecto = 5;
    static final char consumo_por_defecto = 'f';
    static final String[] tablaColores = {"BLANCO", "ROJO", "NEGRO", "AZUL", "GRIS"};
    static final char[] TablaConsumo = {'A', 'B', 'C', 'D', 'E', 'F'};
    
    public char verificarConsumo(char consumoEnergy);
    public String comprobarColor(String color);
    public float precioFinal();
    
}
