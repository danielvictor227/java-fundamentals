public class TrainingItem {
    Exercise exercise;
    int minutes;

    TrainingItem(Exercise exercise, int minutes)
    {
        this.exercise = exercise;
        this.minutes = minutes;
    }

    int calories()
    {
      return exercise.getCaloriesPerMinute() * this.minutes;
    }
}
