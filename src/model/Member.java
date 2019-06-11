package model;

import java.time.LocalDate;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Member { // DB의 레코드와 매핑되는 객체
	private StringProperty uid; // DB의 필드와 매핑
	private StringProperty upw;
	private StringProperty uname;
	private final StringProperty mobilePhone;
	/*
    private final IntegerProperty zipcode;
    private ObjectProperty<LocalDate> birthday;
	*/
	public Member() {
		this(null, null, null, null);
	}
	
	public Member(String id, String pw, String name, String mobilePhone) {
		this.uid = new SimpleStringProperty(id);
		this.uname = new SimpleStringProperty(name);
		this.upw = new SimpleStringProperty(pw);
		this.mobilePhone = new SimpleStringProperty(mobilePhone);
	}
	
	public String getUid() {
		if(!uid.get().equals("\"null\""))
			return this.uid.get();
		return null;
	}
	
	public void setUid(String uid) {
		this.uid.set(uid);
	}
    public StringProperty uidProperty() {
        return uid;
    }
    
    public String getUpw() {
    	if(!upw.get().equals("\"null\""))
    	return this.upw.get();
    	return null;
    }
    public void setUpw(String upw) {
    	this.upw.set(upw);
    }
    public StringProperty upwProperty() {
        return upw;
    }
    
    public String getUname() {
    	if(!uname.get().equals("\"null\""))
    	return this.uname.get();
    	return null;
    }
    public void setUname(String uname) {
    	this.uname.set(uname);
    }
    public StringProperty unameProperty() {
        return uname;
    }
    
	public String getMobilePhone() {
		if(!mobilePhone.get().equals("\"null\""))
		return this.mobilePhone.get();
		return null;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone.set(mobilePhone);
	}
    public StringProperty mobilePhoneProperty() {
        return mobilePhone;
    }
}
