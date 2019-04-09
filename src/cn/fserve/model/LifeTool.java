package cn.fserve.model;

public class LifeTool {

	private int id;
	private String tool_category;
	private String tool_type;
	private String tool_name;
	private String tool_price;
	private String tool_number;
	private String fit_type;
	private String tool_size;
	private String tool_weight;
	private String tool_desc;
	private String tool_img_path;
	private String admin_user_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTool_category() {
		return tool_category;
	}

	public void setTool_category(String tool_category) {
		this.tool_category = tool_category;
	}

	public String getTool_type() {
		return tool_type;
	}

	public void setTool_type(String tool_type) {
		this.tool_type = tool_type;
	}

	public String getTool_name() {
		return tool_name;
	}

	public void setTool_name(String tool_name) {
		this.tool_name = tool_name;
	}

	public String getTool_price() {
		return tool_price;
	}

	public void setTool_price(String tool_price) {
		this.tool_price = tool_price;
	}

	public String getTool_number() {
		return tool_number;
	}

	public void setTool_number(String tool_number) {
		this.tool_number = tool_number;
	}

	public String getFit_type() {
		return fit_type;
	}

	public void setFit_type(String fit_type) {
		this.fit_type = fit_type;
	}

	public String getTool_size() {
		return tool_size;
	}

	public void setTool_size(String tool_size) {
		this.tool_size = tool_size;
	}

	public String getTool_weight() {
		return tool_weight;
	}

	public void setTool_weight(String tool_weight) {
		this.tool_weight = tool_weight;
	}

	public String getTool_desc() {
		return tool_desc;
	}

	public void setTool_desc(String tool_desc) {
		this.tool_desc = tool_desc;
	}

	public String getTool_img_path() {
		return tool_img_path;
	}

	public void setTool_img_path(String tool_img_path) {
		this.tool_img_path = tool_img_path;
	}

	public String getAdmin_user_id() {
		return admin_user_id;
	}

	public void setAdmin_user_id(String admin_user_id) {
		this.admin_user_id = admin_user_id;
	}

	public LifeTool() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LifeTool(int id, String tool_category, String tool_type, String tool_name, String tool_price, String tool_number,
			String fit_type, String tool_size, String tool_weight, String tool_desc, String tool_img_path,
			String admin_user_id) {
		super();
		this.id = id;
		this.tool_category = tool_category;
		this.tool_type = tool_type;
		this.tool_name = tool_name;
		this.tool_price = tool_price;
		this.tool_number = tool_number;
		this.fit_type = fit_type;
		this.tool_size = tool_size;
		this.tool_weight = tool_weight;
		this.tool_desc = tool_desc;
		this.tool_img_path = tool_img_path;
		this.admin_user_id = admin_user_id;
	}

	@Override
	public String toString() {
		return "Tool [id=" + id + ", tool_category=" + tool_category + ", tool_type=" + tool_type + ", tool_name="
				+ tool_name + ", tool_price=" + tool_price + ", tool_number=" + tool_number + ", fit_type=" + fit_type
				+ ", tool_size=" + tool_size + ", tool_weight=" + tool_weight + ", tool_desc=" + tool_desc
				+ ", tool_img_path=" + tool_img_path + ", admin_user_id=" + admin_user_id + "]";
	}

}
