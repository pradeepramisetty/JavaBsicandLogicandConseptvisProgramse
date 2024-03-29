package java8features;

import java.util.Objects;

public class Employee {
	
	private int eNo;
	private String eNmae;
	private int eAge;
	private double eSal;
	private String eAdrs;
	
	public Employee() {
		
	}
	
	public Employee(int eNo, String eNmae, int eAge, double eSal, String eAdrs) {
		this.eNo = eNo;
		this.eNmae = eNmae;
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
	public String geteNmae() {
		return eNmae;
	}
	public void seteNmae(String eNmae) {
		this.eNmae = eNmae;
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
		return "Employee [eNo=" + eNo + ", eNmae=" + eNmae + ", eAge=" + eAge + ", eSal=" + eSal + ", eAdrs=" + eAdrs
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(eAdrs, eAge, eNmae, eNo, eSal);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(eAdrs, other.eAdrs) && eAge == other.eAge && Objects.equals(eNmae, other.eNmae)
				&& eNo == other.eNo && Double.doubleToLongBits(eSal) == Double.doubleToLongBits(other.eSal);
	}
	
	
	
}
