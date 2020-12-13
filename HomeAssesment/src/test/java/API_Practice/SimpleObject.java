package API_Practice;

public class   SimpleObject{
	
	String Firstname;
	String Lastname;
	String StudentID;
	String Dept;
	AddressInfo[] addressInfo;
	Marks mark;
	
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public String getStudentID() {
		return StudentID;
	}
	public void setStudentID(String studentID) {
		StudentID = studentID;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public AddressInfo[] getAddressInfo() {
		return addressInfo;
	}
	public void setAddressInfo(AddressInfo[] addressInfo) {
		this.addressInfo = addressInfo;
	}
	public Marks getMark() {
		return mark;
	}
	public void setMark(Marks mark) {
		this.mark = mark;
	}

}
