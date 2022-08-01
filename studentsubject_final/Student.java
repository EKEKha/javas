package studentsubject_final;

import java.util.ArrayList;
import java.util.Objects;

public class Student {//설계도
	//1. 멤버변수(=field) : 속성
	public int studentID;
	public String studentName;
	
	
	//★★ 수강하는 과목들을 처리해주는 멤버변수(클래스 간의 포함관계)
	private ArrayList<Subject> subjectList;//여러과목을 배열로 처리 //순서1
	
	
	
	//2.생성자//클래스의 접근제어자를 따름
	public Student(int studentID, String studentName) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		
		subjectList=new ArrayList<Subject>();//순서2 포함관계
	}
	

	//3.메서드 : 소문자로 시작 ~()기능
	//학생이 수강하는 과목과 그 해당 점수를 추가하는 메서드
	public void addSubject(String subjectName,int subjectScore){
		//Subject subject =new Subject(subjectName,subjectScore);
		//subjectList.add(subject);//객체를만들어서 subjectList 참조하도록 추가
		
		subjectList.add(new Subject(subjectName,subjectScore));//subject라는 지역변수 필요없이 위의 두문장 간단하게 표현
		
	}
	
	//학생이 수강하는 과목들의 성적을 출력, 총점과 평균 출력하는 메서드
	/*
	 * 문제
	 * ------------------
	 * <1번 학생  홍길동>
		자바 과목 성적: 95점 
	 *  오라클 과목 성적:98점
	 * ------------------
	 * 총점:193점
	 * 평균: 96.5점
	 * ---------------
	 */
	public void showStudentInfo(){
		System.out.println("--------------------------");
		System.out.println("<"+this.studentID+"번 학생 "+studentName+">");//같은클래스 this생략
		
		double totalScore = 0;
		for(Subject s:subjectList) {
			System.out.println(s.getSubjectName()+"과목 성적 : "+s.getSubjectScore()+"점");
			
			totalScore += s.getSubjectScore();
		}
		System.out.println("--------------------------");
		System.out.println("총점 : "+totalScore+ "점");
		//System.out.println("평균 : "+totalScore/subjectList.size()+"점");
		System.out.printf("평균 : %.1f점 \n",totalScore/subjectList.size());
		System.out.println("--------------------------");
		
	}


	@Override
	public String toString() {
		return  studentID + "번 학생"+ studentName+ "\n"+subjectList+totalScore_Avg();
				
	}

	private String totalScore_Avg() {
		double totalScore = 0;
		for(Subject s:subjectList) {
			totalScore += s.getSubjectScore();
		}
		return "\n총점 : "+ totalScore+"점\n" + "평균 : " + totalScore/subjectList.size()+"점\n";
		
	}

	
	
	
	

}
