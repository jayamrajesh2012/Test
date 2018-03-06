package Scripts;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Concat {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        //Changes done
/*        String s1="PLN/4/1/150";
        String replaceString=s1.replace("/","_");//replaces all occurrences of "is" to "was"  
        System.out.println(replaceString);  
*/        
/*        int aLen = array1.length;
        int bLen = array2.length;
        int[] result = new int[aLen + bLen];

        System.arraycopy(array1, 0, result, 0, aLen);
        System.arraycopy(array2, 0, result, aLen, bLen);
*/
        int length = array1.length + array2.length;

        int[] result = new int[length];
        int pos = 0;
        for (int element : array1) {
            result[pos] = element;
            pos++;
        }

        for (int element : array2) {
            result[pos] = element;
            pos++;
        }

        System.out.println(Arrays.toString(result));
        
        
        int[]a = {1,2,3,4};
        int[]b = {4,16,1,2,3,22};
        int[]c = new int[a.length+b.length];
        int count = 0;
        
        for(int i = 0; i<a.length; i++) { 
           c[i] = a[i];
           count++;
        } 
        for(int j = 0;j<b.length;j++) { 
           c[count++] = b[j];
        } 
        for(int i = 0;i<c.length;i++) System.out.print(c[i]+" ");
        
        String aa[] = { "A", "E", "I" };
        String bb[] = { "O", "U" };
        List list = new ArrayList(Arrays.asList(aa));
        list.addAll(Arrays.asList(bb));
        Object[] cc = list.toArray();
        System.out.println(Arrays.toString(cc));
    }
}