package com.mgl.digital.sds.scrapper.algorithm;

import static org.junit.Assert.*;

import java.util.stream.Stream;

import org.junit.Test;
import org.junit.platform.commons.util.StringUtils;



public class CountYZTest {

	public int countYZ(String str) {
		int count = 0;
		if(StringUtils.isNotBlank(str)){
			str=str.toLowerCase();
			int length =str.length();
			for(int i = 0; i < length; i++){
				if( str.charAt(i) == 'y' || str.charAt(i) == 'z'){
					if(i<length-1 &&!(Character.isLetter(str.charAt(i+1)))){
						count++;	
					}else if(i==length-1) {
						count++;
					}
				
				}
			}
		}
		return count;

	}

	@Test
	public void shouldPass() throws Exception {
		assertEquals(2, countYZ("fez day"));
		assertEquals(2, countYZ("day fez"));
		assertEquals(1, countYZ("day yak"));
		assertEquals(1, countYZ("day:yak"));
		assertEquals(2, countYZ("!!day--yaz!!"));
		assertEquals(2, countYZ("DAY abc XYZ"));
		assertEquals(3, countYZ("aaz yyz my"));
		assertEquals(2, countYZ("y2bz"));
		assertEquals(0, countYZ("zxyx"));
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
