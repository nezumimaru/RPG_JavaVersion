package meiroVer6;

import java.util.List;

public class Battle {

	private int moto;

	boolean battle(List<Hero> heroes, Monster j, Item item, Tokugi tokugi) {
	    while (true) {  // 🎯 戦闘ループ
	        System.out.println("誰が行動する？");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	        for (int i = 0; i < heroes.size(); i++) {
	            System.out.println((i + 1) + "，" + heroes.get(i).getName());
	        }

	        // 🎯 ユーザーの入力チェック
	        int input;
	        while (true) {
	            input = new java.util.Scanner(System.in).nextInt();
	            if (input >= 1 && input <= heroes.size()) {
	                this.setMoto(input);
	                break;
	            } else {
	                System.out.println("1～" + heroes.size() + " を入力してください");
	    			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	            }
	        }

	        Hero c = heroes.get(moto - 1);
	        System.out.println(c.getName() + " の行動を選んでください！");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	        // 🎯 `command()` を呼び出して行動を選ばせる
	        boolean battleContinues = command(heroes, j, item, tokugi);
	        
	        // 🎯 `command()` で `false`（逃げた）なら戦闘終了！
	        if (!battleContinues) {
	            System.out.println("戦闘終了！");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	            return false;
	        }

	        // 🎯 敵のHPが0になったら戦闘終了
	        if (j.getHp() <= 0) {
	            System.out.println(j.getName() + " を倒した！");
	            return false;
	        }

	        // 🎯 敵の攻撃（逃げてない時のみ）
	        j.kougeki(heroes, tokugi);
	    }
	}
	boolean command(List<Hero> heroes, Monster j, Item item, Tokugi tokugi) {
	    Hero c = heroes.get(this.getMoto() - 1);
	    System.out.println("1.攻撃　2.特技　3.アイテム　4.逃げる");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	    while (true) {
	        int input = new java.util.Scanner(System.in).nextInt();
	        switch (input) {
	            case 1:
	                c.kougeki(j);
	                return true; // 戦闘続行

	            case 2:
	                switch (moto) {
	                    case 1 -> tokugi.steel(heroes);
	                    case 2 -> tokugi.resurrection(heroes);
	                    case 3 -> tokugi.explosion(j, heroes);
	                    case 4 -> tokugi.nikukabe(j, c);
	                }
	                return true; // 戦闘続行

	            case 3:
	                item.showItem();
	                System.out.println("1.回復薬　2.マジックポーション　3.やめる");
	    			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

	                while (true) {
	                    int input2 = new java.util.Scanner(System.in).nextInt();
	                    switch (input2) {
	                        case 1 -> {
	                            item.useItem(Item02.KAIHUKUYAKU);
	                            return true; // 戦闘続行
	                        }
	                        case 2 -> {
	                            item.useItem(Item02.MAGICPORTION);
	                            return true; // 戦闘続行
	                        }
	                        case 3 -> {
	                            System.out.println("アイテム使用をキャンセルしました");
	                			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	                            break; // もう一度行動を選ばせる
	                        }
	                        default -> System.out.println("1, 2, 3 を入力してください");
	                        
	                    }
	                }
	            
	            case 4:
	                if (c.run()) {
	                    return false; // 🎯 逃げた → 戦闘終了
	                }
	                return true; // 🎯 逃げ失敗 → 戦闘続行

	            default:
	                System.out.println("1～4 を入力してください");
	    			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	        }
	    }
	}


	public int getMoto() {
		return moto;
	}

	public void setMoto(int moto) {
		this.moto = moto;
	}

}
