package codeWithNLayeredApp.business;

import java.util.ArrayList;
import java.util.List;
import codeWithNLayeredApp.core.logging.ILogger;

import codeWithNLayeredApp.dataAccess.ICategoryDao;
import codeWithNLayeredApp.entities.Category;

public class CategoryManager {

	private ICategoryDao categoryDao;
	private ILogger[] loggers;

	public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}


	List<String> categories = new ArrayList<>();

	public void add(Category category) throws Exception{
        if (categories.contains(category.getCategoryName())){
            throw new Exception("This category already exist: " + category.getCategoryName());
        }
        else {
            categories.add(category.getCategoryName());
            categoryDao.add(category);
        }
        
        for (ILogger logger : loggers) {
			logger.log(category.getCategoryName());
		}
	}

}
