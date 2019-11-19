package main;

public class User {
	
	public String username;
	
	public User(String username) {
		this.username = username;
	}
	
	public void establishRoleAdmin() {
		Administrator admin = new Administrator();
		admin.work();
	}
	
	class Administrator {
		public void work() {
			System.out.println("El trabajador " + username + " ha empezado a trabajar");
		}
		
	}

}
