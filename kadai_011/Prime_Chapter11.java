package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		
		// 素数か判定する配列
		boolean[] prinumArray = new boolean[101];
		
		// 繰り返しtrueで初期化
		for( int i = 1; i < prinumArray.length; i++ ) {
			prinumArray[i] = true;
		}
		
		// 割る数 2~100まで繰り返し
		for( int j = 2; j < 101; j++ ) {
			// 割る数で割り切れるか判定
			for( int k = 2; k < j; k++ ) {
				if( j % k == 0 ) {
					prinumArray[j] = false;
					break;
				}
			}
		}
		// 素数を出力
		for( int l = 2; l < prinumArray.length; l++ ) {
			if( prinumArray[l] == true ) {
				System.out.println(l);
			}
		}
	}

}