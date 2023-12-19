package p04;

public class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero("minato", "hero", 280);
		Hero h2 = new Hero("asaka", "witch", 32000);
		Hero h3 = new Hero("sugawara", "sage", 41000);

		final String FORMAT = "%-9s %-13s 所持金%,8d";

		String str1 =
				String.format(FORMAT, h1.getName(), h1.getJob(), h1.getGold());
		System.out.println(str1);
		
		String str2 =
				String.format(FORMAT, h2.getName(), h2.getJob(), h2.getGold());
		System.out.println(str2);
		
		String str3 =
				String.format(FORMAT, h3.getName(), h3.getJob(), h3.getGold());
		System.out.println(str3);
		
//		String str4 =
//				String.format("%,-9s %-13s 所持金%,8d", h3.getName(), h3.getJob(), h3.getGold());
		
		System.out.printf("製品番号%s-%02d","SJV",3);
	}
}
