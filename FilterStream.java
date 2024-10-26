package BasicFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStream {
	
	public static void main(String[] args) {
		List<Integer> numberList = Arrays.asList(10,15,20,25,30);
		List<Integer> evenNoList = new ArrayList<>();
		
		//without stream
		for(int j : numberList) {
			if(j%2 == 0) {
				evenNoList.add(j);
			}
		}
		System.out.println(evenNoList);
		//using stream                           predicate arguments
		evenNoList = numberList.stream().filter(n -> n%2 ==0).collect(Collectors.toList());
		
		System.out.println(evenNoList);
		
		//forEach method                               consumer
		numberList.stream().filter(n-> n%2==0).forEach(j -> System.out.println(j));
		
		//MethodReference
		numberList.stream().filter(n-> n%2==0).forEach(System.out :: println);
	}
	


}
