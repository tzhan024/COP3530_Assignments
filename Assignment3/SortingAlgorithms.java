//PID: 6144880
import java.util.Random;
public class SortingAlgorithms
{
	public static void bubbleSort(int[] list)
	{
		for(int i = 0; i < list.length - 1; i++)
		{
			for(int j = 0; j < list.length - i - 1; j++)
			{
				if(list[j] > list[j + 1])
				{
					int temp = list[j];
					list[j] = list[j + 1];
					list[j + 1] = temp;
				}
			}
		}
	}
	public static void insertionSort(int[] list)
	{
		for(int i = 1; i < list.length; i++)
		{
			int temp = list[i];
			int j = i - 1;
			while(j >= 0 && temp < list[j])
			{
				list[j + 1] = list[j];
				j--;
			}
			list[j + 1] = temp;
		}
	}
	public static void selectionSort(int[] list)
	{
		for (int i = 0; i < list.length - 1; i++)
		{
			int minIndex = i;
			for (int j = i + 1; j < list.length; j++)
				if (list[j] < list[minIndex])
					minIndex = j;
			int temp = list[minIndex];
			list[minIndex] = list[i];
			list[i] = temp;
		}
	}
	/**
     * Recursive quicksort algorithm
     * @author Prof. A. Hernandez
     */
    public static void quickSort(int[] list)
    {
        quicksort(list, 0, list.length - 1);
    }
    private static void quicksort(int[] list, int begin, int end)
    {
        int temp;
        int pivot = findPivotLocation(begin, end);

        // swap list[pivot] and list[end]
        temp = list[pivot];
        list[pivot] = list[end];
        list[end] = temp;

        pivot = end;

        int i = begin,
                j = end - 1;

        boolean iterationCompleted = false;
        while (!iterationCompleted)
        {
            while (list[i] < list[pivot])
                i++;
            while ((j >= 0) && (list[pivot] < list[j]))
                j--;

            if (i < j)
            {
                //swap list[i] and list[j]
                temp = list[i];
                list[i] = list[j];
                list[j] = temp;

                i++;
                j--;
            } else
                iterationCompleted = true;
        }

        //swap list[i] and list[pivot]
        temp = list[i];
        list[i] = list[pivot];
        list[pivot] = temp;

        if (begin < i - 1) quicksort(list, begin, i - 1);
        if (i + 1 < end) quicksort(list, i + 1, end);
    }
    /*
     * Computes the pivot
     */
    private static int findPivotLocation(int b, int e)
    {
        return (b + e) / 2;
    }
	private static void listMerge(int[] list1, int[] list2, int[] list3)
	{
		int bPtr = 0;
		int ePtr = 0;
		int i = 0;
		while(bPtr != list1.length && ePtr != list2.length)
		{
			if(list1[bPtr] < list2[ePtr])
			{
				list3[i] = list1[bPtr];
				bPtr++;
			}
			else
			{
				list3[i] = list2[ePtr];
				ePtr++;
			}
			i++;
		}
		if(bPtr == list1.length)
		{
			while(ePtr != list2.length)
			{
				list3[i] = list2[ePtr];
				ePtr++;
				i++;
			}
		}
		if(ePtr == list2.length)
		{
			while(bPtr != list1.length)
			{
				list3[i] = list1[bPtr];
				bPtr++;
				i++;
			}
		}
	}
	private static void merge(int[] list, int b, int m, int e)
	{
		int[] temp = new int[e - b + 1];
		for(int i = 0; i < temp.length; i++)
		{
			temp[i] = list[b + i];
		}
		int bPtr = b;
		int ePtr = m + 1;
		int i = b;
		while(bPtr != (m + 1) && ePtr != (e + 1))
		{
			if(temp[bPtr - b] < temp[ePtr - b])
			{
				list[i] = temp[bPtr - b];
				bPtr++;
			}
			else
			{
				list[i] = temp[ePtr - b];
				ePtr++;
			}
			i++;
		}
		if(ePtr == e + 1)
		{
			while(bPtr != (m + 1))
			{
				list[i] = temp[bPtr - b];
				bPtr++;
				i++;
			}
		}
	}
	public static void mergeSort(int[] list)
	{
		mergeSort(list, 0, list.length - 1);
	}
	private static void mergeSort(int[] list, int begin, int end)
	{
		if(begin < end)
		{
			int mid = (begin + end) / 2;
			mergeSort(list, begin, mid);
			mergeSort(list, mid + 1, end);
			merge(list, begin, mid, end);
		}
	}
	public static void fillArray(int[] list)
	{
		Random rand = new Random();
		for(int i = 0; i < list.length; i++)
		{
			list[i] = rand.nextInt(1000);
		}
	}
	public static void printArray(int[] list)
	{
		for (int i = 0; i < list.length; i++)
		{
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}
}