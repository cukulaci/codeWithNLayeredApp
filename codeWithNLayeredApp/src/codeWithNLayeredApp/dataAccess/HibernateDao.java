package codeWithNLayeredApp.dataAccess;

import codeWithNLayeredApp.entities.Category;
import codeWithNLayeredApp.entities.Course;
import codeWithNLayeredApp.entities.Instructor;

public class HibernateDao implements IInstructorDao, ICourseDao, ICategoryDao {

	@Override
	public void add(Category category) {
		System.out.println(category.getCategoryName() + " added with Hibernate");
		
	}

	@Override
	public void add(Course course) {
		System.out.println(course.getCourseName() + " added with Hibernate");
		
	}

	@Override
	public void add(Instructor instructor) {
		System.out.println(instructor.getInstructorName() + " added with Hibernate");
		
	}

}
