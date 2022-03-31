package students;

public class Student {
	int stdid;
	String stdname;
	int attd;
	int marks;
	public Student(int stdid, String stdname, int attd, int marks) {
		super();
		this.stdid = stdid;
		this.stdname = stdname;
		this.attd = attd;
		this.marks = marks;
	}
	public int getStdid() {
		return stdid;
	}
	public void setStdid(int stdid) {
		this.stdid = stdid;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public int getAttd() {
		return attd;
	}
	public void setAttd(int attd) {
		this.attd = attd;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", stdname=" + stdname + ", attd=" + attd + ", marks=" + marks + "]";
	}
	

}
