package com.example.dto;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;


@Table
@Entity
public class Employee {
	
	@Id
	@Column
	@GeneratedValue
	private int Id;
	
	@NotNull(message = "Name shouldn't null")
	 private String name;
	 private String city;
	 @Pattern(regexp = "/\\b([0-9]|10)\\b /", message = "Number should not be zero" )
	 private int number;
	 @Min(18)
	 @Max(80)
	 private int age;
	@NotBlank
	 private String nationality;
	@jakarta.validation.constraints.Email(message = "email should not null")
	 private String Email; 
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", city=" + city + ", number=" + number + ", age=" + age
				+ ", nationality=" + nationality + ", Email=" + Email + "]";
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public Employee(int id, String name, String city, int number, int age, String nationality, String email) {
		super();
		Id = id;
		this.name = name;
		this.city = city;
		this.number = number;
		this.age = age;
		this.nationality = nationality;
		Email = email;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Employee() {
		
	}

}
