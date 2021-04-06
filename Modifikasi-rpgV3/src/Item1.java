import java.util.ArrayList;

public class Item1 extends Item {
	private String deskripsi;
    private String nama;
    private ArrayList<String> arrAksi = new ArrayList<>();

    public Item1(String nama) {
        super(nama);
        arrAksi.add("Deskripsi Item");
        arrAksi.add("Ambil item");
        arrAksi.add("Hancurkan item");
    }

    public void prosesAksi(int pil) {
        if (pil==1) {
            System.out.println(deskripsi);
        } else  if (pil==2) {
            diambil();
        } else if (pill==3) {
        	hancurkan()
        }
    }

    private void hancurkan(){
        System.out.println("Item telah dihancurkan");
    	objRuangan.hapusItem(this);
        objRuangan = null;
    }
}