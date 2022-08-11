package com.saran.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user") //Table name
public class User {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)//@Id represents primary key
	//@GeneratedValue represent the auto increment
	@Column(name="user_id")  //column name for the user table
	private int id;
	@Column(name="user_name")
	private String name;
	@Column(name="user_email")
	private String email;

}
