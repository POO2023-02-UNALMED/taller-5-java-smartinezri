package zooAnimales;
import gestion.Zona;

public class Animal {

	private static int totalAnimales = 0;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal() {
		totalAnimales += 1;
	}
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = null;
		totalAnimales += 1;
	}

	
	public String movimiento() {
		return "desplazarse";
	}
	
	public static String totalPorTipo() {
		
		int totalMamiferos = Mamifero.cantidadMamiferos();
	    int totalAves = Ave.cantidadAves();
	    int totalReptiles = Reptil.cantidadReptiles();
	    int totalPeces = Pez.cantidadPeces();
	    int totalAnfibios = Anfibio.cantidadAnfibios();

	    String resultado = String.format("Mamiferos: %d\nAves: %d\nReptiles: %d\nPeces: %d\nAnfibios: %d",
	            totalMamiferos, totalAves, totalReptiles, totalPeces, totalAnfibios);

	    return resultado;
	}
	
	public String toString() {
		
		String mensaje = String.format("Mi nombre es %s, tengo una edad de %s, habito en %s y mi genero es %s", nombre, edad, habitat, genero);
		if (zona != null) {
			mensaje = String.format("%s, la zona en la que me ubico es %s, en el %s", mensaje, zona.getNombre(), zona.getZoo().getNombre());
		}
		return mensaje;
	}
	
	public static int getTotalAnimales() {
		return totalAnimales;
	}

	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getString() {
		return nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	public String getHabitat() {
		return habitat;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
	public Zona getZona() {
		return zona;
	}
}
