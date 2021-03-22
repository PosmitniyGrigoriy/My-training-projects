package hello;

import org.springframework.web.client.RestTemplate;

public class Application {

	public static void main(String args[]) {
		RestTemplate restTemplate = new RestTemplate();
		Page page = restTemplate.getForObject("https://api.hh.ru/vacancies/42775852", Page.class);
		System.out.println();
		System.out.println("Должность:\t\t" + page.getName());
		System.out.println("Зарплата минимум:\t" + page.getSalary().getFrom());
		System.out.println("Зарплата максимум:\t" + page.getSalary().getTo());
		System.out.println("Ссылка на вакансию:\t" + page.getAlternate_url());
		System.out.println("Компания:\t\t" + page.getEmployer().getName());
		System.out.println("Дата вакансии:\t\t" + page.getPublished_at());
		System.out.println("Площадка:\t\t" + "HH");
	}

}