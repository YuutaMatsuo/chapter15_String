package p04;

public class Hero {
	private String name;// 名前
	private String job; // 職業
	private int gold; // 所持金

	public Hero(String name, String job, int gold) {
		this.name = name;
		this.job = job;
		this.gold = gold;
	}

	public String getName() {
		return name;
	}

	public String getJob() {
		return job;
	}

	public int getGold() {
		return gold;
	}
}
