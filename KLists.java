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
	//printOG helper function to print original unsorted array or arrays
	public void printOG (double [][] outerArray){
		System.out.print("Outer Array =  [ ");
		for (int i=0;i<outerArray.length; i++){
	      System.out.print("[ ");
	      for (int j=0; j<outerArray[i].length; j++){
	        System.out.print(outerArray[i][j]);
	        System.out.print(", ");

	      }
	      System.out.print(" ]");
	      System.out.print(", ");
		}
		System.out.println(" ]");
	}
	//printFinal helper function to print final sorted array
	public void printFinal(double [] finalKlist){
		System.out.print("Sorted final array =  [ ");
		for(int i=0; i<finalKlist.length; i++){
			System.out.print(finalKlist[i]);
			System.out.print(", ");
		}
		System.out.println(" ]");
		System.out.println();
	}

	public static void main(String[] args){
		//create lists object from KLists class
		KLists lists = new KLists();

		Scanner input=new Scanner(System.in);

		//for this particular case, I did not take user input and I created 4 varibles for the 4 cases explained in the lab instructions
		//variables stored in double 2D arrays of double type
		double [][] outerArray1 = new double[][] {{1.1, 4.4, 5.5}, {1.1, 3.3, 4.4}, {2.2, 6.6}};
		double [][] outerArray2 = new double[][] {};
		double [][] outerArray3 = new double[][] {{}};
		double [][] outerArray4 = new double[][] {{9.7, 17.1}, {15.8}, {12.7, 18.5, 21.27}};

		//print outerArray so user can visualy see the initial unsorted array
		//call printOG helper function
		lists.printOG(outerArray1);
		//create finalKList variable to store array of type double from return array from mergeKLists function
		double [] finalKlist1 = lists.mergeKLists(outerArray1);
		//call printFinal helper funtion
		lists.printFinal(finalKlist1);

		lists.printOG(outerArray2);
		double [] finalKlist2 = lists.mergeKLists(outerArray2);
		lists.printFinal(finalKlist2);

		lists.printOG(outerArray3);
		double [] finalKlist3 = lists.mergeKLists(outerArray3);
		lists.printFinal(finalKlist3);

		lists.printOG(outerArray4);
		double [] finalKlist4 = lists.mergeKLists(outerArray4);
		lists.printFinal(finalKlist4);
	} 
}
