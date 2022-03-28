package com.simens.dto;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;

@Component
public class Output {

	private double s1volume;
	private double s2volume;
	private double s3volume;
	private double s1weight;
	private double s2weight;
	private double s3weight;
	private double s1mCost;
	private double s2mCost;
	private double s3mCost;
	private double s1Cost;
	private double s2Cost;
	private double s3Cost;
	private double pCost;
	
	public double getS1volume() {
		return s1volume;
	}
	public void setS1volume(double s1volume) {
		this.s1volume = s1volume;
	}
	public double getS2volume() {
		return s2volume;
	}
	public void setS2volume(double s2volume) {
		this.s2volume = s2volume;
	}
	public double getS3volume() {
		return s3volume;
	}
	public void setS3volume(double s3volume) {
		this.s3volume = s3volume;
	}
	public double getS1weight() {
		return s1weight;
	}
	public void setS1weight(double s1weight) {
		this.s1weight = s1weight;
	}
	public double getS2weight() {
		return s2weight;
	}
	public void setS2weight(double s2weight) {
		this.s2weight = s2weight;
	}
	public double getS3weight() {
		return s3weight;
	}
	public void setS3weight(double s3weight) {
		this.s3weight = s3weight;
	}
	
	public double getS1mCost() {
		return s1mCost;
	}
	public void setS1mCost(double s1mCost) {
		this.s1mCost = s1mCost;
	}
	public double getS2mCost() {
		return s2mCost;
	}
	public void setS2mCost(double s2mCost) {
		this.s2mCost = s2mCost;
	}
	public double getS3mCost() {
		return s3mCost;
	}
	public void setS3mCost(double s3mCost) {
		this.s3mCost = s3mCost;
	}
	public double getS1Cost() {
		return s1Cost;
	}
	public void setS1Cost(double s1Cost) {
		this.s1Cost = s1Cost;
	}
	public double getS2Cost() {
		return s2Cost;
	}
	public void setS2Cost(double s2Cost) {
		this.s2Cost = s2Cost;
	}
	public double getS3Cost() {
		return s3Cost;
	}
	public void setS3Cost(double s3Cost) {
		this.s3Cost = s3Cost;
	}
	public double getpCost() {
		return pCost;
	}
	public void setpCost(double pCost) {
		this.pCost = pCost;
	}
	
	
}
