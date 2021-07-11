package ru.site.lesson4;

public class Student {
	
	// Когда указал в полях short, byte и такой же тип был в конструкторе ниже, то при заполнении экземпляра в Start была ошибка. Поменял в Student в полях и в конструкторе тип на инт и ошибка пропала.
	
	private int studentIdNumber;
	private String name;
	private String surname;
	private int yearOfStudy;
	private int averageScoreMath;
	private int averageScoreEconomics;
	private int averageScoreForeignLanguage;
	
	public Student(int studentIdNumber, String name, String surname, int yearOfStudy, int averageScoreMath,
			int averageScoreEconomics, int averageScoreForeignLanguage) {
		this.studentIdNumber = studentIdNumber;
		this.name = name;
		this.surname = surname;
		this.yearOfStudy = yearOfStudy;
		this.averageScoreMath = averageScoreMath;
		this.averageScoreEconomics = averageScoreEconomics;
		this.averageScoreForeignLanguage = averageScoreForeignLanguage;
	}
	
	public Student(int studentIdNumber, String name, String surname, int yearOfStudy) {
		this(studentIdNumber, name, surname, yearOfStudy, 0, 0, 0);
	}
	
	public Student() {
	}

	@Override
	public String toString() {
		return "Student [studentIdNumber=" + studentIdNumber + ", name=" + name + ", surname=" + surname
				+ ", yearOfStudy=" + yearOfStudy + ", averageScoreMath=" + averageScoreMath + ", averageScoreEconomics="
				+ averageScoreEconomics + ", averageScoreForeignLanguage=" + averageScoreForeignLanguage + "]";
	}
	
	public int calculateTheAverageScore() {
		int result = (averageScoreMath + averageScoreEconomics + averageScoreForeignLanguage) / 3;
		return result;
	}

	public int getStudentIdNumber() {
		return studentIdNumber;
	}

	public void setStudentIdNumber(int studentIdNumber) {
		this.studentIdNumber = studentIdNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getYearOfStudy() {
		return yearOfStudy;
	}

	public void setYearOfStudy(int yearOfStudy) {
		this.yearOfStudy = yearOfStudy;
	}

	public int getAverageScoreMath() {
		return averageScoreMath;
	}

	public void setAverageScoreMath(int averageScoreMath) {
		this.averageScoreMath = averageScoreMath;
	}

	public int getAverageScoreEconomics() {
		return averageScoreEconomics;
	}

	public void setAverageScoreEconomics(int averageScoreEconomics) {
		this.averageScoreEconomics = averageScoreEconomics;
	}

	public int getAverageScoreForeignLanguage() {
		return averageScoreForeignLanguage;
	}

	public void setAverageScoreForeignLanguage(int averageScoreForeignLanguage) {
		this.averageScoreForeignLanguage = averageScoreForeignLanguage;
	}
	
	
	
}
