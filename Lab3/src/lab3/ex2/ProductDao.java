package lab3.ex2;

import java.util.List;

public interface ProductDao
{
	public Product getProduct(int productId);

	public List<Product> getProducts();
	
	public int insert(Product product);
}
