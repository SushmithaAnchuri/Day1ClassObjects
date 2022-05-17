
public class CreateStore {

	public static void main(String[] args) {
		StoreContacts store=new StoreContacts();
		contact3 con1=new contact3(1,"Jone Doe",7878787878l,"abc@gmail.com","Hallowean.com");
		contact3 con2=new contact3(2,"Jone Doe",8787878787l,"bcd@gmail.com","Monster.com");
		contact3 con3=new contact3(3,"Jenson Doe",9898989898l,"efg@gmail.com","Horrer.com");
		contact3 contact3Array[]=new contact3[3];
		contact3Array[0]=con1;
		contact3Array[1]=con2;
		contact3Array[2]=con3;
		store.setContact(contact3Array);
		contact3 contacts[]=store.getContact();
		for(contact3 contact:contacts) {
			System.out.println(contact);
		}
		
	}

}
