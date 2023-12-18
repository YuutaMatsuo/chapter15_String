package p01;

public class Main04 {
	public static void main(String[] args) {
		String s1 = "OPENCOLLEGE第2教室"; // 大文字
		String s2 = "OpenCollege第2教室"; // 大文字小文字
		String s3 = "第２教室"; // 全角
		String s4 = "第2教室"; // 半角
		String s5 = ""; // 空文字
		String s6 = null; // 参照なし

		// 等価であるか比較
		// 完全一致ではない（大文字と小文字で違いがある）ためfalseが返ってくる
		if (s1.equals(s2)) {
			System.out.println("s1とs2は等しい");
		} else {
			System.out.println("s1とs2は等しくない");
		}

		// 大文字・小文字を区別せずに等価であるか比較
		// ケースを区別しなければ等しいためtrueが返ってくる
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("s1とs2はケースを区別しなければ等しい");
		}

		// 全角・半角を区別せずに等価であるか比較
		// 全角・半角の区別はできないためfalseが返ってくる
		// 全角と半角で消費するバイト数が違うため
		if (s3.equalsIgnoreCase(s4)) {
			System.out.println("s3とs4はケースを区別しなければ等しい");
		} else {
			System.out.println("※全角・半角の区別に「equalsIgnoreCase」は使えない");
		}

		// 空文字との比較は出来るか
		// 空文字との比較はできるためtrueが返ってくる
		if (s5.equalsIgnoreCase("")) {
			System.out.println("空文字との比較はできる。（比較結果：等しい）");
		}

		// nullとの比較はできるか
		// 引数にnullを使うことはできるが、空文字とnullは等しくないためfalseが返ってくる
		if (s5.equalsIgnoreCase(s6)) {
			System.out.println("nullとの比較はできる（比較結果：等しい）");
		} else {
			System.out.println("nullとの比較はできる（比較結果：等しくない）");
		}

		// null同士の比較
		// 例外が発生する
//		if(s6.equalsIgnoreCase(null)) {
//			System.out.println("nullとの比較はできる（比較結果：等しい）");
//		}

		// 変数と引数 どちらのnullが例外になるか確認する
		// 変数に指定したnullの時点で実行時エラーが発生する
//		if (s6.equalsIgnoreCase(s1)) {
//			System.out.println("S1とS6は等しい");
//		}
		
		if(isFullwidth("こんにちは") == true) {
			System.out.println("全角を含まない");
		} else {
			System.out.println("全角を含んでいる");
		}

	}

	// 指定された文字列が、半角英数字（記号も含む）かどうかを死に地で返すメソッドを作ってみる
	// true: 半角英数字である(もしくは対象文字列がない）。 false: 半角英数字ではない
	public static boolean isFullwidth(String str) {
		// 参照なし・もしくは空文字であればtrueを返す
		if (str == null || str.length() == 0) {
			return true;
		}

		// 文字列の長さを取得する（全角・半角を問わず文字の長さを返す）
		int len = str.length();
		// バイト数を取得するgetBytes()を使用する（戻り値はbyte型の配列[文字コードが格納されている]
		byte[] bytes = str.getBytes();
		
		// 確認用
		System.out.println("文字の長さは: " + len);
		System.out.println("文字のバイト数: " + bytes.length);
		
		if(len != bytes.length) {
			return false;
		} else {
			return true;
		}
	}

}
