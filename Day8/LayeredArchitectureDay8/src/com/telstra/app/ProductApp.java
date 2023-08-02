package com.telstra.app;

public class ProductApp {

	public ProductApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter number of times");
		int size = scanner.nextInt();
		
		for(int i=1;i<=size;i++) {
			Product product = new Product();
			
			System.out.println("enter product id : ");
			int id = scanner.nextInt();
			
			System.out.println("enter product name : ");
			int name = scanner.nextInt();
			
			System.out.println("enter product category : ");
			int category= scanner.nextInt();
			
			System.out.println("enter product price : ");
			int price = scanner.nextInt();
			
			Prodcut product = new Product(id , name , category , price);
			productService.addProduct(prodcut);
		}
	
		ArrayList<product> prodcuts = productService.getAllProducts();
		for()
	}
}
