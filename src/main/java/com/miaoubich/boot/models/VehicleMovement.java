package com.miaoubich.boot.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class VehicleMovement {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@ManyToOne
	@JoinColumn(name="vehicleid", insertable=false, updatable=false)
	private Vehicle vehicle;
	private int vehicleid;
	
	@ManyToOne
	@JoinColumn(name="locationid1", insertable=false, updatable=false)
	private Location location1;
	private int locationid1;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")	
	private Date date1;
	
	@ManyToOne
	@JoinColumn(name="locationid2", insertable=false, updatable=false)
	private Location location2;
	private int locationid2;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")		
	private Date date2;

	private String remarks;

	public int getVehicleid() {
		return vehicleid;
	}

	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}

	public int getLocationid1() {
		return locationid1;
	}

	public void setLocationid1(int locationid1) {
		this.locationid1 = locationid1;
	}

	public int getLocationid2() {
		return locationid2;
	}

	public void setLocationid2(int locationid2) {
		this.locationid2 = locationid2;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}

