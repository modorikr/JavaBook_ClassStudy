
class P215_ClassExample1 {
	public static void main(String args[]){
		
		P213_GoodsStock obj;		// 클래서 데이터 타입 선언
		
		obj = new P213_GoodsStock();	//클래스 객체 생성
		obj.goodsCode = "52115";		//필드 초기화
		obj.stockNum = 200;			//필드 초기화

		System.out.println("상품코드: " + obj.goodsCode);
		System.out.println("재고수량: " + obj.stockNum);
		
		obj.addStock(1000);		//메서드 호출
		System.out.println("상품코드: " + obj.goodsCode);
		System.out.println("재고수량: " + obj.stockNum);
		
	}
}
