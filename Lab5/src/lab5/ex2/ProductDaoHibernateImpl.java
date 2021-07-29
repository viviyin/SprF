package lab5.ex2;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Expression;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

public class ProductDaoHibernateImpl extends HibernateDaoSupport implements
		ProductDao {

    public Product getProduct(int id)
    {
    	return (Product) getHibernateTemplate().execute(
        		new HibernateCallback() {
        			public Object doInHibernate(Session session) throws HibernateException {
        				return session.createCriteria(Product.class).add(Expression.eq("id", id)).uniqueResult();
        			}
				});
    }

	public List<Product> getProducts() {
		return (List<Product>) getHibernateTemplate().find("from Product p");
	}

	@Transactional
	public void save(Product product) {
		getHibernateTemplate().saveOrUpdate(product);
	}
	

}