package com.simens.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simens.dto.Input;
import com.simens.dto.Output;

@Service
public class CalculatorService {
	@Autowired
	Output output;

	public Output calculatedOp(Input input) {

		switch (input.getM1()) {
		case "c":
			output.setS1volume(getVol(input.getSl1(),input.getSd1()));
			output.setS1weight(getWeight(input.getSl1(), input.getSd1(), 8830));
			output.setS1mCost(getMatCost(10,output.getS1weight()));
			output.setS1Cost(getSetCost(output.getS1mCost(), input.getS1NPart()));
			break;
		case "a":
			output.setS1volume(getVol(input.getSl1(),input.getSd1()));
			output.setS1weight(getWeight(input.getSl1(), input.getSd1(), 2710));
			output.setS1mCost(getMatCost(76,output.getS1weight()));
			output.setS1Cost(getSetCost(output.getS1mCost(), input.getS1NPart()));
			break;
		case "ci":
			output.setS1volume(getVol(input.getSl1(),input.getSd1()));
			output.setS1weight(getWeight(input.getSl1(), input.getSd1(), 7150));
			output.setS1mCost(getMatCost(45,output.getS1weight()));
			output.setS1Cost(getSetCost(output.getS1mCost(), input.getS1NPart()));
			break;
		case "s":
			output.setS1volume(getVol(input.getSl1(),input.getSd1()));
			output.setS1weight(getWeight(input.getSl1(), input.getSd1(), 8030));
			output.setS1mCost(getMatCost(43,output.getS1weight()));
			output.setS1Cost(getSetCost(output.getS1mCost(), input.getS1NPart()));
			break;
		}
		switch (input.getM2()) {
		case "c":
			output.setS2volume(getVol(input.getSl2(),input.getSd2()));
			output.setS2weight(getWeight(input.getSl2(), input.getSd2(), 8830));
			output.setS2mCost(getMatCost(10,output.getS2weight()));
			output.setS2Cost(getSetCost(output.getS2mCost(), input.getS2NPart()));
			break;
		case "a":
			output.setS2volume(getVol(input.getSl2(),input.getSd2()));
			output.setS2weight(getWeight(input.getSl2(), input.getSd2(), 2710));
			output.setS2mCost(getMatCost(76,output.getS2weight()));
			output.setS2Cost(getSetCost(output.getS2mCost(), input.getS2NPart()));
			break;
		case "ci":
			output.setS2volume(getVol(input.getSl2(),input.getSd2()));
			output.setS2weight(getWeight(input.getSl2(), input.getSd2(), 7150));
			output.setS2mCost(getMatCost(45,output.getS2weight()));
			output.setS2Cost(getSetCost(output.getS2mCost(), input.getS2NPart()));
			break;
		case "s":
			output.setS2volume(getVol(input.getSl2(),input.getSd2()));
			output.setS2weight(getWeight(input.getSl2(), input.getSd2(), 8030));
			output.setS2mCost(getMatCost(43,output.getS2weight()));
			output.setS2Cost(getSetCost(output.getS2mCost(), input.getS2NPart()));
			break;
		}
		
		switch (input.getM3()) {
		case "c":
			output.setS3volume(getVol(input.getSl3(),input.getSd3()));
			output.setS3weight(getWeight(input.getSl3(), input.getSd3(), 8830));
			output.setS3mCost(getMatCost(10,output.getS3weight()));
			output.setS3Cost(getSetCost(output.getS3mCost(), input.getS3NPart()));
			break;
		case "a":
			output.setS3volume(getVol(input.getSl3(),input.getSd3()));
			output.setS3weight(getWeight(input.getSl3(), input.getSd3(), 2710));
			output.setS3mCost(getMatCost(76,output.getS3weight()));
			output.setS3Cost(getSetCost(output.getS3mCost(), input.getS3NPart()));
			break;
		case "ci":
			output.setS3volume(getVol(input.getSl3(),input.getSd3()));
			output.setS3weight(getWeight(input.getSl3(), input.getSd3(), 7150));
			output.setS3mCost(getMatCost(45,output.getS3weight()));
			output.setS3Cost(getSetCost(output.getS3mCost(), input.getS3NPart()));
			break;
		case "s":
			output.setS3volume(getVol(input.getSl3(),input.getSd3()));
			output.setS3weight(getWeight(input.getSl3(), input.getSd3(), 8030));
			output.setS3mCost(getMatCost(43,output.getS3weight()));
			output.setS3Cost(getSetCost(output.getS3mCost(), input.getS3NPart()));
			break;
		}

		return output;

	}

	public double getVol(int l, int d) {
		double pi = 3.14;
		l = l / 100;
		d = d / 100;
		return pi / 4 * (d * d) * l;
	}

	public double getWeight(int l, int d, int density) {

		return getVol(l, d) * density;

	}

	public double getMatCost(int cost, double weight) {
		return cost * weight;
	}

	public double getSetCost(double matCost, int nPart) {
		return nPart * matCost;
	}
	
	
}
