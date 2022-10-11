package model;

import java.io.Serializable;

public class CD implements Serializable {
	private static int id=0;
	private String fullName, email, CDname, CDcode, type, description;
	
	
	public CD(String fullName, String email, String CDname, String CDcode, String type, String description) {
		this.fullName = fullName;
		this.email = email;
		this.CDname= CDname;
		this.CDcode= CDcode;
		this.type = type;
		this.description = description;
		++ this.id;
	}


	@Override
	public String toString() {
		return "CD [ Name = "+ fullName+", "
				+ "Email = "+email+", "
						+ "CD Name = "+CDname+", CD Code = "+CDcode+", Type = "+type+", "
								+ "Description="+ description +"]";
	}


	public static int getId() {
		return id;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCDname() {
		return CDname;
	}


	public void setCDname(String cDname) {
		CDname = cDname;
	}


	public String getCDcode() {
		return CDcode;
	}


	public void setCDcode(String cDcode) {
		CDcode = cDcode;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
}


	