
public class CreateContacts2 {

	public static void main(String[] args) {
		contact2 con1=new contact2();
		
		
		System.out.println(con1.getContactId());
		System.out.println(con1.getFirstName());
		System.out.println(con1.getMobileNo());
		System.out.println(con1.getEmail());
		System.out.println(con1.getCompany());
		
		con1.setContactId(1);
		con1.setFirstName("john");
		con1.setMobileNo(7676767676l);
		con1.setEmail("efg@gmail.com");
		con1.setCompany("nasdaq");
		
		System.out.println(con1.getContactId());
		System.out.println(con1.getFirstName());
		System.out.println(con1.getMobileNo());
		System.out.println(con1.getEmail());
		System.out.println(con1.getCompany());
		
	}

}
