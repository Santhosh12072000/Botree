package mypkg;

public class UserName {
	private String fname;
	private String lname;
	public UserName() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserName(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	

}
