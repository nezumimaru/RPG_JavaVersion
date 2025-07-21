package meiroVer6;

import java.util.Arrays;
import java.util.List;

public class MotoMeiro {
	private int idouY;
	private int idouX;
	private int qq = 0;

	void encount(List<Hero> heroes, Item02 item, Monster j, Item item2, Tokugi tokugi) {

		int hassei = new java.util.Random().nextInt(100) + 1;
		if (1 <= hassei && hassei <= 35) {//仲間増える
			if (heroes.size() == 1) { //アクアが仲間になる

				Hero a = new Hero();
				a.setName("アクア");
				a.setHp(500);
				a.setMaxhp(500);
				a.setMp(500);
				a.setMaxmp(500);
				a.setPower(20);
				a.setLevel(1);
				a.setKeikenchi(0);
				a.setSyokiX(50);

				heroes.add(a);
				System.out.println("⭐️"+a.getName() + " が仲間になった！"+"⭐️");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			} else if (heroes.size() == 2) { // めぐみんを追加
				Hero m = new Hero();
				m.setName("めぐみん");
				m.setHp(500);
				m.setMaxhp(500);
				m.setMp(1000);
				m.setMaxmp(1000);
				m.setPower(20);
				m.setLevel(1);
				m.setKeikenchi(0);
				m.setSyokiX(50);

				heroes.add(m);
				System.out.println("⭐️"+m.getName() + " が仲間になった！"+"⭐️");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			} else if (heroes.size() == 3) { //ダクネスを追加

				Hero d = new Hero();
				d.setName("ダクネス");
				d.setHp(5000);
				d.setMaxhp(5000);
				d.setMp(100);
				d.setMaxmp(100);
				d.setPower(0);
				d.setLevel(1);
				d.setKeikenchi(0);
				d.setSyokiX(50);
				heroes.add(d);
				System.out.println("⭐️"+d.getName() + " が仲間になった！"+"⭐️");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
			return; // 🎯 仲間が増えたら戦闘などをせずマップに戻る

		} else if (36 < hassei && hassei <= 70) {//敵に遭遇　バトルクラスを作る
			this.setQq(1);
			System.out.println(j.getName() + "が現れた！");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			if (heroes.size() == 1) {//カズマだけの場合
				System.out.println("|"+heroes.get(0).getName() + "  レベル" + heroes.get(0).getLevel()+"|");
				System.out.println("| HP" + heroes.get(0).getHp() + "  MP" + heroes.get(0).getHp()+" |");
				System.out.println(" ("+ Item02.KAIHUKUYAKU.getName() +"所持数: " + Item02.KAIHUKUYAKU.getSuuryou() + ")");
				System.out.println(" ("+ Item02.MAGICPORTION.getName() +"所持数: " + Item02.MAGICPORTION.getSuuryou() + ")");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("モンスターの情報:"+j.getName() + " HP:" + j.getHp());
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			} else if (heroes.size() == 2) {//カズマと二人の場合
				System.out.println("|"+heroes.get(0).getName() + "  レベル" + heroes.get(0).getLevel()+"|"+heroes.get(1).getName() + "  レベル" + heroes.get(1).getLevel()+"|");
				System.out.println("|HP" + heroes.get(0).getHp() + "  MP" + heroes.get(0).getHp()+" |HP" + heroes.get(1).getHp() + "  MP" + heroes.get(1).getHp()+"|");
				System.out.println(" ("+ Item02.KAIHUKUYAKU.getName() +"所持数: " + Item02.KAIHUKUYAKU.getSuuryou() + ")");
				System.out.println(" ("+ Item02.MAGICPORTION.getName() +"所持数: " + Item02.MAGICPORTION.getSuuryou() + ")");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("モンスターの情報:"+j.getName() + " HP:" + j.getHp());
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			} else if (heroes.size() == 3) {//カズマとアクアとめぐみんの場合
				System.out.println("|"+heroes.get(0).getName() + "  レベル" + heroes.get(0).getLevel()+"|"+heroes.get(1).getName() + "  レベル" + heroes.get(1).getLevel()+"|"
						+heroes.get(2).getName() + "レベル" + heroes.get(2).getLevel()+"|");
				System.out.println("| HP" + heroes.get(0).getHp() + "  MP" + heroes.get(0).getHp()+"|HP" + heroes.get(1).getHp() + "  MP" + heroes.get(1).getHp()+
						"|HP" + heroes.get(0).getHp() + "MP" + heroes.get(0).getHp()+"|");
				System.out.println(" ("+ Item02.KAIHUKUYAKU.getName() +"所持数: " + Item02.KAIHUKUYAKU.getSuuryou() + ")");
				System.out.println(" ("+ Item02.MAGICPORTION.getName() +"所持数: " + Item02.MAGICPORTION.getSuuryou() + ")");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("モンスターの情報:"+j.getName() + " HP:" + j.getHp());
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			} else if (heroes.size() == 4) {//カズマとアクアとめぐみんとダクネスの場合
				System.out.println("|"+heroes.get(0).getName() + "  レベル" + heroes.get(0).getLevel()+"|"+heroes.get(1).getName() + "  レベル" + heroes.get(1).getLevel()+"|"
						+heroes.get(2).getName() + "レベル" + heroes.get(2).getLevel()+"|"+heroes.get(3).getName() + "レベル" + heroes.get(3).getLevel()+"|");
				System.out.println("|HP" + heroes.get(0).getHp() + "  MP" + heroes.get(0).getHp()+" |HP" + heroes.get(1).getHp() + "  MP" + heroes.get(1).getHp()+
						" |HP" + heroes.get(2).getHp() + "MP" + heroes.get(2).getHp()+" |HP" + heroes.get(3).getHp() + "MP" + heroes.get(3).getHp()+" |");
				System.out.println(" ("+ Item02.KAIHUKUYAKU.getName() +"所持数: " + Item02.KAIHUKUYAKU.getSuuryou() + ")");
				System.out.println(" ("+ Item02.MAGICPORTION.getName() +"所持数: " + Item02.MAGICPORTION.getSuuryou() + ")");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("モンスターの情報:"+j.getName() + " HP:" + j.getHp());
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}

		} else if (70 < hassei && hassei <= 74) {//何もおこらない
			System.out.println("普通に通れた");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		} else if (75 < hassei && hassei <= 83) {
			Item02.KAIHUKUYAKU.setSuuryou(Item02.KAIHUKUYAKU.getSuuryou() + 1);
			System.out.println("アイテム「" + Item02.KAIHUKUYAKU.getName() + "」を手に入れた！");
			System.out.println(" (所持数: " + Item02.KAIHUKUYAKU.getSuuryou() + ")");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		} else if (84 < hassei && hassei <= 100) {
			Item02.MAGICPORTION.setSuuryou(Item02.MAGICPORTION.getSuuryou() + 1);
			System.out.println("アイテム「" + Item02.MAGICPORTION.getName() + "」を手に入れた！");
			System.out.println(" (所持数: " + Item02.MAGICPORTION.getSuuryou() + ")");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		}
	}

	void openingMap() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("⭐⭐⭐⭐️あなたの位置は「🏃‍➡️」←です。⭐⭐⭐⭐");
		System.out.println("⭐⭐ボスを倒して、宝箱をゲットしよう！！⭐⭐");
		System.out.println("⭐⭐⭐⭐ボスは『ボ』の所にいるよ！⭐⭐⭐⭐");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	}

	private static final String[][] MAP_DATA = {
			{ "＝", "＝", "＝", "＝", "＝", "＝", "＝", "＝", "＝", "＝", "＝", "＝", "　", "＝", "＝", "＝" }, // 0
			{ "｜", "　", "　", "　", "　", "＝", "＝", "＝", "＝", "＝", "＝", "＝", "　", "＝", "＝", "｜" }, // 1
			{ "｜", "＝", "＝", "＝", "　", "＝", "＝", "＝", "＝", "　", "　", "　", "　", "　", "　", "｜" }, // 2
			{ "｜", "　", "＝", "＝", "　", "　", "　", "　", "　", "　", "　＝", "＝", "　", "＝", "＝", "｜" }, // 3
			{ "｜", "　", "　", "　", "　", "＝", "　", "＝", "　", "＝", "＝", "　", "＝", "　", "　", "｜" }, // 4
			{ "｜", "＝", "＝", "　", "＝", "＝", "　", "＝", "　", "　", "＝", "＝", "＝", "＝", "＝", "｜" }, // 5
			{ "＝", "＝", "　", "　", "　", "　", "　", "　", "　", "　", "＝", "　", "＝", "　", "　", "｜" }, // 6
			{ "＝", "　", "＝", "＝", "　", "　", "＝", "＝", "　", "　", "＝", "　", "＝", "　", "　", "｜" }, // 7
			{ "＝", "　", "＝", "＝", "　", "＝", "＝", "＝", "　", "　", "＝", "＝", "＝", "＝", "＝", "｜" }, // 8
			{ "＝", "　", "　", "＝", "　", "＝", "　", "　", "ボ", "　", "＝", "＝", "　", "　", "　", "｜" }, // 9
			{ "＝", "＝", "＝", "＝", "＝", "＝", "＝", "＝", "＝", "＝", "＝", "＝", "＝", "＝", "＝", "＝" } //10
	};

	// マップデータを取得するメソッド
	public static String[][] getMapData() {
		return MAP_DATA;
	}

	// 現在のマップを表示するメソッド
	void Map(int playerX, int playerY) {
		// 元のマップデータをコピー（変更を加えないため）
		String[][] displayMap = new String[MAP_DATA.length][];
		for (int i = 0; i < MAP_DATA.length; i++) {
			displayMap[i] = Arrays.copyOf(MAP_DATA[i], MAP_DATA[i].length);
		}

		// プレイヤーの位置に "こ" を配置
		displayMap[playerY][playerX] = "🏃‍➡️";

		// マップを表示
		for (int i = 0; i < displayMap.length; i++) {
			for (int j = 0; j < displayMap[i].length; j++) {
				System.out.print(displayMap[i][j] + " ");
			}
			System.out.println();
		}
	}

	public int getIdouX() {
		return idouX;
	}

	public void setIdouX(int idouX) {
		this.idouX = idouX;
	}

	public int getIdouY() {
		return idouY;
	}

	public void setIdouY(int idouY) {
		this.idouY = idouY;
	}

	public int getQq() {
		return qq;
	}

	public void setQq(int qq) {
		this.qq = qq;
	}
}