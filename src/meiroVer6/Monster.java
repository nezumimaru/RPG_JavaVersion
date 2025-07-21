package meiroVer6;

import java.util.List;

public class Monster {
	private String name;
	private int hp;
	private int mp;
	private int power;
	private int keikenchi;
	

	void kougeki(List<Hero> heroes, Tokugi tokugi) {
	    System.out.println(this.name + "の攻撃！！");

	    // もし「にくかべ」が有効ならダクネスを攻撃対象にする
	    Hero target = null;
	    if (tokugi.isNikukabeActive()) {
	        // ダクネスをターゲットにする
	        target = heroes.stream().filter(hero -> hero.getName().equals("ダクネス")).findFirst().orElse(null);

	        if (target != null) {
	            System.out.println(this.name + "は、ダクネスに攻撃！");
	        } else {
	            System.out.println("ダクネスがパーティにいないので、他のキャラクターを攻撃対象にします！");
	            // ダクネスがいない場合、ランダムで他の仲間をターゲット
	            target = heroes.get(new java.util.Random().nextInt(heroes.size()));
	            System.out.println(this.name + "は、" + target.getName() + "に攻撃！");
	        }
	    } else {
	        // 「にくかべ」が無効な場合、ランダムで仲間をターゲット
	        target = heroes.get(new java.util.Random().nextInt(heroes.size()));
	        System.out.println(this.name + "は、" + target.getName() + "に攻撃！");
	    }

	    // 攻撃処理
	    if (target != null) {
	        int rr = new java.util.Random().nextInt(4);
	        if (rr == 0) {
	            System.out.println(this.name + "は、攻撃が当たらない！！");
	            System.out.println("");
	        } else if (rr == 1 || rr == 2 || rr == 3) {
	            int r = new java.util.Random().nextInt(3) + 1;
	            int attackPoint = this.power * r;
	            target.setHp(target.getHp() - attackPoint);
	            System.out.println(this.name + "は、" + target.getName() + "に" + attackPoint + "のダメージを与えた");

	            if (target.getHp() > 0) {
	                System.out.println(target.getName() + "の残りのHPは" + target.getHp());
	                System.out.println("");
	            } else {
	                target.setHp(0);
	                System.out.println(target.getName() + "の残りのHP0");
	                System.out.println("");
	                System.out.println(target.getName() + "戦えない。。");

	                // 戦闘不能になった場合、処理を追加
	                if (target.getHp() <= 0) {
	                    target.heroShibou(heroes);  // 戦闘不能処理
	                }
	            }
	        }
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



	public int getKeikenchi() {
		return keikenchi;
	}



	public void setKeikenchi(int keikenchi) {
		this.keikenchi = keikenchi;
	}

}
