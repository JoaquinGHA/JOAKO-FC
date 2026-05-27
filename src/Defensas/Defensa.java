package Defensas;

import INTERFAZ.ITransferible;
import JugadorBase.Jugador;

public class Defensa extends Jugador implements ITransferible {
	
	//Variables de defensa
	private double medidaSalto;
	private double mediaRecuperaciones;
	
	
	//Constructor para defensa
	public Defensa(String nombre, int edad, double precio, double estatura, String posicion, String nacionalidad, double medidaSalto, double mediaRecuperaciones, int dorsal ) {
		super(nombre, edad, precio, estatura, posicion, nacionalidad, dorsal);
		setMedidaSalto(medidaSalto);
		setMediaRecuperaciones(mediaRecuperaciones);
		
		
		
	}
	
	
	//Getters de las variables de Defensa
	public double getMedidaSalto() {return medidaSalto;}
	public double getMediaRecuperaciones() {return mediaRecuperaciones;}
	
	
	//Setters de validación
	public void setMedidaSalto(double medidaSalto) {
		if (medidaSalto  < 50.5) {throw new IllegalArgumentException("La altura del salto debe ser mayor");}
		this.medidaSalto = medidaSalto;
	}
	public void setMediaRecuperaciones(double mediaRecuperaciones) {
		if(mediaRecuperaciones < 5.5) {throw new IllegalArgumentException("La media de recuperaciones por partido es muy baja");}
		this.mediaRecuperaciones = mediaRecuperaciones;
	}
	
	@Override
	public String describir() {
		// TODO Auto-generated method stub
		return "\n DEFENSA \n"+
			    " | Jugador: "+getNombre()+ "\n"+
				" | Edad: "+getEdad()+"\n"+
				" | Estatura: "+getEstatura()+" m. \n"+
				" | Nacionalidad: "+getNacionalidad()+"\n"+
				" | Posición:  "+getPosicion()+"\n"+
				" | Dorsal: "+getDorsal()+" \n"+
				" | Altura de salto: "+getMedidaSalto()+" cm. \n"+
				" | Recuperaciones por partido: " +getMediaRecuperaciones()+"\n"+			
				" | Valor de mercado: "+getPrecio();
				
	}


	@Override
	public double calcularPrecioVenta() {
		double precioVenta = getPrecio() + (getMediaRecuperaciones() * 0.5);
		return precioVenta;
	}


	@Override
	public boolean esTranferible() {
		// TODO Auto-generated method stub
		return getEdad() < 34 && getMediaRecuperaciones() >= 5;
	}
	 

}
