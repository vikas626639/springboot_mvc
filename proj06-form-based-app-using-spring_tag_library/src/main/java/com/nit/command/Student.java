package com.nit.command;

import lombok.Data;

@Data
public class Student {
	private Integer sno;
	private String sname;
	private String addrs;
	private String gender;
	private Long phno;
	private String email;
	private String course;
	private String[] time;
}
