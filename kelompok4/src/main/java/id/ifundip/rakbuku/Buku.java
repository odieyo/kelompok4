package id.ifundip.rakbuku;

public class Buku {
	private String nama_buku;
	private String nama_penulis;
	private String tahun_terbit;
	
	public Buku(String nama_buku, String nama_penulis, String tahun_terbit) {
		this.setNama_buku(nama_buku);
		this.setNama_penulis(nama_penulis);
		this.setTahun_terbit(tahun_terbit);
	}

	public String getNama_buku() {
		return nama_buku;
	}

	public void setNama_buku(String nama_buku) {
		this.nama_buku = nama_buku;
	}

	public String getNama_penulis() {
		return nama_penulis;
	}

	public void setNama_penulis(String nama_penulis) {
		this.nama_penulis = nama_penulis;
	}

	public String getTahun_terbit() {
		return tahun_terbit;
	}

	public void setTahun_terbit(String tahun_terbit) {
		this.tahun_terbit = tahun_terbit;
	}
	
	public void validateNamaBuku() {
		if(this.nama_buku.isBlank())
			throw new RuntimeException("Nama Buku tidak boleh kosong");
	}
	public void validateNamaPenulis() {
		if(this.nama_penulis.isBlank())
			throw new RuntimeException("Nama Penulis tidak boleh kosong");
	}
	public void validateTahunTerbit() {
		if(this.tahun_terbit.isBlank())
			throw new RuntimeException("Tahun Terbit tidak boleh kosong");
	}
}

