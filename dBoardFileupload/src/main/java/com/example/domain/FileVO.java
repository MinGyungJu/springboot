package com.example.domain;

import lombok.Data;

// Board_file 테이블 VO

@Data
public class FileVO {
	private long fileId;
	private String origFileName;
	private String fileName;
	private String filePath;

}
