
public class contact3 {
	private int contactId;
	private String firstName;
	private long mobileNo;
	private String email;
	private String company;
	public int getContactId() {
		return contactId;
	}
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "contact3 [contactId=" + contactId + ", firstName=" + firstName + ", mobileNo=" + mobileNo + ", email="
				+ email + ", company=" + company + "]";
	}
	public contact3(int contactId, String firstName, long mobileNo, String email, String company) {
		super();
		this.contactId = contactId;
		this.firstName = firstName;
		this.mobileNo = mobileNo;
		this.email = email;
		this.company = company;
	}
	
}
