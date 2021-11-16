package Codes;

public class ForeignStudent extends Student {

	int englishScore;

	public ForeignStudent(String name, int birthYear, boolean isMale, int koreanScore, int mathScore,
			int englishScore) {
		super(name, birthYear, isMale, koreanScore, mathScore);
		this.englishScore = englishScore;
	}

	@Override
	int getAverage() {
		int avg = (this.koreanScore + this.mathScore + this.englishScore) / 3;
		return avg;
	}

}
