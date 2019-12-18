package day10;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import util.MyUtil;

public class Test05_Set {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		//Set<String> set = new TreeSet<String>(); // 오름차순 정렬
		set.add("lee");
		set.add("kim");
		set.add("ko");
		set.add("lee");
		set.add("park");
		
		MyUtil.iteratorPrint(set);
		
		
		
	}
}

