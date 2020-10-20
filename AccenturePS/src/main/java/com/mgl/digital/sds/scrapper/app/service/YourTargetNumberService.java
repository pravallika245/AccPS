package com.mgl.digital.sds.scrapper.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


public class YourTargetNumberService implements TargetNumberService {
	
	public int[] indices2(int[] arr,int target) {
		List<Integer> targetnumberindices =null;
		for(int i=0; i<arr.length;i++) {
			int temp =target-arr[i];
			int index =IntStream.range(0, arr.length).filter(j->temp==arr[j]).findFirst().orElse(-1);
			if(index!=-1) {
				targetnumberindices=new ArrayList<>();
				targetnumberindices.add(i);
				targetnumberindices.add(index);
				break;
				
			}

		}
		if(null== targetnumberindices) {
			throw new IllegalStateException("wrong input");
		}
		return targetnumberindices.stream().mapToInt(i2->i2).toArray();


	}

    public int[] indices(int[] arr, int target) {
    	List<Integer> targetnumberindices =null;
    	if(null!=arr && arr.length>2) {
    		 targetnumberindices = new ArrayList<Integer>(2);
    		for (int i = 0; i < arr.length; i++) {
    			for (int j = i + 1; j < arr.length; j++) {
    				if ((arr[i] + arr[j]) == target) {
    					targetnumberindices.add(i);
    					targetnumberindices.add(j);
    				}
    			}
    		}
    		

    	}
    	if(null== targetnumberindices) {
    		 throw new IllegalStateException("wrong input");
    	}
    	return targetnumberindices.stream().mapToInt(i->i).toArray();
    	
    		
    	
       
    }
}
