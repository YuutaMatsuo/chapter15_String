package p02;

public class Main01 {
	public static void main(String[] args) {
//		String str = new String("ABC");
		String str = "ABC";
		str += "DEF";
		System.out.println(str);
		
		StringBuilder sb = new StringBuilder("ABC");
		//StringBuilderに対して連結をする
		sb.append("DEF");
		System.out.println(sb);
	}
}
