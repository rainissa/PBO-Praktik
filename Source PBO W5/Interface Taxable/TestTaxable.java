public class TestTaxable {
    public static void main(String[] args) {
        Goods[] daftar = {
            new Food("Roti", 15.000, 250),
            new Toy("Lego", 45.000, 10),
            new Book("Malice", 99.000, "Keigo Higashino")
        };
        System.out.println("===== DAFTAR BARANG =====");
        System.out.println();

        int no = 1;
        for (Goods g : daftar) {
            System.out.println(no + ". " + g.getClass().getSimpleName());
            System.out.println("--------------------");
            System.out.println("Deskripsi : " + g.getDescription());
            System.out.println("Harga     : Rp" + g.getPrice());

            if (g instanceof Food) {
                Food f = (Food) g;
                System.out.println("Kalori    : " + f.getCalories());
            } else if (g instanceof Toy) {
                Toy t = (Toy) g;
                System.out.println("Usia min. : " + t.getMinimumAge());
            } else if (g instanceof Book) {
                Book b = (Book) g;
                System.out.println("Penulis   : " + b.getAuthor());
            }

            if (g instanceof Taxable) {
                Taxable tx = (Taxable) g;
                System.out.println("Pajak     : Rp" + tx.calculateTax());
            } else {
                System.out.println("Pajak     : -");
            }
            System.out.println();
            no++;
        }
    }
}