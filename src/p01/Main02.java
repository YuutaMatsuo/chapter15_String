package p01;

public class Main02 {
	public static void main(String[] args) {
		String s1 = "Java and JavaSclipt";
		
		//文字列を検索する
		
		// 引数で渡される文字列が含まれているか確認する
		System.out.println(s1.contains("Java"));
		
		// 引数で渡された文字列で始まっているか調べる
		System.out.println(s1.startsWith("Java"));
		// 引数で渡された文字列で終っているか調べる
		System.out.println(s1.endsWith("Java"));
		
		// 文字または文字列が最初に登場する位置を調べる
		System.out.println(s1.indexOf("Java"));
		// 文字または文字列を後ろから検索して最初に登場する位置を調べる
		System.out.println(s1.lastIndexOf("Java"));
	}
}
