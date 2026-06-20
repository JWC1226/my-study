package java_002;

public class Syokudo {
	//멤버 변수
	private String storeName;
	private String personalMenu;
	private String adress;
	private int price;
	
	//메소드
	public Syokudo() {
	}
	//생성자
	public Syokudo(String storeName, String personalMenu, String adress,
			int price) {
		this.storeName = storeName;
		this.personalMenu = personalMenu;
		this.adress = adress;
		this.price = price;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getPersonalMenu() {
		return personalMenu;
	}
	public void setPersonalMenu(String personalMenu) {
		this.personalMenu = personalMenu;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//출력 문구
	public void inform() {
		System.out.printf("식당 이름: %s, 대표 메뉴: %s, 가격: %d, 주소: %s\n",
				this.storeName, this.personalMenu, this.price, this.adress);
	}
}
