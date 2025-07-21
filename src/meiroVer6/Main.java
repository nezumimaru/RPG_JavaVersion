package meiroVer6;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// ヒーロー（プレイヤー）の初期設定
		Hero k = new Hero();
		k.setName("カズマ");
		k.setHp(500);
		k.setMaxhp(500);
		k.setMp(100);
		k.setMaxmp(100);
		k.setPower(500);
		k.setLevel(1);
		k.setKeikenchi(0);
		k.setSyokiX(50);

		List<Hero> heroes = new ArrayList<>();
		heroes.add(k);

		// ゲームで使うオブジェクトを作成
		Item02 item2 = null;
		Item item = new Item();
		MotoMeiro meiro = new MotoMeiro();
		Tokugi tokugi = new Tokugi();
		Idou s = new Idou();
		Goal g = new Goal();
		Monster j = new Monster();
		Battle ba = new Battle();

		// 初期位置を設定
		s.setX(1);
		s.setY(1);

		// マップのデータ取得
		String[][] mapData = meiro.getMapData();

		// ゲーム開始
		meiro.openingMap();

		for (int i = 1; i < 100; i++) {
			meiro.Map(s.getX(), s.getY()); // マップを表示
			int prevX = s.getX();
			int prevY = s.getY();

			s.nyuryoku(); // 移動方向を入力

			// 壁にぶつかった場合の処理
			while  (mapData[s.getY()][s.getX()].equals("＝") || mapData[s.getY()][s.getX()].equals("｜")) {
				System.out.println("壁にぶつかった！別の方向を選んでください。");
				s.setX(prevX);
				s.setY(prevY);
				s.nyuryoku(); // 再度入力を求める
			}

			// ゴール（ボス戦）判定
			if (g.getGx() == s.getX() && g.getGy() == s.getY()) {
				Monster boss = new Monster();
				boss.setName("デュラハン");
				boss.setHp(5000);
				boss.setMp(100);
				boss.setPower(200);
				boss.setKeikenchi(new java.util.Random().nextInt(50) + 10);
				System.out.println(boss.getName() + "が現れた！");

				boolean bossBattle = ba.battle(heroes, boss, item, tokugi);
				if (!bossBattle) {
					k.levelup(boss, heroes);
					g.omedetou(); // ゴール処理
					break;
				}
			} else { // 通常のモンスター遭遇
				j.setName("🐸ジャイアントトード🐸");
				j.setHp(new java.util.Random().nextInt(100) + 100);
				j.setMp(100);
				j.setPower(500);
				j.setKeikenchi(new java.util.Random().nextInt(5) + 10);

				meiro.encount(heroes, item2, j, item, tokugi);

				if (meiro.getQq() == 1) { // 戦闘発生時
					int initialPartySize = heroes.size(); // 初期の仲間数を記録

					boolean battleResult = ba.battle(heroes, j, item, tokugi); // 戦闘処理
					meiro.setQq(0);
					k.levelup(j, heroes);
					if (!battleResult) { // 戦闘終了（逃げた場合含む）
						
						tokugi.resetNikukabe();
						System.out.println("戦闘終了！マップに戻ります。");
						continue; // 戦闘後にマップ表示へ戻る
					}

					if (heroes.size() > initialPartySize) { // 仲間が増えた場合
						System.out.println("仲間が増えた！マップに戻ります。");
						continue; // 戦闘後にマップ表示へ戻る
					}
				}
			}
		}
	}
}
