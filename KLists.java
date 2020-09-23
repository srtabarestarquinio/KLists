import java.util.*;

public class KLists{

	public double [] mergeKLists (double [][] outerArray){
		
		//for loop to find total lenght of array (k):
		int k=0;
		for (int i=0;i<outerArray.length; i++){
			k+=outerArray[i].length;
		}
		//total lenght of array = k

		//create final sorted merged array of size k
		double [] merged = new double[k];
		//if size of final array, k, is only 1, the final array if the same as the outer array
		if(merged.length==1){
			merged[0]=outerArray[0][0];
		}
		//if size of final array, k, is bigger then 1, then for loop to sort both dimensions of outerarray to create final sorted merged array
		else if(merged.length>1){
			//variables 
			int counter=0, i=0, idx=0;
			for (;i<outerArray.length; i++){
				for (int j=0;j<outerArray[i].length; j++){
					merged[counter]=outerArray[i][j];
					counter++;
				}
			}
			for(; idx<merged.length; idx++){
				double temp = merged[idx];
				int holder = idx - 1;
				while(holder>=0 && merged[holder]>temp){
					merged[holder+1]=merged[holder];
					--holder;
				}
				merged[holder+1]=temp;
			}
			return merged;
		}
		return merged;
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


		double [] finalKlist = lists.mergeKLists(outerArray1);

		System.out.print("Sorted final array =  [ ");
		for(int i=0; i<finalKlist.length; i++){
			System.out.print(finalKlist[i]);
			System.out.print(", ");
		}
		System.out.println(" ]");

	} 
}
