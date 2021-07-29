package lab2.ex1;

public class ConstructorInjectionProductViewer implements ProductViewer {

	private Product product;

	public ConstructorInjectionProductViewer(Product product) {
		this.product = product;
	}

	public void showProduct() {
		System.out.println(product);
	}

}
