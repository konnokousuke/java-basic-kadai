package kadai_017;

public class KatoIchiro_Chapter17 extends Kato_Chapter17 {
	//セッター
		public void setGivenName(String givenName) {
			this.givenName = givenName;
		}
		
		// 抽象メソッド　個別の紹介
		public void eachlntroduce() {
			System.out.println("好きな食べ物はリンゴです");
		}
		
		public void execlntroduc() {
			System.out.println("名前は" + familyName + givenName + "です");
			System.out.println("住所は" + address + "です");
			eachlntroduce();
			System.out.println("");
		}
}
