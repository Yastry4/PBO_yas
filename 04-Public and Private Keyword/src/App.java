class Player { // default, class dapat diakses (ditulis dan dibaca oleh class lain)
    String nama;
    private int health;

    Player (String nama){
        this.nama = nama;
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Player player1 = new Player("Yastry");

        player1.nama = "Dalsim";
        System.out.println("Nama Player : " + player1.nama);
    }
}
