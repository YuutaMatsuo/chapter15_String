package p03;

public class Main01 {
	public static void main(String[] args) {
		// パターンマッチング

		System.out.println("通常の文字：その文字で無ければならない");
		printLine();
		String str01 = "ABC";
		// 正規表現と完全に一致するかどうかをマッチングする
		System.out.println(str01.matches("ABC"));
		System.out.println(str01.matches("ABD"));
		System.out.println("ABBC".matches(str01));
		System.out.println();

		System.out.println("ピリオド：任意の1文字であればよい");
		printLine();
		String str02 = "A.C"; // 「.」（ピリオド）は任意の一文字を表す
		System.out.println("AC".matches(str02)); // A.Cの間に１文字あればtrueを返す
		System.out.println("ABC".matches(str02));
		System.out.println("ACC".matches(str02));
		System.out.println("ABBC".matches(str02));
		System.out.println();

		System.out.println("アスタリスク：直前の文字の0回以上の繰り返し");
		printLine();
		String str03 = "AB*C"; // に文字目のBが0回以上繰り返されているか
		System.out.println("AC".matches(str03)); // 0回
		System.out.println("ABC".matches(str03)); // 1回
		System.out.println("ABBC".matches(str03)); // 1回
		System.out.println("ACCCC".matches(str03)); // Cが繰り返されるとfalse
		System.out.println();

		System.out.println("波カッコ：指定回数の繰り返し");
		printLine();
		String str04 = "HEL{2}O";
		String str041 = "HEL{2,5}";
		System.out.println("HELLO".matches(str04)); // 「L」を２回以上、5回以下繰り返されているか
		System.out.println("HELLLO".matches(str041));

		String str05 = "AB?C"; // Bが0回、または１回あるかどうか
		System.out.println("AC".matches(str05));
		System.out.println("ABC".matches(str05));

		String str06 = "AB+C";
		System.out.println("AC".matches(str06));
		System.out.println("ABC.".matches(str06));

	}

	public static void printLine() {
		System.out.println("------------------------------------------");
	}

	// matchesメソッドを使わないパターンマッチング
	public boolean isValidPlayerName(String name) {
		if (name.length() != 8) {
			return false;
		}
		char first = name.charAt(0);
		if (!(first >= 'A' && first <= 'Z')) {
			return false;
		}
		for (int i = 1; i < 8; i++) {
			char c = name.charAt(i);
			if (!((c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))) {
				return false;
			}
		}
		return true;
	}
}
