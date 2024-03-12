import java.util.*;
public class ReverseString {
    public static void main(String args[])
    {
        int first=0;
        int last,mid;
        String strtoreverse;
        char temp;
        String ans=" ";
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the string to reverse: ");
        strtoreverse=sc.nextLine();
        
        if(strtoreverse.length()>1)
        {
            char[] strtoarray = strtoreverse.toCharArray();
            last = strtoarray.length-1;
            mid = (first+last)/2;
            while(first<=mid)
            {
                temp=strtoarray[first];
                strtoarray[first] = strtoarray[last-first];
                strtoarray[last-first]=temp;
                first++;
            }
            ans = new String(strtoarray);
        }
        else
        {
            ans = strtoreverse;
        }
        System.out.println(ans);

        


    }
}
