package model.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity(name="AREA2")
public class AreaDTO {
	@Id
	@Column(name="AREA_NAME", length=50)
	private String areaName;
	
	@Column(length=30)
	private String sigungu;
	
	@OneToMany(mappedBy = "area")
	private List<FootTrafficDTO> traffic = new ArrayList<FootTrafficDTO>();
}
