package collectionBasedPrograms;

import java.util.Objects;

public class Student {
	
	private int sNo;
	private String sName;
	private int sAge;
	private String sBranch;
	
	public Student() {
		
	}

	public Student(int sNo, String sName, int sAge, String sBranch) {
		
		this.sNo = sNo;
		this.sName = sName;
		this.sAge = sAge;
		this.sBranch = sBranch;
	}

	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getsAge() {
		return sAge;
	}

	public void setsAge(int sAge) {
		this.sAge = sAge;
	}

	public String getsBranch() {
		return sBranch;
	}

	public void setsBranch(String sBranch) {
		this.sBranch = sBranch;
	}

	@Override
	public String toString() {
		return "Student [sNo=" + sNo + ", sName=" + sName + ", sAge=" + sAge + ", sBranch=" + sBranch + "]";
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return sAge == other.sAge && Objects.equals(sBranch, other.sBranch) && Objects.equals(sName, other.sName)
				&& sNo == other.sNo;
	}
	
	
	
}
