import com.itwill.shop.ShopService;
import com.itwill.shop.member.*;
//import com.itwill.shop.product.Product;
//import com.itwill.shop.product.ProductService;
//import com.itwill.shop.admin.Product;
//import com.itwill.shop.admin.ProductService;

public class PackageImportMain {

	public static void main(String[] args) {
		/*
		 * 자동 import: ctrl + shift + o
		 */
		ShopService shopService = new ShopService();
		System.out.println(shopService);
		
		Member member = new Member();
		System.out.println(member);
		MemberService memberService = new MemberService();
		System.out.println(memberService);
		
		System.out.println("- com.itwill.shop.product.Product, com.itwill.shop.product.ProductService -");
		com.itwill.shop.product.Product shopProduct = new com.itwill.shop.product.Product(); // 이름 겹치면 풀네임으로 클래스 불러와야 함
//		Product shopProduct = new Product();
		com.itwill.shop.product.ProductService shopProductService = new com.itwill.shop.product.ProductService();
		System.out.println(shopProduct);
		System.out.println(shopProductService);
		
		System.out.println("- com.itwill.shop.admin.Product adminProduct, com.itwill.shop.admin.ProductService adminProductService -");
		com.itwill.shop.admin.Product adminProduct = new com.itwill.shop.admin.Product();
//		Product adminProduct = new Product();
		com.itwill.shop.admin.ProductService adminProductService = new com.itwill.shop.admin.ProductService();
		System.out.println(adminProduct);
		System.out.println(adminProductService);
		
		
	}

}
