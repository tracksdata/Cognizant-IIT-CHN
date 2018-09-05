import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Member implements Comparable<Member>{
	private Long id;
	private String firstName;
	private String lastName;
	private String email;
	private String contactNumber;
	private String licenseNumber;
	private Date licenseStartDate;
	private Date licenseExpiryDate;

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

	public Member() {
		super();
	}

	public static Member createInstance(String s) throws NumberFormatException, ParseException, InvalidEmailException {
		
		String a[]=s.split(",");
		Member m=null;
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		if(a[3].contains("@")&&(a[3].contains(".com")||a[3].contains(".org")))
		{
			m=new Member(Long.parseLong(a[0]),a[1], a[2], a[3],a[4], a[5], sdf.parse(a[6]), sdf.parse(a[7]));
			
		}
		else
		{
			throw new InvalidEmailException("Invalid Email for "+a[1]);
		}
		return m;
		
		
	}

	@Override
	public int compareTo(Member arg0) {
		// TODO Auto-generated method stub
		return this.getFirstName().compareTo(arg0.getFirstName());
	}

}
