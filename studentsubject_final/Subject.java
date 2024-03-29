package studentsubject_final;

public class Subject {//과목
	//정보보안:private
	
	private String subjectName;//과목명
	private int subjectScore;//과목성적
	
	
	
	public Subject(String subjectName, int subjectScore) {
		super();
		this.subjectName = subjectName;
		this.subjectScore = subjectScore;
	}

	//외부에서 접근가능한 메서드를 통해 private 멤버변수에 간접접근

	public String getSubjectName() {
		return subjectName;
	}



	public int getSubjectScore() {
		return subjectScore;
	}

	@Override
	public String toString() {
		return   subjectName + "과목 :" + subjectScore + "점";
	}
	
}
