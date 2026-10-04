public class Locacao {
    int max = 5;
    int counter;
    ItemLocacao[] itemlocacao;
    Cliente cliente;
   
    Locacao(Cliente cliente)
    {
        this.cliente = cliente;
        itemlocacao = new ItemLocacao[max];
            }

    void addItem(Equipament equipament, int days)
    {
        if(counter >= max)
        {
            throw new IllegalArgumentException("The quantity of itens have to be <= 5");
        }
        else{
        itemlocacao[counter] = new ItemLocacao(equipament, days);
        counter++;
        System.out.println("Item adicionado!");
        }
    }
    double totalDaily(int days, int loop)
    {
        
        return itemlocacao[loop].equipament.calcularLocacao(days);
    }
    double total()
    {
        double total = 0;

        for(int i = 0; i < counter; i++)
        {
            total += totalDaily(this.itemlocacao[i].days, i);
        }
        return total;
    }
    public void list()
    {
        System.out.println("Client name: " + cliente.name);
        for(int i = 0; i < counter; i++)
        {
        System.out.printf("Id do Produto: %d\nNome do produto: %s\nValor Total da Locacao: %.2f\n", itemlocacao[i].equipament.getId(), itemlocacao[i].equipament.getName(), totalDaily(itemlocacao[i].days, i));
        }
    }
    
}