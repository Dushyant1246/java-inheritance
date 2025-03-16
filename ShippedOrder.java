class ShippedOrder extends Order {
    private String trackingNumber;

    // Constructor to initialize ShippedOrder attributes along with Order attributes
    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // Overriding getOrderStatus method to include shipping details
    @Override
    public String getOrderStatus() {
        return super.getOrderStatus() + " and shipped with Tracking Number: " + trackingNumber;
    }
}