import java.util.Scanner;
// SubBab 1 Method
class tiperetval{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		System.out.print("Masukkan nama anda   = ");
		String nama = in.nextLine();
		System.out.print("Masukkan umur anda   = ");
		String umur = in.nextLine();
		System.out.print("Masukkan alamat anda = ");
		String almt = in.nextLine();

		System.out.println(show(nama, umur, almt)); // return value bisa dimasukkan di DALAM KURUNG CETAK
	}
	public static String show(String nama, String umur, String alamat){
		String cetak ="\nData diri Anda :)" 
					 +"\nNama   = "+ nama 
					 +"\nUmur   = "+ umur 
					 +"\nAlamat = "+ alamat;
		return cetak;
	}
}

// SubBab 1 Method
class tipevoid{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		System.out.print("Masukkan nama anda   = ");
		String nama = in.nextLine();
		System.out.print("Masukkan umur anda   = ");
		String umur = in.nextLine();
		System.out.print("Masukkan alamat anda = ");
		String almt = in.nextLine();

		show(nama, umur, almt);
	}
	private static void show(String nama, String umur, String alamat){
		System.out.println("\nNamaku   = "+nama+
						   "\nUmurku   = "+umur+
						   "\nAlamatku = "+alamat);
	}
}
