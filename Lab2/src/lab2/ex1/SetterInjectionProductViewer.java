package lab2.ex1;

public class SetterInjectionProductViewer implements ProductViewer{

	private Product product;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public void showProduct() {
		System.out.println(product);
	}
	
}
