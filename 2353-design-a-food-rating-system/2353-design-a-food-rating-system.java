class FoodRatings {

    Map<String, PriorityQueue<Food>> map = new HashMap<>();
    Map<String, Food> menu = new HashMap<>();

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        for(int i=0; i < foods.length; i++){
            Food food = new Food(foods[i], cuisines[i], ratings[i]);
            map.putIfAbsent(cuisines[i], new PriorityQueue<>((a, b)->
                b.rating==a.rating ? a.name.compareTo(b.name) : b.rating - a.rating));
            PriorityQueue<Food> queue = map.get(cuisines[i]);
            queue.add(food);
            menu.put(foods[i], food);
        }
    }

    public void changeRating(String food, int newRating) {
        Food fo = menu.get(food);
        PriorityQueue<Food> queue = map.get(fo.cuisine);
        queue.remove(fo);
        fo.rating = newRating;
        queue.add(fo);
    }

    public String highestRated(String cuisine) {
        return map.get(cuisine).peek().name;
    }
}

class Food{
    int rating;
    String name, cuisine;
    Food(String name, String cuisine, int rating){
        this.name = name; this.rating = rating; this.cuisine = cuisine;
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */