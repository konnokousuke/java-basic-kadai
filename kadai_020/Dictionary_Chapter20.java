package kadai_020;
import java.util.HashMap;

public class Dictionary_Chapter20 {
	//HashMapを宣言
	public HashMap<String, String> dictionary  = new HashMap<String, String>();
	
	public Dictionary_Chapter20() {
		//辞書の初期化
		dictionary = new HashMap<>();
		//英単語と意味を追加
		dictionary.put("apple","りんご");
		dictionary.put("peach","桃");
		dictionary.put("banana","バナナ");
		dictionary.put("lemon","レモン");
		dictionary.put("pear","梨");
		dictionary.put("kiwi","キウイ");
		dictionary.put("strawberry","いちご");
		dictionary.put("grape","ぶどう");
		dictionary.put("muscat","マスカット");
		dictionary.put("cherry","さくらんぼ");
	}
	
	public void checkWords(String[] wordsToCheck) {
		//辞書に追加された数まで繰り返す
		for (String word : wordsToCheck) {
			if (dictionary.containsKey(word)) {
				System.out.println(word + "の意味は" + dictionary.get(word) );
			} else {
				System.out.println(word + "は辞書に存在しません");
			}
		}
	}

}
