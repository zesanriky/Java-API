package com.rahman.app.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * Entity Class for User Entity(to explicitly define your table name and column
 * name always use notation @Table and @Column with their name.
 * 
 * @author Rahman
 */

@Entity
@Table(name = "user")
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Long userId;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	@Email
	@NotBlank
	private String email;

	@Column(name = "password")
	private String password;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override

	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof User))
			return false;

		User user = (User) o;

		if (!getUserId().equals(user.getUserId()))
			return false;
		if (getFirstName() != null ? !getFirstName().equals(user.getFirstName()) : user.getFirstName() != null)
			return false;
		if (getLastName() != null ? !getLastName().equals(user.getLastName()) : user.getLastName() != null)
			return false;
		if (!getEmail().equals(user.getEmail()))
			return false;
		return getPassword().equals(user.getPassword());

	}

	@Override
	public int hashCode() {
		int result = getUserId().hashCode();
		result = 31 * result + (getFirstName() != null ? getFirstName().hashCode() : 0);
		result = 31 * result + (getLastName() != null ? getLastName().hashCode() : 0);
		result = 31 * result + getEmail().hashCode();
		result = 31 * result + getPassword().hashCode();
		return result;
	}
}
