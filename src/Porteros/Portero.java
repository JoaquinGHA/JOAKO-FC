package Porteros;
import INTERFAZ.ITransferible;
import JugadorBase.Jugador;

public class Portero extends Jugador implements ITransferible {
	
	//Variables de Portero
	private double paradas;
	private int penaltisAtajados; 
	
	//Constructor
	public Portero(String nombre, int edad, double precio, double estatura, String posicion, String nacionalidad, double paradas, int penaltisAtajados, int dorsal) {
		super(nombre, edad, precio, estatura, posicion, nacionalidad, dorsal);
		setParadas(paradas);
		setPenaltisAtajados(penaltisAtajados);
		
	}
	
	//Getters para las variables de Portero
	public double getParadas() {return paradas;}
	public int getPenaltisAtajados() {return penaltisAtajados;}
	
	//Setters para paradas y penaltis atajados
	public void setParadas(double paradas) {
		if(paradas < 5.5) {
			throw new IllegalArgumentException("Debe tener mejor ratio de paradas");
		} this.paradas = paradas;
		
	}
	
	public void setPenaltisAtajados(int penaltisAtajados) {
		if(penaltisAtajados < 10) {
			throw new IllegalArgumentException("Debe haber parado más penaltis");
		}this.penaltisAtajados = penaltisAtajados;
	}

	
	@Override
	public String describir() {
		return  "\n PORTERO \n"+
				" | Jugador: "+getNombre()+ "\n"+
				" | Edad: "+getEdad()+"\n"+
				" | Estatura: "+getEstatura()+" m. \n"+
				" | Nacionalidad: "+getNacionalidad()+"\n"+
				" | Posición:  "+getPosicion()+"\n"+
				" | Dorsal: "+getDorsal()+" \n"+
				" | Penaltis parados: "+getPenaltisAtajados()+" \n"+
				" | Atajadas por partido: " +getParadas()+"\n"+			
				" | Valor de mercado: "+getPrecio();}

	@Override
	public double calcularPrecioVenta() {
		// TODO Auto-generated method stub
		double precioVenta = getPrecio() + (getParadas() * 0.5);
		return precioVenta;
		
		
	}

	@Override
	public boolean esTranferible() {
		
		return getEdad() < 35;
	}

}
