package homeWork3.dataAccess;

import homeWork3.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("JDBC ile veritabınına eklendi");
		
	}

}
