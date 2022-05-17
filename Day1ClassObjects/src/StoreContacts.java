import java.util.Arrays;

public class StoreContacts {

	contact3 contact[]=new contact3[3];
	public StoreContacts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public contact3[] getContact() {
		return contact;
	}
	public void setContact(contact3[] contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "StoreContacts [contact=" + Arrays.toString(contact) + "]";
	}
		
		

}
