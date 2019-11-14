package main;

public class Usuario {

	// Modificadores:
	// default
	// public
	// private
	// protected
	
	public String username;
	private String password;
	
	// Constructor
	public Usuario(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	// sobrecarga constructores
	public Usuario() {
		this.username = "";
	}
	
	public Usuario(String username) {
		this.username = username;
	}
	
	public void saluda() {
		System.out.println("saludando a " + this.username);
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
