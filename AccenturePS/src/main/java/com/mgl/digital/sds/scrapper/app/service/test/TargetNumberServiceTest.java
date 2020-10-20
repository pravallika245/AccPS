package com.mgl.digital.sds.scrapper.app.service.test;

import java.util.Arrays;
import java.util.stream.Stream;

import com.mgl.digital.sds.scrapper.app.service.YourTargetNumberService;

public class TargetNumberServiceTest {
	
	public static void main(String[] args) {
		int[] numbers = Stream.of(0, 29, 10, 8, 19, 2).mapToInt(i->i).toArray();
		YourTargetNumberService targetNumberService = new YourTargetNumberService() ;
		try {
			int[] reqindices =targetNumberService.indices(numbers, 37);
			System.out.println(Arrays.toString(reqindices));
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	
}
