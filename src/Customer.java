public interface Customer {
    void orderTakeout(Order customerOrder);
    void addRestaurant(Restaurant newFavRestaurant);
    void removeRestaurant(Restaurant oldFavRestaurant);
}
