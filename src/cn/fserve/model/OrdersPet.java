package cn.fserve.model;

public class OrdersPet {

	private int id;
	private String goods_id;
	private String goods_number;
	private String acquiring;
	private String send_goods;
	private String address;
	private String phone;
	private String order_number;

	private String pet_category;
	private String pet_type;
	private String pet_name;
	private String pet_price;
	private String pet_number;
	private String pet_age;
	private String pet_shape;
	private String pet_food;
	private String pet_purpose;
	private String pet_weight;
	private String pet_sex;
	private String pet_marriage;
	private String pet_certificate;
	private String pet_desc;
	private String pet_img_path;
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

	public String getPet_category() {
		return pet_category;
	}

	public void setPet_category(String pet_category) {
		this.pet_category = pet_category;
	}

	public String getPet_type() {
		return pet_type;
	}

	public void setPet_type(String pet_type) {
		this.pet_type = pet_type;
	}

	public String getPet_name() {
		return pet_name;
	}

	public void setPet_name(String pet_name) {
		this.pet_name = pet_name;
	}

	public String getPet_price() {
		return pet_price;
	}

	public void setPet_price(String pet_price) {
		this.pet_price = pet_price;
	}

	public String getPet_number() {
		return pet_number;
	}

	public void setPet_number(String pet_number) {
		this.pet_number = pet_number;
	}

	public String getPet_age() {
		return pet_age;
	}

	public void setPet_age(String pet_age) {
		this.pet_age = pet_age;
	}

	public String getPet_shape() {
		return pet_shape;
	}

	public void setPet_shape(String pet_shape) {
		this.pet_shape = pet_shape;
	}

	public String getPet_food() {
		return pet_food;
	}

	public void setPet_food(String pet_food) {
		this.pet_food = pet_food;
	}

	public String getPet_purpose() {
		return pet_purpose;
	}

	public void setPet_purpose(String pet_purpose) {
		this.pet_purpose = pet_purpose;
	}

	public String getPet_weight() {
		return pet_weight;
	}

	public void setPet_weight(String pet_weight) {
		this.pet_weight = pet_weight;
	}

	public String getPet_sex() {
		return pet_sex;
	}

	public void setPet_sex(String pet_sex) {
		this.pet_sex = pet_sex;
	}

	public String getPet_marriage() {
		return pet_marriage;
	}

	public void setPet_marriage(String pet_marriage) {
		this.pet_marriage = pet_marriage;
	}

	public String getPet_certificate() {
		return pet_certificate;
	}

	public void setPet_certificate(String pet_certificate) {
		this.pet_certificate = pet_certificate;
	}

	public String getPet_desc() {
		return pet_desc;
	}

	public void setPet_desc(String pet_desc) {
		this.pet_desc = pet_desc;
	}

	public String getPet_img_path() {
		return pet_img_path;
	}

	public void setPet_img_path(String pet_img_path) {
		this.pet_img_path = pet_img_path;
	}

	public String getAdmin_user_id() {
		return admin_user_id;
	}

	public void setAdmin_user_id(String admin_user_id) {
		this.admin_user_id = admin_user_id;
	}

	public OrdersPet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrdersPet(int id, String goods_id, String goods_number, String acquiring, String send_goods, String address,
			String phone, String order_number, String pet_category, String pet_type, String pet_name, String pet_price,
			String pet_number, String pet_age, String pet_shape, String pet_food, String pet_purpose, String pet_weight,
			String pet_sex, String pet_marriage, String pet_certificate, String pet_desc, String pet_img_path,
			String admin_user_id) {
		super();
		this.id = id;
		this.goods_id = goods_id;
		this.goods_number = goods_number;
		this.acquiring = acquiring;
		this.send_goods = send_goods;
		this.address = address;
		this.phone = phone;
		this.order_number = order_number;
		this.pet_category = pet_category;
		this.pet_type = pet_type;
		this.pet_name = pet_name;
		this.pet_price = pet_price;
		this.pet_number = pet_number;
		this.pet_age = pet_age;
		this.pet_shape = pet_shape;
		this.pet_food = pet_food;
		this.pet_purpose = pet_purpose;
		this.pet_weight = pet_weight;
		this.pet_sex = pet_sex;
		this.pet_marriage = pet_marriage;
		this.pet_certificate = pet_certificate;
		this.pet_desc = pet_desc;
		this.pet_img_path = pet_img_path;
		this.admin_user_id = admin_user_id;
	}

	@Override
	public String toString() {
		return "OrdersPet [id=" + id + ", goods_id=" + goods_id + ", goods_number=" + goods_number + ", acquiring="
				+ acquiring + ", send_goods=" + send_goods + ", address=" + address + ", phone=" + phone
				+ ", order_number=" + order_number + ", pet_category=" + pet_category + ", pet_type=" + pet_type
				+ ", pet_name=" + pet_name + ", pet_price=" + pet_price + ", pet_number=" + pet_number + ", pet_age="
				+ pet_age + ", pet_shape=" + pet_shape + ", pet_food=" + pet_food + ", pet_purpose=" + pet_purpose
				+ ", pet_weight=" + pet_weight + ", pet_sex=" + pet_sex + ", pet_marriage=" + pet_marriage
				+ ", pet_certificate=" + pet_certificate + ", pet_desc=" + pet_desc + ", pet_img_path=" + pet_img_path
				+ ", admin_user_id=" + admin_user_id + "]";
	}

}
