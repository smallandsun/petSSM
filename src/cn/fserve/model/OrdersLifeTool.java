package cn.fserve.model;

public class OrdersLifeTool {

	private int id;
	private String goods_id;
	private String goods_number;
	private String acquiring;
	private String send_goods;
	private String address;
	private String phone;
	private String order_number;

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

	public String getGoods_id() {
		return goods_id;
	}

	public void setGoods_id(String goods_id) {
		this.goods_id = goods_id;
	}

	public String getGoods_number() {
		return goods_number;
	}

	public void setGoods_number(String goods_number) {
		this.goods_number = goods_number;
	}

	public String getAcquiring() {
		return acquiring;
	}

	public void setAcquiring(String acquiring) {
		this.acquiring = acquiring;
	}

	public String getSend_goods() {
		return send_goods;
	}

	public void setSend_goods(String send_goods) {
		this.send_goods = send_goods;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getOrder_number() {
		return order_number;
	}

	public void setOrder_number(String order_number) {
		this.order_number = order_number;
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

	public OrdersLifeTool() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrdersLifeTool(int id, String goods_id, String goods_number, String acquiring, String send_goods,
			String address, String phone, String order_number, String tool_category, String tool_type, String tool_name,
			String tool_price, String tool_number, String fit_type, String tool_size, String tool_weight,
			String tool_desc, String tool_img_path, String admin_user_id) {
		super();
		this.id = id;
		this.goods_id = goods_id;
		this.goods_number = goods_number;
		this.acquiring = acquiring;
		this.send_goods = send_goods;
		this.address = address;
		this.phone = phone;
		this.order_number = order_number;
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
		return "OrdersLifeTool [id=" + id + ", goods_id=" + goods_id + ", goods_number=" + goods_number + ", acquiring="
				+ acquiring + ", send_goods=" + send_goods + ", address=" + address + ", phone=" + phone
				+ ", order_number=" + order_number + ", tool_category=" + tool_category + ", tool_type=" + tool_type
				+ ", tool_name=" + tool_name + ", tool_price=" + tool_price + ", tool_number=" + tool_number
				+ ", fit_type=" + fit_type + ", tool_size=" + tool_size + ", tool_weight=" + tool_weight
				+ ", tool_desc=" + tool_desc + ", tool_img_path=" + tool_img_path + ", admin_user_id=" + admin_user_id
				+ "]";
	}

}
