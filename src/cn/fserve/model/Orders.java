package cn.fserve.model;

public class Orders {

	private int id;
	private String goods_id;
	private String goods_number;
	private String acquiring;
	private String send_goods;
	private String address;
	private String phone;
	private String order_number;

	private String pet_type;
	private String pet_number;

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

	public String getPet_type() {
		return pet_type;
	}

	public void setPet_type(String pet_type) {
		this.pet_type = pet_type;
	}

	public String getPet_number() {
		return pet_number;
	}

	public void setPet_number(String pet_number) {
		this.pet_number = pet_number;
	}

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orders(int id, String goods_id, String goods_number, String acquiring, String send_goods, String address,
			String phone, String order_number, String pet_type, String pet_number) {
		super();
		this.id = id;
		this.goods_id = goods_id;
		this.goods_number = goods_number;
		this.acquiring = acquiring;
		this.send_goods = send_goods;
		this.address = address;
		this.phone = phone;
		this.order_number = order_number;
		this.pet_type = pet_type;
		this.pet_number = pet_number;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", goods_id=" + goods_id + ", goods_number=" + goods_number + ", acquiring="
				+ acquiring + ", send_goods=" + send_goods + ", address=" + address + ", phone=" + phone
				+ ", order_number=" + order_number + ", pet_type=" + pet_type + ", pet_number=" + pet_number + "]";
	}

}
