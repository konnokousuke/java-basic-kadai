package kadai_014;

public class CarExec_Chapter14 {

	public static void main(String[] args) {
		
		// 走行データを生成
		Car_Chapter14 carrun = new Car_Chapter14( 1, 10 );
		
		carrun.gearChange(3);
		carrun.run();
	}

}