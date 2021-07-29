package lab4.ex3;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class TxProductService {

	private ProductDao productDao;
	
	@Transactional(readOnly=false,propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
	public void testTx() {
		Product p = productDao.getProduct(1);
		p.setName("myname-@");
		productDao.update(p);
//		raiseException();
	}

	private static void raiseException() {
		throw new RuntimeException();
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

}
