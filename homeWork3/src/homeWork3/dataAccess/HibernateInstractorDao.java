package homeWork3.dataAccess;

import homeWork3.entities.Instructor;

public class HibernateInstractorDao implements InstructorDao {

	
	public void add(Instructor instructor) {
		System.err.println("Hibernate ile veri tabanına eklenmiştir.");
		
	}

}
