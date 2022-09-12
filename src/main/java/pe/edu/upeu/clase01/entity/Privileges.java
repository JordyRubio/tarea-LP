package pe.edu.upeu.clase01.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor 
@NoArgsConstructor

public class Privileges implements Serializable{
	
	
	
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String privilege_name;
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPrivilege_name() {
		return privilege_name;
	}
	public void setPrivilege_name(String privilege_name) {
		this.privilege_name = privilege_name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
