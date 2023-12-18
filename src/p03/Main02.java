package p03;

public class Main02 {
	public static void main(String[] args) {
		String str01 = "one,two,three";
		System.out.println(str01);
		
		// splitメソッド：文字列の分割
		String[] nums = str01.split(",");
		for (String num : nums) {
			System.out.println(num);
		}
		// 空白文字で分割する
		String str02 = "one two three";
		System.out.println(str02);
		String[] nums02 = str02.split("\s");
		for (String num : nums02) {
			System.out.print(num);
		}
		System.out.println();
		
		// replaceAllメソッド：文字列の置換
		String str03 = "Sava Zava Gava";
		System.out.println(str03);
		
		String str04 = str03.replaceAll("[SZG]","J");
		System.out.println(str04);
		
		String str05 = "かきくけこ";
		str05 = str05.replaceAll("かきく","あいう");
		System.out.println(str05);
	}
}
