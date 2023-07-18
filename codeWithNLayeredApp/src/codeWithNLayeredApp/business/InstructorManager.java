package codeWithNLayeredApp.business;

import codeWithNLayeredApp.core.logging.ILogger;
import codeWithNLayeredApp.dataAccess.IInstructorDao;
import codeWithNLayeredApp.entities.Instructor;

public class InstructorManager {
	
	private IInstructorDao instructorDao;
	private ILogger[] loggers;
	
	
	public InstructorManager(IInstructorDao instructorDao, ILogger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		
		for(ILogger logger : loggers) {
			logger.log(instructor.getInstructorName());
		}
		
		
	}
	


}
