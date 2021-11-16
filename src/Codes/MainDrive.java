package Codes;

public class MainDrive {

	public static void main(String[] args) {

		Student std1 = new Student("김준기", 1996, true, 80, 70);

		ForeignStudent std2 = new ForeignStudent("마이클", 1996, true, 80, 70, 90);

		System.out.println("1번 학생 평균 : " + std1.getAverage());
		System.out.println("2번 학생 평균 : " + std2.getAverage());

		System.out.println(std1);
		System.out.println(std2);

	}

}
