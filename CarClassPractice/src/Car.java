
public class Car {
	//メンバ変数の定義
	int no;		//自動車のナンバー
	int speed;	//自動車の速度
	
	//メソッド
	//変数noに引数nを設定する
	void setNo(int n) {
		no = n;
	}
	
	//変数speedに引数sを設定する
	void run(int s) {
		speed = s;
	}
	
	//変数speedに0を設定する
	void stop() {
		speed = 0;
	}
	
	//変数no、変数speedの値を表示する
	void display() {
		System.out.println("ナンバー" + no + "の速度は" + speed + "です");
	}
}
