package com.src.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class Orders {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderid;
	@Column
	private String clothesType;
	@Column
	private String cname;
	@Column
	private int quantity;
	@Column
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getMedicineType() {
		return clothesType;
	}
	
	public void setMedicineType(String clothesType) {
		this.clothesType = clothesType;
	}
	public String getMname() {
		return cname;
	}
	public void setMname(String mname) {
		this.cname = cname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Orders(int orderid,  String clothesType, String mname, int quantity,String email) {
		super();
		this.orderid = orderid;
		this.clothesType = clothesType;
		this.cname = cname;
		this.quantity = quantity;
		this.email=email;
		}
	public Orders(){
	}
	@Override
	public String toString() {
		return "Orders [orderid=" + orderid +  ", clothesType=" + clothesType + ", cname=" + cname
				+ ", quantity=" + quantity + "]";
	}
	
	
	}
