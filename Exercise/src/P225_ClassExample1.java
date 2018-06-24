
public class P225_ClassExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
P213_GoodsStock obj;		//맥에서도 한글이 이제 잘 올라가는?

		obj = new P213_GoodsStock();	//Ŭ���� ��ü ����
		obj.goodsCode = "52115";		//�ʵ� �ʱ�ȭ
		obj.stockNum = 200;			//�ʵ� �ʱ�ȭ강평

		System.out.println("한글1 " + obj.goodsCode);
		System.out.println("������: " + obj.stockNum);
		
		obj.addStock(1000);		//�޼��� ȣ��
		System.out.println("��ǰ�ڵ�: " + obj.goodsCode);
		System.out.println("������: " + obj.stockNum);
		

	}

}
