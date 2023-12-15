package p01;

public class Main03 {
	public static void main(String[] args) {
		String s1 = "Java programming";
		String s2 = " 	Java programming   ";
		
		// 文字列を切り出す
		
		// 指定位置の１文字を切り出す
		System.out.println(s1.charAt(0));
		char c1 = s1.charAt(0);
		
		// 指定位置から始まる文字列を任意の長さだけ切り出す
		System.out.println(s1.substring(3));
		System.out.println(s1.substring(3,8));
		
		// 文字列を変換する
		
		// 大文字を小文字に変換する
		System.out.println(s1.toLowerCase());
		// 小文字を大文字に変換する
		System.out.println(s1.toUpperCase());
		
		// 前後の空白を除去する
		System.out.println(s2.trim());
		
		// 文字列を置き換える
		System.out.println(s1.replace("Java", "Python"));
	}
}
