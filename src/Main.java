import javax.print.attribute.standard.MediaSize;

public class Main {
  public static void main(String[] args) {
    Restaurant PizzaRestaurant = (Order anyOrder) -> {
      if ( anyOrder.getType() == Order.OrderType.PIZZA ) {
              System.out.println("We are working on your pizza order!");
      }
    };

    Restaurant RamenRestaurant = (Order anyOrder) -> {
      if ( anyOrder.getType() == Order.OrderType.RAMEN ) {
        System.out.println("We are working on your ramen order!");
      }
    };

    Restaurant BurritoRestaurant = (Order anyOrder) -> {
      if ( anyOrder.getType() == Order.OrderType.BURRITO ) {
        System.out.println("We are working on your burrito order!");
      }
    };

    HungryCollegeStudent Lucy = new HungryCollegeStudent();

    Lucy.addRestaurant(PizzaRestaurant);
    Lucy.addRestaurant(RamenRestaurant);
    Lucy.addRestaurant(BurritoRestaurant);

    Lucy.orderTakeout(new Order(Order.OrderType.PIZZA));
  }
}
