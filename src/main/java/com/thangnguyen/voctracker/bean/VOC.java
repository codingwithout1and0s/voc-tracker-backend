package com.thangnguyen.voctracker.bean;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="VOC")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VOC {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String agent;
	private Date date;
	private double CSAT;
	private String contactId;
	private String loan;
	
	@ManyToOne(optional = false)
	private User user;
}
