package Delanteros;
import INTERFAZ.ITransferible;
import JugadorBase.Jugador;

public class Delantero extends Jugador implements ITransferible {
	
	//Variables de Delantero
	private int goles;
	private double golesEsperados;
	private double velocidad;

	public Delantero(String nombre, int edad, double precio, double estatura, String posicion, String nacionalidad, int goles, double golesEsperados, double velocidad, int dorsal ) {
		super(nombre, edad, precio, estatura, posicion, nacionalidad, dorsal);
		setGoles(goles);
		setGolesEsperados(golesEsperados);
		setVelocidad(velocidad);
		// TODO Auto-generated constructor stub
	}
	
	//Getter para llamar alas variables de delantero
	public int getGoles() {return goles;}
	public double getGolesEsperados() {return golesEsperados;}
	public double getVelocidad() {return velocidad;}
	
	
	//Setters de validación
	public void setGoles(int goles) {
		if(goles < 10) {throw new IllegalArgumentException("Debe haber hecho más de 10 goles");}
		this.goles = goles;
	}
	public void setGolesEsperados(double golesEsperados) {
		if(golesEsperados < 1.5) {throw new IllegalArgumentException("El ratio de goles por partidos debe ser mayor");}
		this.golesEsperados = golesEsperados;
	}
	public void setVelocidad(double velocidad) {
		if(velocidad < 20) {throw new IllegalArgumentException("La velocidad media debe ser mayor");}
		this.velocidad = velocidad;
	}

	@Override
	public String describir() {
		return  "\n DELANTERO \n"+
				" | Jugador: "+getNombre()+ "\n"+
				" | Edad: "+getEdad()+"\n"+
				" | Estatura: "+getEstatura()+" m. \n"+
				" | Nacionalidad: "+getNacionalidad()+"\n"+
				" | Posición:  "+getPosicion()+"\n"+
				" | Dorsal: "+getDorsal()+" \n"+
				" | Goles: "+getGoles()+" \n"+
				" | Goles esperados partidos: " +getGolesEsperados()+" por partidos \n"+			
				" | Velolcidad media: "+getVelocidad()+ " km/h \n"+
		        " | Valor de mercado: "+getPrecio();}

	@Override
	public double calcularPrecioVenta() {
		double precioVenta = getPrecio() + (getGoles() * 0.5);
		return precioVenta;
	}

	@Override
	public boolean esTranferible() {
		// TODO Auto-generated method stub
		return getEdad() < 33 && getGoles() < 30;
	}
	

}
