package kadai_017;

//抽象クラス(家族クラス)
abstract public class Kato_Chapter17 {
	//フィールド
	public String familyName = "加藤"; //姓
	public String givenName = ""; //名
	public String address = "東京都中野区〇×"; //住所
	
	//共通の紹介
	public void commonlntroduce() {
		System.out.println(familyName); //姓
		System.out.println(address); //住所
	}
	//個別の紹介(抽象メソッド)
	abstract public void eachlntroduce(); //個別の紹介
	
	//紹介を実行
	public void execlntroduce() {
		
	}
} 