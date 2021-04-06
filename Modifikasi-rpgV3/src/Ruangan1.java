import java.util.ArrayList;
import java.util.Scanner;

public class Ruangan1 extends Ruangan {
	private Item  objAqua;
	private ArrayList<Item> arrItem = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);

	public Ruangan1() {
        objPintu = new Pintu();

        objKunci = new Item("Kunci");
        objKunci.setDeskripsi("Sebuah kunci kecil yang sudah agak berkarat");
        objKunci.setObjRuangan(this);

        objRoti  = new Item("Roti");
        objRoti.setDeskripsi("Roti rasa coklat dalam bungkusan plastik");
        objRoti.setObjRuangan(this);

        objAqua = new Item("Air Mineral Aqua");
        objAqua.setDeskripsi("Menyegarkan Badan");
        objAqua.setObjRuangan(this);

        //tambah item ke array
        arrItem.add(objKunci);
        arrItem.add(objRoti);
        arrItem.add(objAqua);
    }
}