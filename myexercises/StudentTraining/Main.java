public class Main {
    public static void main(String[] args) {
        
               
        Exercise exercise = new Exercise("Supino", 5);
        Exercise exercise2 = new Exercise("Esteira", 12);
        Exercise exercise3 = new Exercise("Crucifixo", 20);
                       
        Student student = new Student("Claudio");
        Treino treino = new Treino(student);

        treino.adicionar(exercise, 20);
        treino.adicionar(exercise2, 30);
        treino.adicionar(exercise3, 40);
       


        System.out.printf("Name: %s\nCalories: %d/min\n", exercise.getName(),exercise.getCaloriesPerMinute());
        System.out.printf("Name: %s\nCalories: %d/min\n", exercise2.getName(),exercise2.getCaloriesPerMinute());

        
        System.out.printf("%s\n", treino.getStudent());
        System.out.printf("Total Calories: %d\n\n", treino.totalCalorias());
        treino.listar();
    }
}
