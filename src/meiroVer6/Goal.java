package meiroVer6;

public class Goal {
	private int gx = 8;
	private int gy = 9;

	void omedetou() {
		System.out.println("ボスを倒した");
		System.out.println("宝箱には何が入っているかな？1～4の数字を押して");
		int input = new java.util.Scanner(System.in).nextInt();
		if (input == 1) {
			System.out.println("パンティをゲット！");
		} else if (input == 2) {
			System.out.println("空っぽだった");
		} else if (input == 3) {
			System.out.println("ミミックだった。全員食べられた");
		} else if (input == 4) {
			System.out.println("ミツルギの剣を手に入れた");
		} else {
			System.out.println("1～4の数字を入力してください");
		}
		
	}

	public int getGx() {
		return gx;
	}

	public void setGx(int gx) {
		this.gx = gx;
	}

	public int getGy() {
		return gy;
	}

	public void setGy(int gy) {
		this.gy = gy;
	}

}
