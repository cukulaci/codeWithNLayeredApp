package codeWithNLayeredApp;

import java.lang.System.Logger;

import codeWithNLayeredApp.business.CategoryManager;
import codeWithNLayeredApp.business.CourseManager;
import codeWithNLayeredApp.business.InstructorManager;
import codeWithNLayeredApp.core.logging.DatabaseLogger;
import codeWithNLayeredApp.core.logging.FileLogger;
import codeWithNLayeredApp.core.logging.ILogger;
import codeWithNLayeredApp.core.logging.MailLogger;
import codeWithNLayeredApp.dataAccess.HibernateDao;
import codeWithNLayeredApp.dataAccess.JdbcDao;
import codeWithNLayeredApp.entities.Category;
import codeWithNLayeredApp.entities.Course;
import codeWithNLayeredApp.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		
		ILogger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		
		
		Category category1 = new Category("Frontend");
		Category category2 = new Category("Backend");
		Category category3 = new Category("Fullstack");
		Category category4 = new Category("Fullstack1");
		
		CategoryManager categoryManager = new CategoryManager(new HibernateDao(), loggers);
		categoryManager.add(category1);
//		categoryManager.add(category2);
//		categoryManager.add(category3);
//		categoryManager.add(category4);
		
		
		System.out.println("------------------");
		
		
		
		Course course1 = new Course("Java", 1500.0);
		Course course2 = new Course("Phyton", 1450.0);
		Course course3 = new Course("C#", 2550);
		Course course4 = new Course("C", 2000);
		
		CourseManager courseManager = new CourseManager(new JdbcDao(), loggers);
		courseManager.add(course1);
//		courseManager.add(course2);
//		courseManager.add(course3);
//		courseManager.add(course4);
		
		
		System.out.println("------------------");
		
		
		
		Instructor instructor1 = new Instructor("John");
		Instructor instructor2 = new Instructor("Jason");
		Instructor instructor3 = new Instructor("Celine");
		Instructor instructor4 = new Instructor("Martin");
		
		InstructorManager instructorManager = new InstructorManager(new HibernateDao(), loggers);
		instructorManager.add(instructor1);
//		instructorManager.add(instructor2);
//		instructorManager.add(instructor3);
//		instructorManager.add(instructor4);
		
		
		



	}

}
