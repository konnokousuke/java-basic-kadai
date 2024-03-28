package kadai_014;

// 車クラス
public class Car_Chapter14 {
	// フィールド (内部データ)
	private int gear = 1; // 1速から5速(初期値1)
	private int speed = 10; // ギアチェンジ後の速度(初期値10)
	
	// コンストラクタ (初期化処理)
	public Car_Chapter14( int gear, int speed ) {
		this.gear = gear;
		this.speed = speed;
	}
	
	// ギアの値で速度を変える
	public void gearChange( final int afterGear ) {
		if( afterGear >= 1 && afterGear <= 5 ) {
			speed = afterGear * 10;
			System.out.println("ギア" + gear + "から" + afterGear + "に切り替えました" );
		} else {
			System.out.println("1から5以外のギアです");
		}
	}
	
	public void run() {
		System.out.println("速度は時速" + this.speed + "です" );
	}
}