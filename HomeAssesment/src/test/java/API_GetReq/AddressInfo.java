package API_GetReq;

public class AddressInfo {
	String Housenum;
	String Sector;
	String societyName;
	String City;
	String PostCode;
	public String getHousenum() {
		return Housenum;
	}
	public void setHousenum(String housenum) {
		Housenum = housenum;
	}
	public String getSector() {
		return Sector;
	}	
	public void setSector(String sector) {
		Sector = sector;
	}
	public String getSocietyName() {
		return societyName;
	}
	public void setSocietyName(String societyName) {
		this.societyName = societyName;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getPostCode() {
		return PostCode;
	}
	public void setPostCode(String postCode) {
		PostCode = postCode;
	}

}
