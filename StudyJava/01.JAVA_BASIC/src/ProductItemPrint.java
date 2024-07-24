
public class ProductItemPrint {

	public static void main(String[] args) {
//		카테고리, 제품명, 가격, 평점, 후기 개수
		
		String category, nameOfProduct;
		int price, numOfReview;
		double grade;
		
		category = "니트";
		nameOfProduct = "라운드 넥 니트";
		price = 29900;
		numOfReview = 4230;
		grade = 4.8;
		
		System.out.println("**************************");
		
		System.out.println("카테고리 : " + category);
		System.out.println(" 상품명  : " + nameOfProduct);
		System.out.println("  가격   : " + price + "원");
		System.out.println("  평점   : " + grade + "점");
		System.out.println("  후기   : " + numOfReview + "개");
		
		System.out.println("**************************");
	}

}
