package ArrayList;

public class BookStoreRunner {
	public static void main(String[] args) {

		OrderProcessor orderProcessor = new OrderProcessor();

		orderProcessor.printOrderDetails(orderProcessor.getOrderFromTheCustomer());

	}
}
