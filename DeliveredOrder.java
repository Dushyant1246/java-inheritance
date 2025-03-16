class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    // Constructor to initialize DeliveredOrder attributes
    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Overriding getOrderStatus method to include delivery details
    @Override
    public String getOrderStatus() {
        return super.getOrderStatus() + " and delivered on " + deliveryDate;
    }
}