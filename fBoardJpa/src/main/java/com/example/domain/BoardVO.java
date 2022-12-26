package com.example.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="board")
public class BoardVO {
	
	@Id
	@GeneratedValue
	private Integer seq;
	
	private String writer;
	private String title;
	private String content;
	
	@Column(insertable=false, updatable = false, columnDefinition = "date default sysdate")
	private Date regdate;
	@Column(insertable=false, updatable = false, columnDefinition = "number default 0")
	private Integer cnt;
	

}
