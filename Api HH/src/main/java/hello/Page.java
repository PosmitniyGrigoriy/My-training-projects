package hello;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Page {

    private String name;
    private Salary salary;
    private String alternate_url;
    private Employer employer;
    private String published_at;

    public String getName() {
        return name;
    }

    public Salary getSalary() {
        return salary;
    }

    public String getAlternate_url() {
        return alternate_url;
    }

    public Employer getEmployer() {
        return employer;
    }

    public String getPublished_at() {
        return published_at;
    }
	
}