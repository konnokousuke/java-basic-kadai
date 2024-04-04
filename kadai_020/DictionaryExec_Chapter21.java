package kadai_020;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// 辞書クラスのインスタンスを作成
		Dictionary_Chapter20 myDictionary = new Dictionary_Chapter20();
		
		//調べる英単語の配列
		String[] wordsToCheck = {"apple", "banana", "grape", "orange"};
		
		//辞書を調べる
		myDictionary.checkWords(wordsToCheck);

	}

}
