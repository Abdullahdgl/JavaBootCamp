package homeWork3.dataAccess;

import homeWork3.entities.Course;

public class JdbcCourseDao implements CourseDao{


	public void add(Course course) {
		System.out.println("JDBC ile veritabınına eklendi");

		
	}

}
