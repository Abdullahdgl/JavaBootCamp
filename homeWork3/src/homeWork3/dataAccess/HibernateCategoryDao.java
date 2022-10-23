package homeWork3.dataAccess;

import homeWork3.entities.Category;

public class HibernateCategoryDao implements CategoryDao {


	public void add(Category category) {
		System.out.println("Hibernate ile veri tabanına eklenmiştir.");
		
	}

}
