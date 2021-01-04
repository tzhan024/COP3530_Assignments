//PID: 6144880
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
public class Main
{
	public static void main(String[] args)
	{
		new Main();
	}
	public Main()
	{
		final int MAXIMUM = 1500;
		int[] n = new int[MAXIMUM];
		long[] bubbleSortRT = new long[MAXIMUM];
		long[] selectionSortRT = new long[MAXIMUM];
		long[] insertionSortRT = new long[MAXIMUM];
		long[] quickSortRT = new long[MAXIMUM];
		long[] mergeSortRT = new long[MAXIMUM];
		
		String outputFilename = "output.csv";
        PrintWriter output = null;
        //open output stream
        try
        {
            output = new PrintWriter(new FileWriter(outputFilename));
        }
		catch (IOException ex)
        {
            System.exit(1);
        }
		
		for(int i = 0; i < MAXIMUM; i++)
		{
			int[] list = new int[i + 1];
			n[i] = i + 1;
			
			SortingAlgorithms.fillArray(list);
			//System.out.print("unSorted: ");
			//SortingAlgorithms.printArray(list);
			//System.out.println();
			
			long startBubble = System.nanoTime(); // bubbleSort
			SortingAlgorithms.bubbleSort(list);
			long endBubble = System.nanoTime();
			bubbleSortRT[i] = endBubble - startBubble;
			//SortingAlgorithms.printArray(list);
			
			SortingAlgorithms.fillArray(list);
			
			long startInsertion = System.nanoTime(); // insertionSort
			SortingAlgorithms.insertionSort(list);
			long endInsertion = System.nanoTime();
			insertionSortRT[i] = endInsertion - startInsertion;
			
			SortingAlgorithms.fillArray(list);
			
			long startSelection = System.nanoTime(); // selectionSort
			SortingAlgorithms.selectionSort(list);
			long endSelection = System.nanoTime();
			selectionSortRT[i] = endSelection - startSelection;
			
			SortingAlgorithms.fillArray(list);
			
			long startQuick = System.nanoTime(); // quickSort
			SortingAlgorithms.quickSort(list);
			long endQuick = System.nanoTime();
			quickSortRT[i] = endQuick - startQuick;
			
			SortingAlgorithms.fillArray(list);
			
			long startMerge = System.nanoTime(); // mergeSort
			SortingAlgorithms.mergeSort(list);
			long endMerge = System.nanoTime();
			mergeSortRT[i] = endMerge - startMerge;
			
			System.out.println(n[i] + " " + bubbleSortRT[i] + " " + insertionSortRT[i] + " " + selectionSortRT[i] + " " + quickSortRT[i] + " " + mergeSortRT[i]);
			output.println(n[i] + "," + bubbleSortRT[i] + "," + insertionSortRT[i] + "," + selectionSortRT[i] + "," + quickSortRT[i] + "," + mergeSortRT[i]);
		}
		output.close();
		
		/**
		* Illustrates how to create textfile in Java program
		* @author Prof. A. Hernandez
		*/
		
		/**String outputFilename = "output.csv";
        PrintWriter output = null;
        //open output stream
        try
        {
            output = new PrintWriter(new FileWriter(outputFilename));
        }
		catch (IOException ex)
        {
            System.exit(1);
        }

        Random rnd = new Random();
        int n = 100;
        for (int i = 0; i < n; i++)
        {
            output.println(i + "," + rnd.nextInt(10) + "," + rnd.nextInt(100) + "," + rnd.nextInt(1000));
        }
        //close output stream
        output.close();*/
	}
}