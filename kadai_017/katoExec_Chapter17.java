package kadai_017;

public class katoExec_Chapter17 {

	public static void main(String[] args) {
		//KatoTaroクラスのオブジェクトを作成
		KatoTaro_Chapter17 taro = new KatoTaro_Chapter17();
		//KatoIchiroクラスのオブジェクトを作成
		KatoIchiro_Chapter17 ichiro = new KatoIchiro_Chapter17();
		//KatoHanakoクラスのオブジェクトを作成
		KatoHanako_Chapter17 hanako = new KatoHanako_Chapter17();
		
		//太郎
		taro.setGivenName();
		//花子
		hanako.setGivenName();
		//一郎
		ichiro.setGivenName();
		
		var katoFamily = new Kato_Chapter17[] {taro, ichiro, hanako};
		for (var kato: katoFamily) {
			kato.execlntroduce();
		}
		
		}
		
	}