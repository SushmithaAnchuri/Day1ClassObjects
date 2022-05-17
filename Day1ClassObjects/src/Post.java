
public class Post {
		String contacts;
		String sentmsg;
		String status;
		
		public Post(String string, String string2, String string3) {
			// TODO Auto-generated constructor stub
		}
		public String getContacts() {
			return contacts;
		}
		public void setContacts(String contacts) {
			this.contacts = contacts;
		}
		public String getSendmsg() {
			return sentmsg;
		}
		public void setSendmsg(String sendmsg) {
			this.sentmsg = sendmsg;
		}
		
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		@Override
		public String toString() {
			return "Post [contacts=" + contacts + ", sentmsg=" + sentmsg + ", status=" + status + "]";
		}
		
		
		
		
		

}
