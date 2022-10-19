package homeWork3.dataAccess;

import homeWork3.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile veritabınına eklendi");
		
	}

}
