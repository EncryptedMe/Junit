package MappingRealtionship;
import javax.persistence.*;

@Entity
@Table (name = "RUser1")
public class User {
	
	@Id
	private int Uid;
	private String UserName;
	
	public User() {}
	
	public User(int Uid, String UserName) {
		this.Uid = Uid; this.UserName=UserName;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getUid() {
		return Uid;
	}
	public void setUid(int uid) {
		Uid = uid;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	@OneToOne(mappedBy = "user")
    @JoinColumn(name="User_ID")
	public Address address;
}
