package java_002;
import java_002.Syokudo;
public class Run {
	/*
	 * 식당 이름: 송화, 대표 메뉴: 육회 비빔밥, 가격: 16,000원, 주소: 637-23
	 * 식당 이름: 홍루루, 대표 메뉴: 홍짬뽕, 가격: 10,000원, 주소: 837-17
	 * 식당 이름: 양산도 역삼점, 대표 메뉴: ひつまぶし, 가격: 27,000원, 주소: 823-16
	 */
	public static void main(String[] args) {
		Syokudo s1 = new Syokudo();
		s1.setStoreName("송화");
		s1.setPersonalMenu("육회 비빔밥");
		s1.setPrice(16000);
		s1.setAdress("637-23");
		
		Syokudo s2 = new Syokudo("홍루루", "홍짬뽕", "837-17", 10000);
		Syokudo s3 = new Syokudo("양산도", "ひつまぶし", "823-16", 27000);
		
		s1.inform();
		s2.inform();
		s3.inform();
	}
}
