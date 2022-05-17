
public class CreateContact3 {

	public static void main(String[] args) {
		contact3 con1=new contact3(2,"John Doe",7878787878l,"abc@gmail.com","Hallowean.com");
		System.out.println(con1.getContactId());
		System.out.println(con1.getFirstName());
		System.out.println(con1.getMobileNo());
		System.out.println(con1.getEmail());
		System.out.println(con1.getCompany());
		con1.setMobileNo(7676767676l);
	}

}
