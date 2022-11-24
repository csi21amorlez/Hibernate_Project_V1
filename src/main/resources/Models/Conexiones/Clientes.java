package Conexiones;

class Clientes {
	
	private int id_cliente;
	private String nombre;
	private String apellidos;
	private String direccion;
	
//	Constructor
	public Clientes() {	}
	
	//Getters
	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;		
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;		
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;		
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;		
	}
//	Setters
	public int getId_cliente() {
		return this.id_cliente;
	}
	public String getNombre() {
		return this.nombre;
	}
	public String getApellidos() {
		return this.apellidos;
	}
	public String getDireccion() {
		return this.direccion;
	}
	
}
