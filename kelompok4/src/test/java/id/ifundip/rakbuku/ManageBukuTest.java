package id.ifundip.rakbuku;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ManageBukuTest {

	private ManageBuku manageBuku;

	@BeforeEach
	public void setupAll() {
		manageBuku = new ManageBuku();
		manageBuku.tambahBuku("Uji Perangkat Lunak 2022", "Jihan", "2022");
		manageBuku.tambahBuku("Uji Perangkat Lunak 2021", "Abi", "2021");
		manageBuku.tambahBuku("Uji Perangkat Lunak 2020", "Siti", "2020");
	}
	
	@Test
	@DisplayName("Menambah Buku Berhasil")
	public void menambahBukuBerhasil () {
		manageBuku.tambahBuku("Uji Perangkat Lunak 2022", "Panji", "2022");
		assertFalse(manageBuku.getAllBuku().isEmpty());
		assertEquals(4, manageBuku.getAllBuku().size());
	}
	

	@Test
	@DisplayName("Gagal Menambah Buku karena salah satu atribut Null")
	public void gagalMenambahBuku() {		
		assertThrows(RuntimeException.class, ()-> {
			manageBuku.tambahBuku(null, "Satria", "2022");
		});
	}
	
	@Test
	@DisplayName("Menghapus Buku Berhasil")
	public void menghapusBukuBerhasil () {
		manageBuku.hapusBuku("Uji Perangkat Lunak 2022", "Jihan", "2022");
		assertEquals(2, manageBuku.getAllBuku().size());
	}
	
	@Test
	@DisplayName("Menghapus Buku Gagal")
	public void menghapusBukuGagal() {
		assertThrows(RuntimeException.class, ()->{
			manageBuku.hapusBuku("Uji Perangkat Lunak 2022", "Jihan", "2019");
		});
	}
}
