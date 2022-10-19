package homeWork3.business;

import homeWork3.core.logging.Logger;
import homeWork3.dataAccess.CourseDao;
import homeWork3.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		
		this.courseDao = courseDao;
		this.loggers = loggers;
	}
	public void add(Course course) throws Exception {
		
		if(course.getPrice()<0 && course.getName() != course.getName())
		{
			throw new Exception("Kursun Fiyatı hiçbir zaman sıfırdan küçük olamaz ve kursun ismi kesinlikle tekrar edemez");
		}
		
		courseDao.add(course);
		for(Logger logger: loggers) {
			logger.log(course.getName());
		}
	}
	
	
	

}
