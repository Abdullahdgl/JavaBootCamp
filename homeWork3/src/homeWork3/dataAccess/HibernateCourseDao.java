package homeWork3.dataAccess;

import homeWork3.entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veri tabanına eklenmiştir.");
		
	}

}
