package com.src.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="users")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userid;
	@Column
	private String firstUName;
	@Column
	private String LastUName;
	@Column
	private int userage;
	@Column
	private String email;
	@Column
	private String password;
	@Column
	private long usermobilenumber;
	@Column
	private String Address;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFirstUName() {
		return firstUName;
	}
	public void setFirstUName(String firstUName) {
		this.firstUName = firstUName;
	}
	public String getLastUName() {
		return LastUName;
	}
	public void setLastUName(String lastUName) {
		LastUName = lastUName;
	}
	public int getUserage() {
		return userage;
	}
	public void setUserage(int userage) {
		this.userage = userage;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getUsermobilenumber() {
		return usermobilenumber;
	}
	public void setUsermobilenumber(long usermobilenumber) {
		this.usermobilenumber = usermobilenumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public User(int userid, String firstUName, String lastUName, int userage, String email, String password,
			long usermobilenumber, String address) {
		super();
		this.userid = userid;
		this.firstUName = firstUName;
		LastUName = lastUName;
		this.userage = userage;
		this.email = email;
		this.password = password;
		this.usermobilenumber = usermobilenumber;
		Address = address;
	}
	public User(){
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", firstUName=" + firstUName + ", LastUName=" + LastUName + ", userage="
				+ userage + ", email=" + email + ", password=" + password + ", usermobilenumber=" + usermobilenumber
				+ ", Address=" + Address + "]";
	}
	
}
