package p02;

public class Main03 {
	public static void main(String[] args) {
		long start;
		long end;
		String str = "";
		StringBuilder sb = new StringBuilder();

		// API:SystemクラスのnanoTime()...
		// 現在の時間をナノ秒単位（10億ナノ秒＝1秒）で返す（戻り値：long型）

		// 文字列連結開始位置
		start = System.nanoTime();
		for (int i = 0; i < 100000; i++) {
			sb.append("A");
		}
		// 文字列連結終了位置
		end = System.nanoTime();

		System.out.println((end - start) + "ns");
	}
}
