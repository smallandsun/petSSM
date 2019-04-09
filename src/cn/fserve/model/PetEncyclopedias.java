package cn.fserve.model;

public class PetEncyclopedias {

	private int id;
	private String pet_category;
	private String pet_type;
	private String pet_desc;
	private String pet_feed_mode;
	private String pet_mpg_ch;
	private String pet_life_habits;
	private String pet_matters_attention;
	private String img_path;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getPet_desc() {
		return pet_desc;
	}

	public void setPet_desc(String pet_desc) {
		this.pet_desc = pet_desc;
	}

	public String getPet_feed_mode() {
		return pet_feed_mode;
	}

	public void setPet_feed_mode(String pet_feed_mode) {
		this.pet_feed_mode = pet_feed_mode;
	}

	public String getPet_mpg_ch() {
		return pet_mpg_ch;
	}

	public void setPet_mpg_ch(String pet_mpg_ch) {
		this.pet_mpg_ch = pet_mpg_ch;
	}

	public String getPet_life_habits() {
		return pet_life_habits;
	}

	public void setPet_life_habits(String pet_life_habits) {
		this.pet_life_habits = pet_life_habits;
	}

	public String getPet_matters_attention() {
		return pet_matters_attention;
	}

	public void setPet_matters_attention(String pet_matters_attention) {
		this.pet_matters_attention = pet_matters_attention;
	}

	public String getImg_path() {
		return img_path;
	}

	public void setImg_path(String img_path) {
		this.img_path = img_path;
	}

	public PetEncyclopedias() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PetEncyclopedias(int id, String pet_category, String pet_type, String pet_desc, String pet_feed_mode,
			String pet_mpg_ch, String pet_life_habits, String pet_matters_attention, String img_path) {
		super();
		this.id = id;
		this.pet_category = pet_category;
		this.pet_type = pet_type;
		this.pet_desc = pet_desc;
		this.pet_feed_mode = pet_feed_mode;
		this.pet_mpg_ch = pet_mpg_ch;
		this.pet_life_habits = pet_life_habits;
		this.pet_matters_attention = pet_matters_attention;
		this.img_path = img_path;
	}

	@Override
	public String toString() {
		return "PetEncyclopedias [id=" + id + ", pet_category=" + pet_category + ", pet_type=" + pet_type
				+ ", pet_desc=" + pet_desc + ", pet_feed_mode=" + pet_feed_mode + ", pet_mpg_ch=" + pet_mpg_ch
				+ ", pet_life_habits=" + pet_life_habits + ", pet_matters_attention=" + pet_matters_attention
				+ ", img_path=" + img_path + "]";
	}

}
