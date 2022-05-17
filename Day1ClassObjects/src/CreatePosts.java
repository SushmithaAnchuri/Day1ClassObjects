
public class CreatePosts {

	public static void main(String[] args) {
		Post p=new Post("sushma","Hi,How are you?","Happy");
		//p.status="I am busy";
		//p.contacts="jonson";
		//p.sentmsg="hi";
		//System.out.println(p.status);
		//System.out.println(p.contacts);
		//System.out.println(p.sentmsg);
		
		//p.setContacts("Sushma");
		//p.setSendmsg("Hi,How are you");
		//p.setStatus("Happy");
		
		System.out.println(p.getContacts());
		System.out.println(p.getSendmsg());
		System.out.println(p.getStatus());
	}

}
