package ru.site.lesson22;

class Students3 {
	
	private StringBuilder name;
	private int course;
	private int grade;
	
	StringBuilder getName() {
		StringBuilder sbName = new StringBuilder(name);
		return sbName;
	}
	
	int getCourse() {
		return course;
	}
	
	int getGrade() {
		return grade;
	}
	
	void setName(StringBuilder name) {
		if(name.length() > 3) {
			this.name = name;
		}
	}
	
	void setCourse(int course) {
		if(course >= 1 && course <= 4) {
			this.course = course;
		}
	}
	
	void setGrade(int grade) {
		if(grade >= 1 && grade <= 10) {
			this.grade = grade;
		}
	}
	
	void showInfo(StringBuilder name, int course, int grade) {
		setName(name);
		setCourse(course);
		setGrade(grade);
		System.out.println(getName() + ", " + getCourse() + " курс, оценка " + getGrade());
	}
	
}

public class Start5 {
	
	public static void main(String[] args) {
		
		Students3 students3 = new Students3();
		students3.showInfo(new StringBuilder("Игорь"), 4, 8);
		students3.showInfo(new StringBuilder("Олег"), 2, 10);
		
	}
	
}
