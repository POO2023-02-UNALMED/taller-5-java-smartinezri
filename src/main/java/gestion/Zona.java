package gestion;
import zooAnimales.Animal;
import java.util.ArrayList;

public class Zona {

	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales;
	
	public Zona() {
		this.nombre = null;
		this.zoo = null;
		this.animales = new ArrayList<Animal>();
	}
	
	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
		this.animales = new ArrayList<Animal>();
	}
	
	public void agregarAnimales(Animal animal) {
		this.animales.add(animal);
	}
	
	public int cantidadAnimales() {
        int cantidad = 0;
        for (Animal animal : animales){
            cantidad += 1;
        }
		return cantidad;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setZoo(Zoologico zoo) {
		this.zoo = zoo;
	}
	
	public Zoologico getZoo() {
		return zoo;
	}
	
	public void setAnimales(ArrayList<Animal> animales) {
		this.animales = animales;
	}
	
	public ArrayList<Animal> getAnimales(){
		return animales;
	}
}
