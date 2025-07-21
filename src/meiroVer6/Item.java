package meiroVer6;

import java.util.List;

public class Item {
	void hpkaihuku(List<Hero> heroes,Item02 item) {
		Hero k = heroes.get(0);
		Hero a = heroes.get(1);
		Hero m = heroes.get(2);
		Hero d = heroes.get(3);

		System.out.println("誰を回復させる？");
		System.out.println("");
		if (heroes.size() == 2) {//カズマと二人の場合
			System.out.println("1，カズマ　2，アクア");
		} else if (heroes.size() == 3) {//カズマとアクアとめぐみんの場合
			System.out.println("1，カズマ　2，アクア　3，めぐみん");
		} else if (heroes.size() == 4) {//カズマとアクアとめぐみんとダクネスの場合
			System.out.println("1，カズマ　2，アクア　3，めぐみん　4，ダクネス");
		}

		while (true) {
			int input = new java.util.Scanner(System.in).nextInt();
			switch (input) {
			case 1:
				k.setHp(k.getMaxhp() + item.getHpKaihuku());
				System.out.println(k.getName() + "は、HPを" + item.getHpKaihuku() + "全回復した");
				System.out.println(k.getName() + "のHPは" + k.getHp());
				break;
			case 2:
				a.setHp(a.getMaxhp() + item.getHpKaihuku());
				System.out.println(a.getName() + "は、HPを" + item.getHpKaihuku() + "全回復した");
				System.out.println(a.getName() + "のHPは" + a.getHp());
				break;
			case 3:
				m.setHp(m.getMaxhp() + item.getHpKaihuku());
				System.out.println(m.getName() + "は、HPを" + item.getHpKaihuku() + "全回復した");
				System.out.println(m.getName() + "のHPは" + m.getHp());
				break;
			case 4:
				d.setHp(d.getMaxhp() + item.getHpKaihuku());
				System.out.println(d.getName() + "は、HPを" + item.getHpKaihuku() + "回復した");
				System.out.println(d.getName() + "のHPは" + d.getHp());
			default:
				System.out.println("1~" + heroes.size() + "を入力してください");
				continue;
			}
			break;
		}
	}

	void mpkaihuku(List<Hero> heroes,Item02 item) {
		Hero k = heroes.get(0);
		Hero a = heroes.get(1);
		Hero m = heroes.get(2);
		Hero d = heroes.get(3);

		System.out.println("誰のMPを回復させる？");
		System.out.println("");
		if (heroes.size() == 2) {//カズマと二人の場合
			System.out.println("1，カズマ　2，アクア");
		} else if (heroes.size() == 3) {//カズマとアクアとめぐみんの場合
			System.out.println("1，カズマ　2，アクア　3，めぐみん");
		} else if (heroes.size() == 4) {//カズマとアクアとめぐみんとダクネスの場合
			System.out.println("1，カズマ　2，アクア　3，めぐみん　4，ダクネス");
		}

		while (true) {
			int input = new java.util.Scanner(System.in).nextInt();
			switch (input) {
			case 1:
				k.setMp(k.getMaxmp() + item.getMpKaihuku());
				System.out.println(k.getName() + "は、HPを" + item.getMpKaihuku() + "全回復した");
				System.out.println(k.getName() + "のHPは" + k.getHp());
				break;
			case 2:
				a.setMp(a.getMaxmp() + item.getHpKaihuku());
				System.out.println(a.getName() + "は、HPを" + item.getMpKaihuku() + "全回復した");
				System.out.println(a.getName() + "のHPは" + a.getMp());
				break;
			case 3:
				m.setMp(m.getMaxmp() + item.getMpKaihuku());
				System.out.println(m.getName() + "は、HPを" + item.getMpKaihuku() + "全回復した");
				System.out.println(m.getName() + "のHPは" + m.getMp());
				break;
			case 4:
				d.setMp(d.getMaxmp() + item.getMpKaihuku());
				System.out.println(d.getName() + "は、HPを" + item.getMpKaihuku() + "回復した");
				System.out.println(d.getName() + "のHPは" + d.getMp());
			default:
				System.out.println("1~" + heroes.size() + "を入力してください");
				continue;
			}
			break;
		}
	}

	
	public void showItem() {// 持っているアイテム一覧
		System.out.println(" 所持アイテム:");
		System.out.println("- " + Item02.KAIHUKUYAKU.getName() + ": " + Item02.KAIHUKUYAKU.getSuuryou() + "個");
		System.out.println("- " + Item02.MAGICPORTION.getName() + ": " + Item02.MAGICPORTION.getSuuryou() + "個");
	}

	public boolean useItem(Item02 item) {// アイテムを使う為の確認
		if (item == Item02.KAIHUKUYAKU && Item02.KAIHUKUYAKU.getSuuryou() > 0) {
			item.setSuuryou(item.getSuuryou() - 1);
			return true;
		} else if (item == Item02.MAGICPORTION && Item02.MAGICPORTION.getSuuryou() > 0) {
			item.setSuuryou(item.getSuuryou() - 1);
			return true;
		}
		System.out.println("アイテムは持っていません。");
		return false;
	}

}
