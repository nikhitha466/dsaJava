import java.util.ArrayList;
import java.util.Arrays;
//
//Given an unsorted array arr containing both positive and negative numbers. Your task is to rearrange the array and convert it into an array of alternate positive and negative numbers without changing the relative order.
//
//Note:
//        - Resulting array should start with a positive integer (0 will also be considered as a positive integer).
//        - If any of the positive or negative integers are exhausted, then add the remaining integers in the answer as it is by maintaining the relative order.
//- The array may or may not have equal number of positive and negative integers.
//
//Examples:
//
//Input: arr[] = [9, 4, -2, -1, 5, 0, -5, -3, 2]
//Output: 9 -2 4 -1 5 -5 0 -3 2
public class Rearrange_Pos_Neg_5 {
    public static int[] rearrange(int[] arr) {
        ArrayList<Integer> p = new ArrayList<>();
        ArrayList<Integer> n = new ArrayList<>();
        int g=0,l=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
                p.add(arr[i]);
            else
                n.add(arr[i]);

        }
        int[] t = new int[arr.length];
        int comm=0;
        int high=0;
        if(n.size()>p.size())
        {
            comm = n.size();
            high=n.size();
        }
        if(p.size()>n.size())
        {
            comm = p.size();
            high=p.size();
        }
        int r=0;
        for(int i=0;i<2*comm;i++)
        {

            if(i%2==0 && l<n.size())
            {
                t[r++]=n.get(l++);
            }
            if(i%2!=0 && g<p.size())
            {
                t[r++]=p.get(g++);
            }

        }
        if(p.size()>n.size()){
            for (int i = r; i < p.size();i++) {
                t[r++]=p.get(i);
            }
        }
        if(p.size()<n.size()){
            for (int i = r; i < n.size();i++) {
                t[r++]=n.get(i);
            }
        }

        return t;
    }
    public static void main(String[] args)
    {
        int[] a=  {4, -9, -2, 6, -8};
        System.out.println(Arrays.toString(rearrange(a)));
        int[] a1=  {-2 ,-3, -3 ,-6, -2};
        System.out.println(Arrays.toString(rearrange(a1)));
        int[] a2=  {2,3 ,3 ,6 ,-8};
        System.out.println(Arrays.toString(rearrange(a2)));
    }
}

