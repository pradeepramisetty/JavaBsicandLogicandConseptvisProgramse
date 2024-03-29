package collectionBasedPrograms;

import java.util.Comparator;
import java.util.Objects;

public class Emplyee implements Comparable<Emplyee>{
	
	private int eNo;
	private String eName;
	private int eAge;
	private double eSal;
	private String eAdrs;
	
	public Emplyee() {
		
	}
	
	public Emplyee(int eNo, String eName, int eAge, double eSal, String eAdrs) {
		this.eNo = eNo;
		this.eName = eName;
		this.eAge = eAge;
		this.eSal = eSal;
		this.eAdrs = eAdrs;
	}

	public int geteNo() {
		return eNo;
	}

	public void seteNo(int eNo) {
		this.eNo = eNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int geteAge() {
		return eAge;
	}

	public void seteAge(int eAge) {
		this.eAge = eAge;
	}

	public double geteSal() {
		return eSal;
	}

	public void seteSal(double eSal) {
		this.eSal = eSal;
	}

	public String geteAdrs() {
		return eAdrs;
	}

	public void seteAdrs(String eAdrs) {
		this.eAdrs = eAdrs;
	}

	@Override
	public String toString() {
		return "Emplyee [eNo=" + eNo + ", eName=" + eName + ", eAge=" + eAge + ", eSal=" + eSal + ", eAdrs=" + eAdrs
				+ "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emplyee other = (Emplyee) obj;
		return Objects.equals(eAdrs, other.eAdrs) && eAge == other.eAge && Objects.equals(eName, other.eName)
				&& eNo == other.eNo && Double.doubleToLongBits(eSal) == Double.doubleToLongBits(other.eSal);
	}

	@Override
	public int compareTo(Emplyee o) {
		// TODO Auto-generated method stub
		return 0;
	}

	

	
	
	
	
	
	
}
