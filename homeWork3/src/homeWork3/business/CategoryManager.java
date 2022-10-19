package homeWork3.business;

import homeWork3.core.logging.Logger;
import homeWork3.dataAccess.CategoryDao;
import homeWork3.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}
	
	public void add(Category category) throws Exception{
		if(category.getCategoryName() != category.getCategoryName()) {
			throw new Exception("Kategori ismi tekrar edemez.");
		}
		
		categoryDao.add(category);
		for(Logger logger:loggers) {
			logger.log(category.getCategoryName());
		}
		
	}
	

}
