
public class ComparingObjects {

	public static void main(String[] args) {
		contact2 contact1=new contact2();
		contact2 contact2=new contact2();
		boolean result=(contact1.hashCode()==contact2.hashCode());
		System.out.println(result);
		contact2=contact1;
		result=(contact1==contact2);
		System.out.println(result);
		result=(contact1.hashCode()==contact2.hashCode());
		System.out.println(result);

	}

}
