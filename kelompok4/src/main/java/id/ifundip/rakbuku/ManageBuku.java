package id.ifundip.rakbuku;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ManageBuku {

	Map<String, Buku> bukulist = new ConcurrentHashMap<String, Buku>();
	
	public void tambahBuku(String nama_buku, String nama_penulis, String tahun_terbit) {
		Buku buku = new Buku(nama_buku, nama_penulis, tahun_terbit);
		validateBuku(buku);
		bukulist.put(generate(buku), buku);
	}

	public void hapusBuku(String nama_buku, String nama_penulis, String tahun_terbit) {
		Buku buku = new Buku(nama_buku, nama_penulis, tahun_terbit);
		if(bukulist.containsKey(generate(buku))) {
			bukulist.remove(generate(buku));
	}else {
		throw new RuntimeException("Buku tidak ada dalam daftar");
		}
	}
	private String generate(Buku buku) {
		return String.format("%s-%s-%s", buku.getNama_buku(), buku.getNama_penulis(), buku.getTahun_terbit());
	}
	
	public Collection<Buku> getAllBuku(){
		return bukulist.values();
	}
	
	public void validateBuku(Buku buku) {
		buku.validateNamaBuku();
		buku.validateNamaPenulis();
		buku.validateTahunTerbit();
	}
	
	
}
