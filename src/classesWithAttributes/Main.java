package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product=new Product(1, "Laptop", "Asus Laptop", 30000, 2, "siyah");
		/*Product product=new Product();
		
		 * product.setName("Laptop"); System.out.println(product.getName());
		 * product.setId(1); product.setDescription("Asus Laptop");
		 * product.setPrice(50000); product.setStockAmount(3);
		 */
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
		

	}

}
