package JugadorBase;

public abstract class Jugador {
	//Características bases
	private String nombre;
	private int edad;
	private double precio;
	private double estatura;
	private String posicion;
	private String nacionalidad;
	private int dorsal;
	
	
	//Constructor
	public Jugador (String nombre, int edad, double precio, double estatura, String posicion, String nacionalidad, int dorsal) {
		this.nombre = nombre;
		setEdad(edad);
		setPrecio(precio);
		setEstatura(estatura);
		this.posicion = posicion;
		this.nacionalidad = nacionalidad;
		setDorsal(dorsal);
		
	}
	
	//Getters
	public String getNombre() {return nombre;}
	public String getPosicion() {return posicion;}
	public String getNacionalidad() {return nacionalidad;}
	public int getEdad() {return edad;} 
	public double getPrecio() {return precio;}
	public double getEstatura() {return estatura;}
	public int getDorsal() {return dorsal;}
	
	
	//Setter para comprobar edad, precio y estatura
	
	public void setEdad (int edad) {
		if(edad < 15) {throw new IllegalArgumentException("Edad no valida, debe ser mayor que 15");}
		this.edad = edad;}
	
	public void setPrecio(double precio) {
		if(precio < 0) {throw new IllegalArgumentException("Precio no valido, debe ser mayor que cero");}
		this.precio = precio;}
	
	public void setEstatura(double estatura) {
		if(estatura < 1.40) {throw new IllegalArgumentException("Estatura debe ser mínimo 1.40 metros.");}
		this.estatura = estatura;}
	
	public void setDorsal(int dorsal) {
		if(dorsal <= 0) {throw new IllegalArgumentException("El dorsal no puede ser 0 o menor a cero");}
		this.dorsal = dorsal;
	}

	
	
	//Método: info del jugador
	 public abstract String describir();
	
	
}
