package Encapsulation;

public class Student {

	private int admissionId;
	private long phoneNumber;
	private String name;
	private String email;

	public void setAdmissionId(int admissionId) {
		this.admissionId = admissionId;
	}

	public int getAdmissionId() {
		return admissionId;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

}
