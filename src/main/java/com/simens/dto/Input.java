package com.simens.dto;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

@Component
public class Input {

	
	private int sl1;
	private int sl2;
	private int sl3;
	private int sd1;
	private int sd2;
	private int sd3;
	private String m1;
	private String m2;
	private String m3;
	private int s1NPart;
	private int s2NPart;
	private int s3NPart;

	public int getS1NPart() {
		return s1NPart;
	}
	public void setS1NPart(int s1nPart) {
		s1NPart = s1nPart;
	}
	public int getS2NPart() {
		return s2NPart;
	}
	public void setS2NPart(int s2nPart) {
		s2NPart = s2nPart;
	}
	public int getS3NPart() {
		return s3NPart;
	}
	public void setS3NPart(int s3nPart) {
		s3NPart = s3nPart;
	}
	public int getSl1() {
		return sl1;
	}
	public void setSl1(int sl1) {
		this.sl1 = sl1;
	}
	public int getSl2() {
		return sl2;
	}
	public void setSl2(int sl2) {
		this.sl2 = sl2;
	}
	public int getSl3() {
		return sl3;
	}
	public void setSl3(int sl3) {
		this.sl3 = sl3;
	}
	public int getSd1() {
		return sd1;
	}
	public void setSd1(int sd1) {
		this.sd1 = sd1;
	}
	public int getSd2() {
		return sd2;
	}
	public void setSd2(int sd2) {
		this.sd2 = sd2;
	}
	public int getSd3() {
		return sd3;
	}
	public void setSd3(int sd3) {
		this.sd3 = sd3;
	}
	public String getM1() {
		return m1;
	}
	public void setM1(String m1) {
		this.m1 = m1;
	}
	public String getM2() {
		return m2;
	}
	public void setM2(String m2) {
		this.m2 = m2;
	}
	public String getM3() {
		return m3;
	}
	public void setM3(String m3) {
		this.m3 = m3;
	}
	
	}
	

