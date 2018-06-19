
public class P211_ObjectExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer obj;
		obj = new StringBuffer("Hey Java!");
		obj.deleteCharAt(1);
		obj.deleteCharAt(1);
		obj.insert(1, 'i');
		System.out.println(obj);
	}

}
