import java.util.*;

public class KLists{

	public double [] mergeKLists (double [][] outerArray){
		//total lenght of array:
		int k=0;
		for (int i=0;i<outerArray.length; i++){
	      for (int j=0; j<outerArray[i].length; j++){
	        k++;
	      }
		}
		//create final array:
		double [] merged = new double[k];
		//merge inner arrays into final array: Use MergeSort
		for (int i=0;i<outerArray.length; i++){
			
		}
		int i=0, j=0;



		while(i<)


		return ;
	}



	public static void main(String[] args){
		KLists lists = new KLists();

		Scanner input=new Scanner(System.in);

		double [][] outerArray1 = new double[][] {{9.7, 17.1}, {15.8}, {12.7, 18.5, 21.27}};

		System.out.print("Outer Array =  [ ");
		for (int i=0;i<outerArray1.length; i++){
	      System.out.print("[ ");
	      for (int j=0; j<outerArray1[i].length; j++){
	        System.out.print(outerArray1[i][j]);
	        System.out.print(", ");

	      }
	      System.out.print(" ]");
	      System.out.print(", ");
		}
		System.out.println(" ]");


		double finalKlist = lists.mergeKLists(outerArray1);

		System.out.print("Sorted final array =  [ ");
		for(int i=0; i<finalKlist.length; i++){
			System.out.print(finalKlist[i]);
			System.out.print(", ");
		}
		System.out.println(" ]");



	} 
}
