import java.util.*;

public class HungryCollegeStudent implements Customer {
    ArrayList<Restaurant> BestRestaurants;

    public HungryCollegeStudent() {
        this.BestRestaurants = new ArrayList<Restaurant>();
    }

    @Override
    public void orderTakeout(Order customerOrder) {
        for( Restaurant restaurant : BestRestaurants ) {
            restaurant.processOrder(customerOrder);
        }
    }

    @Override
    public void addRestaurant(Restaurant newFavRestaurant) {
        BestRestaurants.add(newFavRestaurant);
    }

    @Override
    public void removeRestaurant(Restaurant oldFavRestaurant) {
        BestRestaurants.remove(oldFavRestaurant);
    }
}
