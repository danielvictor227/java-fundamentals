public class width {
    public static void main(String[] args) {
        int id1 = 1;
        int id2 = 23;
        int id3 = 457;
        int id4 = 7890;

        System.out.printf("%04d\n", id1); // se for %4 - mesma coisa de dar um padding de 4, ex:   01. se for %-4d, estou dando uma padding apra ESQUERDA, lado CONTRARIO
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);
    }
}
