/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manager;

/**
 * Ntshangase
 * Ntokozo
 * 4123601
 * CSC211 2022 Practical 3
 * QuicksortTester.java
 * @author Ntokozo
 */
public class QuicksortTester 
{
    /**
    * Quicksort algorithm (driver)
    */

    public void quicksort(int[] a)
    {
        quicksort( a, 0, a.length - 1 );
    }

    /**
    * Internal quicksort method that makes recursive calls.
    * Uses median-of-three partitioning and a cut-off.
     */

    public void quicksort(int[] a, int low, int high )
    {
        if(low+CUTOFF>high )
        {
            insertionSort(a);
        }
        else
        {   // Sort low, middle, high
            int middle = (low + high)/2;
            if(a[middle]<a[low])
            {
                swapReferences(a, low, middle);
            }
            if(a[high]<a[low])
            {
                swapReferences(a, low, high);
            }
            if(a[high]<a[middle])
            {
                swapReferences(a, middle, high);
            }

            // Place pivot at position high - 1
            swapReferences(a, middle, high-1);
            int pivot = a[high-1];

            // Begin partitioning
            int i, j;
            for(i=low; j=high-1; i++)
            {
                while(a[++i]<pivot)
                {
                    while(pivot<a[--j])
                    {
                        if(i>=j)
                        {
                            swapReferences(a, i, j);
                            break;
                        }
                    }
                }
            }
            // Restore pivot
            swapReferences(a, i, high-1);

            quicksort(a, low,i-1); // Sort small elements
            quicksort( a, i + 1, high); // Sort large elements
        }
    }
    // insert code here for question 3
    int CUTOFF = 1;
    // insert code here for question 4 a)
    public void insertionSort(int[] a)
    {
        for (int i=0; i<a.length; i++) 
        {
            for (int j=0; j<a.length; j++) 
            {
                if (a[i] < a[j]) 
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    // insert code here for question 4 b)
    public void swapReferences(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    // insert code here for question 5)
    public int[] removeDuplicates(int[] A)
    {
        int[] temp = new int[A.length];
        temp[0] = A[0];
        int m = 1;
        for(int i=1; i<A.length; ++i)
        {
            if(A[i] != A[i-1])
            {
                temp[m] = A[i];
                ++m;
                System.out.println("No. of items left in array: " + A.length);
            }
        }
        return temp;
    }
    // insert code here for question 6)
    public static void main(String[] args)
    {
        int[] array = {3,4,1,3,6};
        
        System.out.println(array.removeDuplicates());
        System.out.println(array.quicksort());
    }
}
