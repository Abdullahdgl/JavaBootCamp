package homeWork3.business;
import homeWork3.core.logging.Logger;
import homeWork3.dataAccess.CategoryDao;
import homeWork3.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] logger7;
	
	public CategoryManager(CategoryDao categoryDao, Logger[] logger7) {
		
		this.categoryDao = categoryDao;
		this.logger7 = logger7;
	}
public void add(Category category) throws


Exception

	{
		if(category.getCategoryName() != category.getCategoryName())
		
		
	{
			throw 
			
			new Exception
			
			("Kategori ismi tekrar edemez.");
	}
		
		categoryDao.add(category);
		for(Logger logger:logger7)
		
		{
			logger.log(category.getCategoryName());
		}
		
	}
	

}
