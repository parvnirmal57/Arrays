
// Apporch: First of all we will assume maximum value element at 0th index position 
// to check greater value we have to traverse whole array by applying condtion 
// we will do comparsion of element then we will print element which has max value in array.
public class SearchMax {
    public static void main(String[] args) {
        int[] a={4,3,5,2,1,6};
        int max=a[0];
        for (int i=1; i<a.length;i++)
        {
            if(max<a[i])
            {
                max=a[i];
            }
        }
        System.out.println("Max element is "+max);
    }
}
