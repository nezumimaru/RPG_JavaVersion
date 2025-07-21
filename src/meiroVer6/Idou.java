package meiroVer6;

import java.util.Scanner;

public class Idou {
	private int x = 0;
	private int y = 0;

	void nyuryoku() {
		Scanner scanner = new Scanner(System.in); // Scannerオブジェクトを作成
		int input = 0; // 初期値を設定

		while (true) { // 正しい入力があるまでループ
			System.out.println("進む道を入力してください");
			System.out.println("右に進むは「6」、左に進むは「4」");
			System.out.println("上に進むは「8」、下に進むは「2」");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

			// 数値の入力チェック（例外処理を追加）
			if (scanner.hasNextInt()) {
				input = scanner.nextInt();
				if (input == 6) {
					this.setX(this.getX() + 1);
					System.out.println("右に進みました");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					break;
				} else if (input == 4) {
					this.setX(this.getX() - 1);
					System.out.println("左に進みました");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					break;
				} else if (input == 8) {
					this.setY(this.getY() - 1);
					System.out.println("上に進みました");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					break;
				} else if (input == 2) {
					this.setY(this.getY() + 1);
					System.out.println("下に進みました");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					break;
				} else {
					System.out.println("【6, 4, 8, 2】のいずれかを入力してください");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				}
			} else {//数字以外の入力を受け付けない
				System.out.println("【6, 4, 8, 2】のいずれかを入力してください");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				scanner.next(); // 無効な入力をクリア
			}
		}

	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;

	}

	public void setY(int y) {
		this.y = y;
	}

}
