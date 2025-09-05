package service;
import java.util.List;
import  dao.CategoryDao;
import  dao.CategoryDaoImpl;
import  model.Category;
import  service.CategoryService;
public class CategoryServiceImpl implements CategoryService{
	CategoryDao dao = new CategoryDaoImpl();

    @Override public void insert(Category category) { dao.insert(category); }
    @Override public void edit(Category category) { dao.edit(category); }
    @Override public void delete(int id) { dao.delete(id); }
    @Override public Category get(int id) { return dao.get(id); }
    @Override public Category get(String name) { return dao.get(name); }
    @Override public List<Category> getAll() { return dao.getAll(); }
    @Override public List<Category> search(String keyword) { return dao.search(keyword); }
}
