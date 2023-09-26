package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal {

	private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
	public static int ranas = 0;
	public static int salamandras = 0;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio() {
		super();
		listado.add(this);
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}
	
	public static int cantidadAnfibios() {
		return listado.size();
	}
	
	@Override
	public String movimiento() {
		return "saltar";
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		Anfibio rana = new Anfibio(nombre, edad, "selva", genero, "rojo", true);
		Anfibio.ranas++;
		return rana;
	}
	
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		Anfibio sal = new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);
		Anfibio.salamandras++;
		return sal;
	}
	
	public static void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
	}
	
	public static ArrayList<Anfibio> getListado(){
		return listado;
	}
	
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	
	public String getColorPiel() {
		return colorPiel;
	}
	
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	public boolean getVenenoso() {
		return venenoso;
	}
}
