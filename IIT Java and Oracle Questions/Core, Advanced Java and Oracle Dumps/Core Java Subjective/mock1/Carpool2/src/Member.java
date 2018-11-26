import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Member {
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String contactNumber;
	private String licenseNumber;
	private Date licenseStartDate;
	private Date licenseExpiryDate;
	private List<MemberCar> carList;
	


	public Member() {
		super();
	}

	public Member(Long id, String firstName, String lastName, String email,
			String contactNumber, String licenseNumber, Date licenseStartDate,
			Date licenseExpiryDate) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.contactNumber = contactNumber;
		this.licenseNumber = licenseNumber;
		this.licenseStartDate = licenseStartDate;
		this.licenseExpiryDate = licenseExpiryDate;
	}

	public void setCarList(List<MemberCar> carList) {
		this.carList = carList;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

	public Date getLicenseStartDate() {
		return licenseStartDate;
	}

	public void setLicenseStartDate(Date licenseStartDate) {
		this.licenseStartDate = licenseStartDate;
	}

	public Date getLicenseExpiryDate() {
		return licenseExpiryDate;
	}

	public void setLicenseExpiryDate(Date licenseExpiryDate) {
		this.licenseExpiryDate = licenseExpiryDate;
	}

	
	
	
	

	static Member findMember(Long memberId, ArrayList<Member> memberList) {
		Member m=null;
		for (int i = 0; i < memberList.size(); i++) {
			if(memberId==memberList.get(i).getId())
			{
				m=new Member();
				m=memberList.get(i);
			}
		}
		return m;
		
	}

	public  List<MemberCar> getCarList() {
		return carList;
		
	}

	
}
