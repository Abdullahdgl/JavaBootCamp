package homeWork3;

import homeWork3.business.CategoryManager;
import homeWork3.business.CourseManager;
import homeWork3.business.InstructorManager;
import homeWork3.core.logging.DatabaseLogger;
import homeWork3.core.logging.FileLogger;
import homeWork3.core.logging.Logger;

import homeWork3.dataAccess.HibernateCourseDao;
import homeWork3.dataAccess.JdbcCategoryDao;
import homeWork3.dataAccess.JdbcInstructorDao;
import homeWork3.entities.Category;
import homeWork3.entities.Course;
import homeWork3.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger[]loggers = {new DatabaseLogger(), new FileLogger()};
		
		Instructor instructor = new Instructor(1, "AYSE", "DOĞAN");
		Instructor instructor2 = new Instructor(2, "BEKİR", "CAN");
		
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(),loggers);
		instructorManager.add(instructor);
		instructorManager.add(instructor2);
		
		
		Category  category = new Category(7,"DELPHİ");
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
		categoryManager.add(category);
		
		
		
		Course course = new Course(1, "Engin Demiroğ - Java", 150000);
		Course course2 = new Course(2, "Engin Demiroğ - c#", 190000);
		
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course);
		courseManager.add(course2);
		
		
		
		
		
	}

}
