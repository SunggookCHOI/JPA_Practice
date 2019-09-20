package model.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity(name="AREA_FOOT_TRAFFIC2")
public class FootTrafficDTO {
	//AREA_NAME   GENDER   AGE   DAY   TIMES   FT
	@Id@GeneratedValue(generator="FOOT_TRAFFIC_SEQ")
	private int id;
	
	@Column(length=2)
	private String gender;
	
	@Column(length=5)
	private String day;
	
	private int times;
	private int ft;
	
	@ManyToOne
	@JoinColumn(name="area_name")
	private AreaDTO area;
}
