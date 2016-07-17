package com.ash.hackerRank.datastructures.array;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * There are strings. Each string's length is no more 
 * than characters. There are also queries. For each query, 
 * you are given a string, and you need to find out
 *  how many times this string occurred previously. 
 * @author amith2
 *
 *
 *Input Format

The first line contains , the number of strings.
The next lines each contain a string.
The nd line contains , the number of queries.
The following lines each contain a query string.

Constraints
1<=N<=1000
1<=Q<=1000
1<=length of any string <=20

input
4
aba
baba
aba
xzxb
3
aba
xzxb
ab

output
2
1
0


 */
public interface SparseArray {

	public static void main(String args[]){/*
		
		Scanner scanner =new Scanner(System.in);
		int N=Integer.parseInt(scanner.nextLine());
		String [] stringsArray=new String[N];
		for(int i=0;i<stringsArray.length;i++){
			String value=scanner.nextLine();
//			System.out.println("Entered value is "+ value);
			stringsArray[i]=value;
		}
		int Q=Integer.parseInt(scanner.nextLine());
		String [] stringsToSearchArray=new String[Q];
		for(int i=0;i<stringsToSearchArray.length;i++){
			stringsToSearchArray[i]=scanner.nextLine();
		}
		
		int[] foundin=new int[Q];
		int index=0;
		for(String val:stringsToSearchArray){
			int sum=0;
			for(String str:stringsArray){
				if(str.equals(val))
					sum++;
			}
			foundin[index]=sum;
			index++;
			
		}
		
		for(int i:foundin){
			System.out.println(i);
		}
		
		
	*/
		
	Scanner scanner=new Scanner(System.in);
	List<String> inputValues=IntStream.range(0,scanner.nextInt()).mapToObj(i -> scanner.next()).collect(Collectors.toList());
	
	IntStream.range(0, scanner.nextInt()).mapToObj(i-> scanner.next()).mapToLong(q -> inputValues.stream().filter(q::equals).count()).forEach(System.out::println);
	
	
	
	
	}
}
