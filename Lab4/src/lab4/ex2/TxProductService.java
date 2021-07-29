package lab4.ex2;


public class TxProductService {

	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	
	public void testTx() {
		Product p = productDao.getProduct(1);
		p.setName("myname-tx");
		productDao.update(p);
//		raiseException();
	}
	
	public void raiseException() {
		throw new RuntimeException();
	}
}
