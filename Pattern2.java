package ajp;

class Pattern2 {
	public static void main(String args[]) {
		int n = 3;

		//Loop to iterate over each row
		for(int i=1;i<=n;i++){
			//Loop to iterate over each column
			for(int j=1;j<=i;j++){
				System.out.print(j+ " "); 
			}

			//Loop to iterate over each column in reverse order
			for(int j=i-1;j>=1;j--){
				System.out.print(j+ " "); 
			}
			System.out.println();
		}
	}
}
