import java.util.Scanner;
// SubBab 1 Seleksi Kondisi
class ifelse{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		System.out.print("Masukkan nama anda = ");
		String nama = in.nextLine();
		System.out.print("Masukkan umur anda = ");
		int umur = in.nextInt(); in.nextLine();

		System.out.println("\nDATA DIRI ANDA BRUH :)\nNama anda = "+nama);
		System.out.println("Umur anda = "+umur+" Tahun");
		System.out.print("Status anda yaitu ");

		if (umur <=10 ) {
			System.out.println("Anak-anak");
		}else if (umur >10 && umur <=17) {
			System.out.println("Remaja");
		}else if (umur >17 && umur <=30) {
			System.out.println("Dewasa");			
		}else{
			System.out.println("Tyang Sepuh");
		}	
	}
}

// SubBab 2 Seleksi Kondisi
class nestedif{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		System.out.print("Masukkan nama anda = ");
		String nama = in.nextLine();
		System.out.print("Masukkan umur anda = ");
		int umur = in.nextInt(); in.nextLine();

		System.out.println("\nDATA DIRI ANDA BRUH :)\nNama anda = "+nama);
		System.out.println("Umur anda = "+umur+" Tahun");
		System.out.print("Status anda yaitu ");

		if (umur <=10 ) {
			System.out.print("KOK ");
			if (umur % 2 == 0) {
				System.out.println("Anak-anak"); // GENAP
			}else{
				System.out.println("Anak saja"); // GANJIL
			}
		}else if (umur >10 && umur <=17) {
			System.out.println("Remaja");
		}else if (umur >17 && umur <=30) {
			System.out.println("Dewasa");			
		}else{
			System.out.println("Tyang Sepuh");
		}
	}
}

// SubBab 3 Seleksi Kondisi
class switchcase{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		System.out.print("Masukkan nama anda = ");
		String nama = in.nextLine();
		System.out.print("Masukkan umur anda = ");
		int umur = in.nextInt(); in.nextLine();

		System.out.println("\nDATA DIRI ANDA BRUH :)\nNama anda = "+nama);
		System.out.println("Umur anda = "+umur+" Tahun");
		System.out.print("Status anda yaitu ");

		switch (umur) {
			case 10 : 
			System.out.println("Bocah Nuub"); break;
			case 20 :
			System.out.println("Remaja Nuub"); break;
			case 30 :
			System.out.println("Dewasa Nuub"); break;
			case 40 :
			System.out.println("Tuwek Legendz :V"); break;
			default :
			System.out.println("NOT STATUS"); break;
		}
	}
}

// SubBab 4 Seleksi Kondisi
class condass{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		System.out.print("Masukkan nama anda = ");
		String nama = in.nextLine();
		System.out.print("Masukkan umur anda = ");
		int umur = in.nextInt(); in.nextLine();

		System.out.println("\nDATA DIRI ANDA BRUH :)\nNama anda = "+nama);
		System.out.println("Umur anda = "+umur+" Tahun");
		System.out.print("Status anda yaitu ");

		String name;
		name = "Wahyu Septiadi".equals(nama) ? "YaPs nama & umur SUDAH COCOK, silahkan cari jodoh sekarang saja :)" : 
						       "YAhhhhh.. inputan SALAAAHHH, Diduga ANDA LUPA INGATAN :(";
		System.out.println(name);
	}
}
