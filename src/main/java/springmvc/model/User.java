package springmvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="users")
public class User {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private int id;
 private String username;
 private String email;
 private String password;

public User(String userName, String userEmail, String password) {
	super();
	this.username = userName;
	this.email = userEmail;
	this.password = password;
}
public User() {
	// TODO Auto-generated constructor stub
}
 
}
