import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.awt.print.PrinterException;

public class PointOfSales extends JFrame {
    private List<Produk> daftarProduk = new ArrayList<>();
    private List<ItemKeranjang> keranjang = new ArrayList<>();
    private JPanel panelProduk;
    private JPanel panelKeranjang;
    private DefaultTableModel modelProduk;
    private JTable tabelProduk;
    private JLabel lblDipilih;
    private JTextField txtQty;
    private JButton btnAdd;

    private DefaultTableModel modelKeranjang;
    private JTable tabelKeranjang;
    private JLabel lblTotal;
    private JLabel lblPoints;
    private JButton btnCheckout;
    private JButton btnCetak;
    private JTextArea txtStruk;

    public PointOfSales() {
        setTitle("POIN Off-Sales - Java Swing");
        setSize(1000, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setJMenuBar(buatMenuBar());
        isiDataProduk();

        panelProduk = new JPanel(new BorderLayout());
        panelProduk.setBorder(BorderFactory.createTitledBorder("Produk"));
        buatPanelProduk();

        panelKeranjang = new JPanel(new BorderLayout());
        panelKeranjang.setBorder(BorderFactory.createTitledBorder("Keranjang"));
        buatPanelKeranjang();

        JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panelProduk, panelKeranjang);
        split.setResizeWeight(0.5);
        add(split, BorderLayout.CENTER);
    }

    private JMenuBar buatMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(new JMenu("File"));
        menuBar.add(new JMenu("Help"));
        return menuBar;
    }

    private void isiDataProduk() {
        daftarProduk.add(new Produk("P001", "Air Mineral 600ml", 3000));
        daftarProduk.add(new Produk("P002", "Kopi Sachet", 5000));
        daftarProduk.add(new Produk("P003", "Roti isi", 8000));
        daftarProduk.add(new Produk("P004", "Snack Keripik", 6000));
        daftarProduk.add(new Produk("P005", "Minuman Botol", 12000));
    }

    private void buatPanelProduk() {
        modelProduk = new DefaultTableModel(new String[]{"ID", "Nama Produk", "Harga (Rp)"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        for (Produk p : daftarProduk) {
            modelProduk.addRow(new Object[]{p.getId(), p.getNama(), p.getHarga()});
        }
        tabelProduk = new JTable(modelProduk);
        tabelProduk.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        tabelProduk.getSelectionModel().addListSelectionListener(e -> {
            if (e.getValueIsAdjusting()) return;
            int baris = tabelProduk.getSelectedRow();
            if (baris >= 0) {
                Produk p = daftarProduk.get(baris);
                lblDipilih.setText("Dipilih: " + p.getId() + " - " + p.getNama() + " (" + formatRupiah(p.getHarga()) + ")");
            }
        });

        lblDipilih = new JLabel("Pilih produk dari tabel di kiri");
        txtQty = new JTextField("1", 4);
        btnAdd = new JButton("Add to Cart");
        btnAdd.addActionListener(e -> tambahKeKeranjang());

        JPanel barisQty = new JPanel(new FlowLayout(FlowLayout.LEFT));
        barisQty.add(new JLabel("Qty:"));
        barisQty.add(txtQty);
        barisQty.add(btnAdd);

        JPanel panelBawah = new JPanel(new BorderLayout());
        panelBawah.add(lblDipilih, BorderLayout.NORTH);
        panelBawah.add(barisQty, BorderLayout.CENTER);

        panelProduk.add(new JScrollPane(tabelProduk), BorderLayout.CENTER);
        panelProduk.add(panelBawah, BorderLayout.SOUTH);
    }

    private void buatPanelKeranjang() {
        modelKeranjang = new DefaultTableModel(
                new String[]{"ID", "Nama Produk", "Qty", "Harga", "Subtotal"}, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tabelKeranjang = new JTable(modelKeranjang);

        lblTotal = new JLabel("Total: Rp0,00");
        lblTotal.setFont(new Font("SansSerif", Font.BOLD, 16));
        lblPoints = new JLabel("Points: 0");

        btnCheckout = new JButton("Checkout");
        btnCetak = new JButton("Cetak");
        btnCheckout.addActionListener(e -> checkout());
        btnCetak.addActionListener(e -> cetakStruk());

        JLabel lblStruk = new JLabel("Struk:");
        lblStruk.setFont(lblStruk.getFont().deriveFont(Font.BOLD));

        txtStruk = new JTextArea(8, 30);
        txtStruk.setEditable(false);
        txtStruk.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
        JScrollPane scrollStruk = new JScrollPane(txtStruk);

        JPanel panelBawah = new JPanel();
        panelBawah.setLayout(new BoxLayout(panelBawah, BoxLayout.Y_AXIS));
        panelBawah.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 10));

        lblTotal.setAlignmentX(Component.LEFT_ALIGNMENT);
        lblPoints.setAlignmentX(Component.LEFT_ALIGNMENT);
        btnCheckout.setAlignmentX(Component.LEFT_ALIGNMENT);
        btnCetak.setAlignmentX(Component.LEFT_ALIGNMENT);
        lblStruk.setAlignmentX(Component.LEFT_ALIGNMENT);
        scrollStruk.setAlignmentX(Component.LEFT_ALIGNMENT);

        panelBawah.add(lblTotal);
        panelBawah.add(Box.createVerticalStrut(8));
        panelBawah.add(lblPoints);
        panelBawah.add(Box.createVerticalStrut(8));
        panelBawah.add(btnCheckout);
        panelBawah.add(btnCetak);
        panelBawah.add(Box.createVerticalStrut(12));
        panelBawah.add(lblStruk);
        panelBawah.add(scrollStruk);

        panelKeranjang.add(new JScrollPane(tabelKeranjang), BorderLayout.CENTER);
        panelKeranjang.add(panelBawah, BorderLayout.SOUTH);
    }

    private void tambahKeKeranjang() {
        int baris = tabelProduk.getSelectedRow();
        if (baris < 0) {
            JOptionPane.showMessageDialog(this,"Pilih produk dulu dari tabel di kiri.","Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int qty;
        try {
            qty = Integer.parseInt(txtQty.getText().trim());
        } catch (NumberFormatException ex) {
            qty = 0;
        }
        if (qty <= 0) {
            JOptionPane.showMessageDialog(this, "Qty harus berupa angka lebih dari 0.", "Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Produk p = daftarProduk.get(baris);
        ItemKeranjang sudahAda = null;
        for (ItemKeranjang item : keranjang) {
            if (item.getProduk().getId().equals(p.getId())) {
                sudahAda = item;
                break;
            }
        }
        if (sudahAda != null) {
            sudahAda.tambahQty(qty);
        } else {
            keranjang.add(new ItemKeranjang(p, qty));
        }
        refreshKeranjang();
    }

    private void refreshKeranjang() {
        modelKeranjang.setRowCount(0);
        int total = 0;

        for (ItemKeranjang item : keranjang) {
            Produk p = item.getProduk();
            modelKeranjang.addRow(new Object[]{
                    p.getId(), p.getNama(), item.getQty(),
                    p.getHarga(), item.getSubtotal()});
            total += item.getSubtotal();
        }

        lblTotal.setText("Total: " + formatRupiah(total));
        lblPoints.setText("Points: " + (total / 1000));
    }    

    private void checkout() {
        if (keranjang.isEmpty()) {
            JOptionPane.showMessageDialog(this,"Keranjang masih kosong.","Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }

        txtStruk.setText(buatTeksStruk());
        txtStruk.setCaretPosition(0);

        keranjang.clear();
        refreshKeranjang();
    }

    private String buatTeksStruk() {
        String garisSama = "=".repeat(40);
        String garisStrip = "-".repeat(40);

        StringBuilder sb = new StringBuilder();
        sb.append("===== POIN OFF-SALES =====\n");
        sb.append("Toko: Demo Toko\n");
        sb.append(garisSama).append("\n");
        sb.append(String.format("%-5s %-17s %3s  %s\n", "ID", "Nama", "Qty", "Subtotal"));
        sb.append(garisStrip).append("\n");

        int total = 0;
        for (ItemKeranjang item : keranjang) {
            Produk p = item.getProduk();
            sb.append(String.format("%-5s %-17s %3d  %s\n", p.getId(), p.getNama(), item.getQty(), formatRupiah(item.getSubtotal())));
            total += item.getSubtotal();
        }

        sb.append(garisStrip).append("\n");
        sb.append(String.format("%-29s%11s\n", "TOTAL:", formatRupiah(total)));
        sb.append("POINTS DIDAPAT: ").append(total / 1000)
        .append(" (1 point per Rp 1000)\n");
        sb.append(garisSama).append("\n");
        sb.append("Terima kasih! Silakan kunjungi kembali.\n");

        return sb.toString();
    }

    private void cetakStruk() {
        if (txtStruk.getText().isBlank()) {
            JOptionPane.showMessageDialog(this,"Belum ada struk. Lakukan Checkout dulu.","Peringatan", JOptionPane.WARNING_MESSAGE);
            return;
        }
        try {
            txtStruk.print();
        } catch (PrinterException ex) {
            JOptionPane.showMessageDialog(this,"Gagal mencetak: " + ex.getMessage(),"Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static String formatRupiah(int angka) {
        Locale indonesia = Locale.forLanguageTag("id-ID");
        return "Rp" + String.format(indonesia, "%,.2f", (double) angka);
    }
}