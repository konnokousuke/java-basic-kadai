package kadai_024;

public class JyankenExec_Chapter24 {

	public static void main(String[] args) {
		//じゃんけんクラスのインスタンスを作成
		Jyanken_Chapter24 jyanken = new Jyanken_Chapter24();
		
		//自分の手を入力して取得する
		String myChoice = jyanken.getMyChoice();
		
		
		//相手の手をランダムに取得する
		String randomChoice = jyanken.getRandom();
		
		
		//じゃんけんの結果を表示する
		jyanken.playGame(myChoice, randomChoice);
	}

}