package codeWithNLayeredApp.dataAccess;

import codeWithNLayeredApp.entities.Category;
import codeWithNLayeredApp.entities.Course;
import codeWithNLayeredApp.entities.Instructor;

public class JdbcDao implements IInstructorDao, ICourseDao, ICategoryDao{

	@Override
	public void add(Category category) {
		System.out.println(category.getCategoryName() + " added with JDBC");
		
	}

	@Override
	public void add(Course course) {
		System.out.println(course.getCourseName() + " added with JDBC");
		
	}

	@Override
	public void add(Instructor instructor) {
		System.out.println(instructor.getInstructorName() + " added with JDBC");
		
	}

}
