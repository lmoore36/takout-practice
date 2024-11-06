public class Order implements IOrder {
    public enum OrderType { PIZZA, RAMEN, BURRITO }
    private OrderType type;

    public Order ( OrderType order ) {
        this.type = order;
    }

    public Order.OrderType getType() {
        return this.type;
    }

    public String getDescription() {
        switch(this.type) {
            case PIZZA -> { return "Pizza"; }
            case RAMEN -> { return "Ramen"; }
            case BURRITO -> { return "Burrito"; }
        }
        return "";
    }
}
