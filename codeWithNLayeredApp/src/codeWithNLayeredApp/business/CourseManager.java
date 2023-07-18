package codeWithNLayeredApp.business;

import java.util.ArrayList;
import java.util.List;

import codeWithNLayeredApp.core.logging.ILogger;
import codeWithNLayeredApp.dataAccess.ICourseDao;
import codeWithNLayeredApp.entities.Course;

public class CourseManager {

	private ICourseDao courseDao;
	private ILogger[] loggers;
	
	
	public CourseManager(ICourseDao courseDao, ILogger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}


	List<String> courses = new ArrayList<>();


	public void add(Course course) throws Exception {

		if (course.getCoursePrice() >= 0) {
			
			if (courses.contains(course.getCourseName())){
					throw new Exception("This course already exist: " + course.getCourseName());
			} 
			
			else {
	            courses.add(course.getCourseName());
	            courseDao.add(course);	            	            
			}
			
			for(ILogger logger : loggers) {
            	logger.log(course.getCourseName());
            }
			
		}
		else {
			throw new Exception ("The price of course cannot be lower than 0(zero): " + course.getCourseName());
		}

	}
}
