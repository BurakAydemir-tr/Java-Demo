package gameSalesDemo;

public class Campaign  implements Entity {
	private int id;
	private String type;
	private double rate;
	
	public Campaign() {
		
	}
	
	public Campaign(int id, String type, double rate) {
		super();
		this.id = id;
		this.type = type;
		this.rate = rate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
}
