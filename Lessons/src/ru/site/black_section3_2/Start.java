package ru.site.section3_2;

public class Start {

	public static void main(String[] args) {
		
		/*
		 *  Игра. Аналог что, где, когда
		 *  В команде 2 человека
		 *  Команда играет против команды своей же лиги
		 *  3 лиги: школьники, студенты, взрослые (работники)
		 *  
		 */
		
		Schoolar schoolar1 = new Schoolar("Иван", 10);
		Schoolar schoolar2 = new Schoolar("Виталий", 13);
		Schoolar schoolar3 = new Schoolar("Олег", 12);
		Schoolar schoolar4 = new Schoolar("Никита", 11);
		
		Student student1 = new Student("Игорь", 20);
		Student student2 = new Student("Максим", 21);
		Student student3 = new Student("Вячеслав", 19);
		Student student4 = new Student("Анатолий", 20);
		 
		Employee employee1 = new Employee("Антон", 48);
		Employee employee2 = new Employee("Николай", 50);
		
		// Действие 1
		// Создавая так новую команду, есть возможность добавлять в нее не только школьников, но и студентов, поэтому закомментировал код, а ниже написан правильный вариант
//		Team teamSchoolar1 = new Team("Драконы");
//		Team teamSchoolar2 = new Team("Победа");
		
		// Действие 2
		// Правильный вариант. Чтобы создавалась команда, и она закрепленена за какой-то категорией: школьники, студенты, взрослые (работники)
		Team<Schoolar> teamSchoolar1 = new Team<>("Драконы");
		Team<Schoolar> teamSchoolar2 = new Team<>("Победа");
		
		Team<Student> teamStudent1 = new Team<>("Рогоносцы");
		Team<Student> teamStudent2 = new Team<>("Вперед");
		
		Team<Employee> teamEmployee1 = new Team<>("Работяги");
		Team<Employee> teamEmployee2 = new Team<>("Амурчики");
		
		// Действие 3
		// Добавляя так, есть возможность добавлять не только школьников, но и студентов, поэтому закомментировал код, а ниже написан правильный вариант
//		teamSchoolar1.addNewParticipant(schoolar1);
//		teamSchoolar1.addNewParticipant(schoolar2);
		
//		 Действие 4
		// Когда на вкладке Team и Start был написан первый вариант, то можно было в команду школьников ложить стунеднтов и взрослых. И метод работал без ошибок. После изменений в коде этот метод выдает ошибку, но метод ниже - такой же. Без ошибок работает.
//			teamSchoolar1.addNewParticipant(student1); // В команду школьников добавляются стуненты и взрослые, а должны только школьники, поэтому закомментировал, а ниже написано правильно.
		
		// Действие 5
		teamSchoolar1.addNewParticipant(schoolar1);
		teamSchoolar1.addNewParticipant(schoolar2);
		
		teamSchoolar2.addNewParticipant(schoolar3);
		teamSchoolar2.addNewParticipant(schoolar4);
		
		// *************
		
		teamStudent1.addNewParticipant(student1);
		teamStudent1.addNewParticipant(student2);
		
		teamStudent2.addNewParticipant(student3);
		teamStudent2.addNewParticipant(student4);
		
		// *************
		
		// Действие 6
		teamSchoolar1.playWith(teamSchoolar2);
		teamStudent1.playWith(teamStudent2);
		
	}

}
