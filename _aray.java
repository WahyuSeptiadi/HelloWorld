// SubBab 1 array
class kapasitas{
	public static void main(String args[]){
		int []arr = new int[10];
		for (int i=1; i<10; i++){
			arr[i] = 100;
		}
		for (int i=1; i<9; i++) {
			System.out.println(arr[i]);
		}
	}
}

// SubBab 2 array
class dimensi1{
	public static void main(String args[]){
		int []arr = {1,2,3,4,5,6,7,8,9,0}; 
		for (int i=0; i<10; i++){ 
			System.out.print(arr[i]+" ");
		}
		int nilaiMin = arr[0];
		int nilaiMax = arr[0];
		for (int a=0; a<10; a++) {
			if (arr[a] < nilaiMin) {
				nilaiMin = arr[a];
			}
			if (arr[a] > nilaiMax) {
				nilaiMax = arr[a];
			}
		}
		System.out.println("\n====================");
		System.out.println("Nilai Minimumnya = "+nilaiMin);
		System.out.println("Nilai Maximumnya = "+nilaiMax);
	}
}

// SubBab 3 array
class dimensi2{
	public static void main(String args[]){
		int [][]arr = {{10,20,3,4},{15,25,35,45},{5,6,70,80}};

		for (int i=0; i<3; i++) {
			for (int h=0; h<4; h++) {
				System.out.print(arr[i][h]+"\t");
			}System.out.println();
		}

		int nilaiMax = arr[0][0];
  		int nilaiMin = arr[0][0];
  			for (int m = 0; m < arr.length; m++) {
  		   	for (int n = 0; n < arr[m].length; n++) {
  		       	if(arr[m][n] < nilaiMin)
  		           	nilaiMin = arr[m][n];
  		           if(arr[m][n] > nilaiMax)
  		           	nilaiMax = arr[m][n];
  		       }
  		   }
  		System.out.println("==========================");
  		System.out.println("Nilai Minimum = "+nilaiMin);
  		System.out.println("Nilai Maximum = "+nilaiMax);
  	}
}
