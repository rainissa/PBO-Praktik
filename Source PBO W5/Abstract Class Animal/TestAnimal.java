public class TestAnimal {
    public static void main(String[] args) {
        Animal[] daftar = {
            new Dog("Nanung", "Indonesia", 4),
            new Chicken("Wilson", "Spanyol", 2),
            new Lion("Simba", "Afrika", 4)
        };
        System.out.println("===== DAFTAR HEWAN =====");
        System.out.println();

        int no = 1;
        for (Animal a : daftar) {
            System.out.println(no + ". " + a.getClass().getSimpleName());
            System.out.println("--------------------");
            System.out.println("Nama  : " + a.getNama());
            System.out.println("Asal  : " + a.getAsal());
            System.out.println("Kaki  : " + a.getJumlahKaki());
            System.out.print("Suara : ");
            a.toShout();
            System.out.print("Makan : ");
            a.toEat();
            System.out.println();
            no++;
        }
    }
}
