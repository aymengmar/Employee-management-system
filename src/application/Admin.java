package application;

public class Admin {

	@Override
	public String toString() {
		return "Admin [id=" + id + ", UserName=" + UserName + ", Password=" + Password + "]";
	}


	private int id;
	private String UserName;
	private String 	Password;
	
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Admin(int id, String userName, String password) {
		super();
		this.id = id;
		UserName = userName;
		Password = password;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUserName() {
		return UserName;
	}


	public void setUserName(String userName) {
		UserName = userName;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}
	
	
	

}
