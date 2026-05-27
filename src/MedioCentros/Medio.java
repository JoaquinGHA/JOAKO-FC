package MedioCentros;
import INTERFAZ.ITransferible;
import JugadorBase.Jugador;

public class Medio extends Jugador implements ITransferible {
	
	//Variables únicas de Medio
	private double pases;
	private String rol;
	private double asistenciasEsperadas;

	//Constructor Medio
	public Medio(String nombre, int edad, double precio, double estatura, String posicion, String nacionalidad, double pases, String rol, double asistenciasEsperadas, int dorsal) {
		super(nombre, edad, precio, estatura, posicion, nacionalidad, dorsal);
		
		setPases(pases);
		this.rol = rol;
		setAsistenciasEsperadas(asistenciasEsperadas);
		
		// TODO Auto-generated constructor stub
	}
	
	//Getters para variables de Medio
	public double getPases() {return pases;}
	public String getRol() {return rol;}
	public double getAsistenciasEsperadas() {return asistenciasEsperadas;}
	
	
	//Setter de comprobación
	public void setPases(double pases) {
		if(pases < 20) {throw new IllegalArgumentException("Debe tener más pases realizados");}
		this.pases = pases;
	}
	public void setAsistenciasEsperadas(double asistenciasEsperadas) {
		if(asistenciasEsperadas < 1.9) {throw new IllegalArgumentException("El ratio de asistencias esperadas debería ser mayor");}
		this.asistenciasEsperadas = asistenciasEsperadas;
	}

	@Override
	public String describir() {
		return  "\n MEDIOS \n"+
				" | Jugador: "+getNombre()+ "\n"+
				" | Edad: "+getEdad()+"\n"+
				" | Estatura: "+getEstatura()+" m. \n"+
				" | Nacionalidad: "+getNacionalidad()+"\n"+
				" | Posición:  "+getPosicion()+"\n"+
				" | Dorsal: "+getDorsal()+" \n"+
				" | Rol en el juego:  "+getRol()+"\n"+
				" | Pases: "+getPases()+" \n"+
				" | Aistencias esperadas por partidos: " +getAsistenciasEsperadas()+" por partidos \n"+			
				" | Valor de mercado: "+getPrecio();
	}

	@Override
	public double calcularPrecioVenta() {
	
				double precioVenta = getPrecio() + (getPases() * 0.5);
				return precioVenta;
	}

	@Override
	public boolean esTranferible() {
		
		return getEdad() < 31 && getPases() < 25;
	}

}
