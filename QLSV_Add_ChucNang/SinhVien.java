package QLSV_Add_ChucNang;

public class SinhVien {

	private String name, id, major, homeTown;
	private int age;

	public SinhVien(String name, int age, String id, String major, String homeTown) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.major = major;
		this.homeTown = homeTown;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getHomeTown() {
		return homeTown;
	}

	public void setHomeTown(String homeTown) {
		this.homeTown = homeTown;
	}

	@Override
	public String toString() {
		return "SinhVien [name=" + name + ", age=" + age + ", id=" + id + ", major=" + major + ", homeTown=" + homeTown
				+ "]";
	}

}
