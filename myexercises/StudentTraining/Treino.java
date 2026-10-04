public class Treino {
    Student student;
    TrainingItem[] trainingItem;
    int quantity;

    Treino(Student student)
    {
        this.student = student;
        trainingItem = new TrainingItem[3];
    }

    String getStudent()
    {
        return this.student.getName();
    }

    void adicionar(Exercise exercise, int minutos)
    {
        if(quantity == trainingItem.length)
        {
            System.out.println("Treino Cheio!");
            return;
        }
        trainingItem[quantity] = new TrainingItem(exercise, minutos);
        quantity++;
    }

    int totalCalorias()
    {
        int totalCalorias = 0;
        for(int i = 0; i < quantity; i++)
        {
            totalCalorias += trainingItem[i].calories(); 
        }
        return totalCalorias;
    }

    void listar()
    {
        for(int i = 0; i < quantity; i++)
        {
        System.out.printf("%s - %dmin - %d cal\n", trainingItem[i].exercise.getName(), trainingItem[i].minutes, trainingItem[i].calories());
        }
    }
}
