package meiroVer6;

import java.util.List;

public class Tokugi {
	private boolean nikukabeActive = false; // にくかべの状態
	public void steel(List<Hero> heroes) {
		System.out.println("カズマは、スティールを使った");
		int r = new java.util.Random().nextInt(5);
		if (r == 0) {
			Item02.KAIHUKUYAKU.setSuuryou(Item02.KAIHUKUYAKU.getSuuryou() + 1);
			System.out.println("アイテム「" + Item02.KAIHUKUYAKU.getName() + "」を盗んだ！");
			System.out.println(" (所持数: " + Item02.KAIHUKUYAKU.getSuuryou());
		} else if (r == 1) {
			Item02.MAGICPORTION.setSuuryou(Item02.MAGICPORTION.getSuuryou() + 1);
		System.out.println("アイテム「" + Item02.MAGICPORTION.getName() + "」を盗んだ！");
		System.out.println(" (所持数: " + Item02.MAGICPORTION.getSuuryou());
		} else if (r == 2&& heroes.get(2).getHp()>0) {
			System.out.println("誰かが何かを盗まれた・・・。");
			System.out.println(heroes.get(2).getName()+"の下半身がスースーしている");
		} else {
			System.out.println("不発に終わった・・・。");
		}
	}

	void resurrection(List<Hero> heroes) {

		//a.setMp(a.getMaxmp() - 20);アクアなので永久に回復できることにします
		System.out.println("誰を回復させる？");
		System.out.println("");
		if (heroes.size() == 2) {//カズマと二人の場合
			System.out.println("1，カズマ　2，アクア");
		} else if (heroes.size() == 3) {//カズマとアクアとめぐみんの場合
			System.out.println("1，カズマ　2，アクア　3，めぐみん");
		} else if (heroes.size()== 4) {//カズマとアクアとめぐみんとダクネスの場合
			System.out.println("1，カズマ　2，アクア　3，めぐみん　4，ダクネス");
		}

		while (true) {
			int input = new java.util.Scanner(System.in).nextInt();
			switch (input) {
			case 1:
				heroes.get(0).setHp(heroes.get(0).getMaxhp());
				System.out.println(heroes.get(0).getName() + "は、HPを全回復した");
				System.out.println(heroes.get(0).getName() + "のHPは" + heroes.get(0).getHp());
				break;
			case 2:
				heroes.get(1).setHp(heroes.get(1).getMaxhp());
				System.out.println(heroes.get(1).getName() + "は、HPを全回復した");
				System.out.println(heroes.get(1).getName() + "のHPは" + heroes.get(1).getHp());
				break;
			case 3:
				heroes.get(2).setHp(heroes.get(2).getMaxhp());
				System.out.println(heroes.get(2).getName() + "は、HPを全回復した");
				System.out.println(heroes.get(2).getName() + "のHPは" + heroes.get(2).getHp());
				break;
			case 4:
				heroes.get(3).setHp(heroes.get(3).getMaxhp());
				System.out.println(heroes.get(3).getName() + "は、HPを全回復した");
				System.out.println(heroes.get(3).getName() + "のHPは" + heroes.get(3).getHp());
			default:
				System.out.println("1~" + heroes.size() + "を入力してください");
				continue;
			}
			break;
		}
	}

	void explosion(Monster j, List<Hero> heroes) {
		 j.setHp(0);
		    heroes.get(2).setMp(0);
		    
		    slowPrint("我が名はめぐみん！", 100);
		    slowPrint("紅魔族随一の魔法の使い手！", 100);
		    slowPrint("滾れ、我が魂よ！", 100);
		    slowPrint("いまこそ目覚める時！", 100);
		    slowPrint("崩れろ、大地よ！", 100);
		    slowPrint("奔れ、炎よ！", 100);
		    slowPrint("深紅の滅びが来たれり！", 100);
		    slowPrint("これこそは、究極の攻撃魔法！", 150);
		    slowPrint("エクスプローーーーーーーーーージョン！！！", 200);
		    System.out.println ("めぐみんは、MPを全部消費した");
		}

		public static void slowPrint(String message, int delay) {
		    for (char c : message.toCharArray()) {
		        System.out.print(c);
		        try {
		            Thread.sleep(delay);
		        } catch (InterruptedException e) {
		            Thread.currentThread().interrupt();
		        }
		    }
		    System.out.println(); // 改行
		}


	void nikukabe(Monster j, Hero d) {//ダクネスが敵から受ける仲間の全員分の攻撃を受ける特技のメソッドを作りたい
	    // 🎯 ダクネスが特技「にくかべ」を発動
	        if (!d.getName().equals("ダクネス")) {
	            System.out.println("ダクネスしかこの特技は使えない！");
	            return;
	        }

	        System.out.println("ダクネスは「にくかべ」を発動した！ 仲間の攻撃をすべて引き受ける！");
	        nikukabeActive = true;
	    }
	

	    // 🎯 「にくかべ」の状態を確認するメソッド
	    public boolean isNikukabeActive() {
	        return nikukabeActive;
	    }

	    // 🎯 戦闘のターンが終わったらリセット
	    public void resetNikukabe() {
	        nikukabeActive = false;
	   
	}
	
}
