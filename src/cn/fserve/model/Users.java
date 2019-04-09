package cn.fserve.model;

public class Users {

	private int id;
	private String user_name;
	private String user_email;
	private String user_password;
	private String user_address;
	private String user_phone;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_address() {
		return user_address;
	}

	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}

	public String getUser_phone() {
		return user_phone;
	}

	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}

	public Users(int id, String user_name, String user_email, String user_password, String user_address,
			String user_phone) {
		super();
		this.id = id;
		this.user_name = user_name;
		this.user_email = user_email;
		this.user_password = user_password;
		this.user_address = user_address;
		this.user_phone = user_phone;
	}

	public Users() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", user_name=" + user_name + ", user_email=" + user_email + ", user_password="
				+ user_password + ", user_address=" + user_address + ", user_phone=" + user_phone + "]";
	}

}
