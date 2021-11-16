package Codes;

public class Student {

	String name;
	int birthYear;
	boolean isMale;
	int koreanScore;
	int mathScore;

	public Student(String name, int birthYear, boolean isMale, int koreanScore, int mathScore) {

		super();
		this.name = name;
		this.birthYear = birthYear;
		this.isMale = isMale;
		this.koreanScore = koreanScore;
		this.mathScore = mathScore;
	}

	@Override
	public String toString() {
		String str = "이름 : " + this.name + ", 출생연도 : " + this.birthYear;
		return str;
	}

	int getAverage() {

		int avg = (this.koreanScore + this.mathScore) / 2;
		return avg;
	}

}
