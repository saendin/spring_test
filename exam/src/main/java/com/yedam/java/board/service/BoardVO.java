package com.yedam.java.board.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class BoardVO {
	private int boardNo;
	private String boardTitle;
	private String boardWriter;
	private String boardContent;
	private String boardImage;
	@DateTimeFormat(pattern = "yyyy-MM-dd") //값을 입력할 때 지정한 양식으로 입력받겠음을 의미 ex)좌측과 같이 형식을 입력받겠다 하고 실 데이터는 "yyyy/MM/dd"로 받을 시 오류남)
	private Date boardDate;
}
