package com.simens.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simens.dto.Input;
import com.simens.dto.Output;
import com.simens.service.CalculatorService;

@CrossOrigin(origins= "*")
@RestController
public class CalculatorController {

	@Autowired
	CalculatorService calcService;
	
	
	@PostMapping("/calc")
	public ResponseEntity<?> calculate(@RequestBody Input input){
		Output result = calcService.calculatedOp(input);
		Map<String, Object> map = new HashMap<>();
		map.put("status", "success");
		map.put("data", result);
		return ResponseEntity.ok(result);
		
	}
}
