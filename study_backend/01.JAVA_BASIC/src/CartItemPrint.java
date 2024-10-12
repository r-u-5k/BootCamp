
public class CartItemPrint {

	public static void main(String[] args) {
//		제품명, 판매가, 정가, 할인율, 개수
		String nameOfProduct;
		int sellingPrice, originalPrice, discountRate, number;
		
		nameOfProduct = "분리수거함";
		sellingPrice = 18990;
		originalPrice = 27000;
		discountRate = 29;
		number = 1;
		
		System.out.println("*************************************************");
		System.out.println("*                 < 장바구니 >                  *");
		System.out.println("*************************************************");

		System.out.println("   제품명\t판매가\t정가\t할인율\t개수");
		System.out.println(" " + nameOfProduct + "\t" + sellingPrice + "원\t" + originalPrice 
							+ "원   " + discountRate + "%\t " + number);
		
		System.out.println("*************************************************");
		
	}

}
