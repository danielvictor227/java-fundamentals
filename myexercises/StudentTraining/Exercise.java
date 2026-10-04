public class Exercise {
    String name;
    int caloriesPerMinute;

    Exercise(String name, int caloriesPerMinute)
    {
        this.name = name;
        this.caloriesPerMinute = caloriesPerMinute;
    }

    String getName(){
        return this.name;
    }

    int getCaloriesPerMinute(){
        return this.caloriesPerMinute;
    }
}
