
class P215_ClassExample1 {
	public static void main(String args[]){
		
		P213_GoodsStock obj;		// Ŭ���� ������ Ÿ�� ����
		
		obj = new P213_GoodsStock();	//Ŭ���� ��ü ����
		obj.goodsCode = "52115";		//�ʵ� �ʱ�ȭ
		obj.stockNum = 200;			//�ʵ� �ʱ�ȭ강평

		System.out.println("��ǰ�ڵ�: " + obj.goodsCode);
		System.out.println("������: " + obj.stockNum);
		
		obj.addStock(1000);		//�޼��� ȣ��
		System.out.println("��ǰ�ڵ�: " + obj.goodsCode);
		System.out.println("������: " + obj.stockNum);
		
	}
}
