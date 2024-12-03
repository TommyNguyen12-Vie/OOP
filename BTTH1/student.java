package BTTH1;

public class student {
	private String name;
	private String ho;
	private String id;

	public student(String name, String ho, String id) {
		this.name = name;
		this.ho = ho;
		this.id = id;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHo() {
		return ho;
	}

	public void setHo(String ho) {
		this.ho = ho;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "student [name=" + name + ", ho=" + ho + ", id=" + id + "]";
	}

}
