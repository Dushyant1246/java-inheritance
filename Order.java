class Order {
    private int orderId;
    private String orderDate;

    // Constructor to initialize Order attributes
    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to get order status
    public String getOrderStatus() {
        return "Order placed on " + orderDate;
    }

    // Method to display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId + ", Order Date: " + orderDate);
    }
}
/*
Order order = new Order(101, "2025-03-16");
ShippedOrder shippedOrder = new ShippedOrder(102, "2025-03-15", "TRACK12345");
DeliveredOrder deliveredOrder = new DeliveredOrder(103, "2025-03-14", "TRACK67890", "2025-03-17");

System.out.println(order.getOrderStatus());
System.out.println(shippedOrder.getOrderStatus());
System.out.println(deliveredOrder.getOrderStatus());

Order placed on 2025-03-16
Order placed on 2025-03-15 and shipped with Tracking Number: TRACK12345
Order placed on 2025-03-14 and shipped with Tracking Number: TRACK67890 and delivered on 2025-03-17
 */