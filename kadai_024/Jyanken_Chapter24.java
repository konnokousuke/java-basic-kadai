package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	// Scannerクラスのオブジェクトをクラス変数として定義する
	private static Scanner scanner = new Scanner(System.in);
	
	//じゃんけんの手を入力するメソッド
	public String getMyChoice() {
		String choice = "";
		
		while(true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			
			//入力した内容を取得する
			choice = scanner.next();
			
			//入力した内容が正しいか判定する
			if (choice.equals("r") || choice.equals("s") || choice.equals("p")) {
				break; //正しい手が入力されたらループを抜ける
			} else {
				System.out.println("正しいじゃんけんの手を入力してください");
			}
		}
		
		return choice;
		
	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶメソッド
	public String getRandom() {
		//じゃんけんの配列
		String[] jyankenArray = {"グー", "チョキ", "パー"};
		
		//乱数で対戦相手のじゃんけんの手を選ぶ
		int randomIndex = (int) (Math.floor(Math.random() * 3));
		return jyankenArray[randomIndex];
	}
	
	//じゃんけんを行うメソッド
	public void playGame(String myChoice, String randomChoice) {
		HashMap<String,String> jyankenMap = new HashMap<String,String>();
		
		jyankenMap.put("r", "グー"); //グーを表す
		jyankenMap.put("s", "チョキ"); //チョキを表す
		jyankenMap.put("p", "パー"); //パーを表す
		
		//自分と相手のじゃんけんの手を出力する
		String myHand = jyankenMap.get(myChoice);
		String randomHand = jyankenMap.get(randomChoice);
		System.out.println("自分の手は" + myHand + "," + "対戦相手の手は" + randomChoice);
		
		//じゃんけんの手を比較して勝敗を判定する
		switch (myChoice) {
        case "r" -> {
            switch (randomChoice) {
                case "グー" -> System.out.println("あいこです");
                case "チョキ" -> System.out.println("自分の勝ちです");
                case "パー" -> System.out.println("自分の負けです");
            }
        }
        case "s" -> {
            switch (randomChoice) {
                case "グー" -> System.out.println("自分の負けです");
                case "チョキ" -> System.out.println("あいこです");
                case "パー" -> System.out.println("自分の勝ちです");
            }
        }
        case "p" -> {
            switch (randomChoice) {
                case "グー" -> System.out.println("自分の勝ちです");
                case "チョキ" -> System.out.println("自分の負けです");
                case "パー" -> System.out.println("あいこです");
            }
        }
	}
 }
}