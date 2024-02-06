package com.example.dto;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table
@Entity
public class Employee {
	
	@Id
	@Column
	@GeneratedValue
	private int Id;
	
	@Column
	 private String name;
	 private String city;
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
	public Employee(int id, String name, String city) {
		super();
		Id = id;
		this.name = name;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + Id + ", name=" + name + ", city=" + city + "]";
	}
	 
	 
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	 

}
