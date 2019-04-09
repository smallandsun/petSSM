package cn.fserve.model;

public class VagrancyAdopt {

	private int id;
	private String vagrancy_type;
	private String vagrancy_desc;
	private String adopter_id;
	private String vagrancy_acquiring;

	private String user_name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVagrancy_type() {
		return vagrancy_type;
	}

	public void setVagrancy_type(String vagrancy_type) {
		this.vagrancy_type = vagrancy_type;
	}

	public String getVagrancy_desc() {
		return vagrancy_desc;
	}

	public void setVagrancy_desc(String vagrancy_desc) {
		this.vagrancy_desc = vagrancy_desc;
	}

	public String getAdopter_id() {
		return adopter_id;
	}

	public void setAdopter_id(String adopter_id) {
		this.adopter_id = adopter_id;
	}

	public String getVagrancy_acquiring() {
		return vagrancy_acquiring;
	}

	public void setVagrancy_acquiring(String vagrancy_acquiring) {
		this.vagrancy_acquiring = vagrancy_acquiring;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public VagrancyAdopt() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VagrancyAdopt(int id, String vagrancy_type, String vagrancy_desc, String adopter_id,
			String vagrancy_acquiring, String user_name) {
		super();
		this.id = id;
		this.vagrancy_type = vagrancy_type;
		this.vagrancy_desc = vagrancy_desc;
		this.adopter_id = adopter_id;
		this.vagrancy_acquiring = vagrancy_acquiring;
		this.user_name = user_name;
	}

	@Override
	public String toString() {
		return "VagrancyAdopt [id=" + id + ", vagrancy_type=" + vagrancy_type + ", vagrancy_desc=" + vagrancy_desc
				+ ", adopter_id=" + adopter_id + ", vagrancy_acquiring=" + vagrancy_acquiring + ", user_name="
				+ user_name + "]";
	}

}
