package com.day4.examcell;

public class ExamScore {
	public static void main(String[] args) {
		
		Student []arr= {
				new Student("Namam",21),
				new Student("Bob",56),
				new Student("Rahul",99),
				new Student("Jay",14),
				new Student("Rani",14)		
		};
		System.out.println("Before sorting");
		for(Student s:arr)
			System.out.println(s.name+"->"+s.score);
		RankGenerator.merge(arr, 0,arr.length-1);		
		System.out.println("After sorting");
		for(Student s:arr)
			System.out.println(s.name+"->"+s.score);
		
	}
}
