package meiroVer6;

import java.util.List;

public class Hero {
	private String name;
	private int hp;
	private int maxhp;
	private int mp;
	private int maxmp;
	private int power;
	Tokugi tokugi;
	private int level=1;
	private int keikenchi;

	private double syokiX ;

	void levelup(Monster m, List<Hero> heroes) {
		for (int i = 0; i < heroes.size(); i++) {
			heroes.get(i).setKeikenchi((int)heroes.get(i).getKeikenchi() +(m.getKeikenchi()
			*new java.util.Random().nextInt(5)));//経験値加算
			System.out.println("〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜");
            System.out.println(heroes.get(i).getName() + "は、経験値"+m.getKeikenchi()+ " を手に入れた");
            System.out.println("現在の経験値は"+heroes.get(i).getKeikenchi() );
			if(heroes.get(i).getSyokiX() < heroes.get(i).getKeikenchi()) {
				heroes.get(i).setLevel(heroes.get(i).getLevel() + 1);//levelが１上がる
				heroes.get(i).setSyokiX((int)heroes.get(i).getSyokiX() * 1.5);
				
				System.out.println(heroes.get(i).getName() + "はレベルがあがった");
				System.out.println(heroes.get(i).getName() + "はレベル"+heroes.get(i).getLevel()+"になった");

			}else {}
			System.out.println("〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜");
		}

	}

	boolean run() {
		int hassei = new java.util.Random().nextInt(100) + 1;
		if (1 < hassei && hassei <= 60) {//逃げれる
			System.out.println("なんとか逃げ出した");

			return true;
		} else if (61 < hassei && hassei <= 80) {//逃げれない
			System.out.println("転んで、逃げれない");
		} else if (81 < hassei && hassei <= 100) {//逃げれない
			System.out.println("やるっきゃない！　はい、逃げれない");
		}
		return false;

	}

	void kougeki(Monster j) {//攻撃メソッド
		System.out.println(this.getName() + "の攻撃！！");
		if (j.getHp() >= 0) {
			int rr = new java.util.Random().nextInt(4);
			if (rr == 0) {//攻撃ミス
				System.out.println(this.getName() + "は、攻撃が当たらない！！");
				System.out.println("");

			} else if (rr == 1 || rr == 2 || rr == 3) {//攻撃成功
				int r = new java.util.Random().nextInt(3) + 1;
				int attackPoint = this.power * r;
				j.setHp(j.getHp() - attackPoint);
				System.out.println(this.getName() + "は、" + j.getName() + "に" + attackPoint + "のダメージを与えた");
				if (j.getHp() > 0) {
					System.out.println(j.getName() + "の残りのHPは" + j.getHp());
					System.out.println("");
				} else if (j.getHp() <= 0) {
					j.setHp(0);

					System.out.println(j.getName() + "の残りのHP0になった...");
					System.out.println(j.getName() + "を倒した");
					System.out.println("");
				}
			}
		} else {
		}
	}

	public void heroShibou(List<Hero> heroes) {
		if (this.getHp() == 0) {
			this.setHp(getMaxhp());
			System.out.println(this.getName() + "は倒れた");
			System.out.println(this.getName() + "はエリスの情けで蘇生した。");

		} else if (heroes.get(1).getHp() > 0) { // アクアが生存しているか？
			this.setHp(getMaxhp());
			System.out.println(this.getName() + "は倒れた");
			System.out.println(this.getName() + "はアクアによって蘇生した。");
		} else {
			heroes.get(0).setHp(getMaxhp());
			System.out.println(heroes.get(0) + "は倒れた");
			System.out.println(heroes.get(0) + "はエリスによって蘇生した。");

		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getMaxhp() {
		return maxhp;
	}

	public void setMaxhp(int maxhp) {
		this.maxhp = maxhp;
	}

	public int getMaxmp() {
		return maxmp;
	}

	public void setMaxmp(int maxmp) {
		this.maxmp = maxmp;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getKeikenchi() {
		return keikenchi;
	}

	public void setKeikenchi(int keikenchi) {
		this.keikenchi = keikenchi;
	}

	public double getSyokiX() {
		return syokiX;
	}

	public void setSyokiX(double syokiX) {
		this.syokiX = syokiX;
	}


	
}
