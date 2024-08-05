import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner tr=new Scanner(System.in);
        int num=tr.nextInt();
        int arr[]=new int[3];
        int i=0,cnt=0;
        while(num!=0)
        {
            arr[i]=num%10;
            num/=10;
            i++;
            cnt++;
        }
        if((cnt==3)&&(arr[1]%3==0))
        {
            System.out.println("Trendy Number");
        }
        else
        {
            System.out.println("Not a Trendy Number");
        }
    }
}
