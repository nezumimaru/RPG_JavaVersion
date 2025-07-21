package meiroVer6;

public enum Item02 {
	KAIHUKUYAKU(1,"回復薬",50,0,0),
	MAGICPORTION(2,"マジックポーション",0, 100,0);
	
	private int id;
	private String name;
	private int hpKaihuku;
	private int mpKaihuku;
	private int suuryou;
	
	private Item02 (int id,String name, int hpKaihuku,int mpKaihuku,int suuryou) {
		this.id = id;
		this.name = name;
		this.hpKaihuku = hpKaihuku;
		this.mpKaihuku = mpKaihuku;
		this.suuryou=suuryou;
}

	public int getSuuryou() {
		return suuryou;
	}

	public void setSuuryou(int suuryou) {
		this.suuryou = suuryou;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHpKaihuku() {
		return hpKaihuku;
	}

	public void setHpKaihuku(int hpKaihuku) {
		this.hpKaihuku = hpKaihuku;
	}

	public int getMpKaihuku() {
		return mpKaihuku;
	}

	public void setMpKaihuku(int mpKaihuku) {
		this.mpKaihuku = mpKaihuku;
	}

}
