import java.util.*;
import java.time.*;
class Contact implements java.io.Serializable{
		private String name=new String();
		private Set<Long> PhNo=new HashSet<>();
		private	String mail=new String();
		private String Addr=new String();
		private LocalDate dob;
		public Contact(){}
		
		
		public void setName(String name){	this.name=name; 	}
		public void setPhno(Long PhNo){ 	this.PhNo.add(PhNo);		}			//Stores Elements
		public void setMail(String mail){	this.mail=mail; 	}
		public void setAddr(String Addr){	this.Addr=Addr; 	}
		public void setDob(LocalDate dob){	this.dob=dob; 	}
		public void remove(){ 	this.PhNo.clear();		}							//To reset the PhNo Set
		
		
		public String getName(){	return name; 	}
		public Set getPhno(){ 	return PhNo;		}								//Retrieves Elelemnts
		public String getMail(){	return mail; 	}
		public String getAddr(){	return Addr; 	}
		public LocalDate getDob(){	return dob; 	}
		


	}