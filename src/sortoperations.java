import java.util.*;
import java.util.Arrays; 
 interface sortoperations {
    public abstract void sortm1(int arr[]);
    public void sortm2(int arr[]);
    public void sortm3(int arr[]);
    public void builtIN(int arr[]);

}
class mysort implements sortoperations
{


    @Override
    public void sortm1(int[] arr)
    {
     for(int i=0;i<arr.length-1;i++)
     {
         for(int j=0;j<arr.length-1;j++)
         {
             if(arr[j]>arr[j+1])
             {
                 int temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
             }
         }
     }

    }

    @Override
    public void sortm2(int[] arr) {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

    }

    @Override
    public void sortm3(int[] arr) {
        int flag;
        for(int i=0;i<arr.length-1;i++)
        {
            flag=0;
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                flag=1;
            }
            if(flag==0)
            {
                break;
            }
        }

    }
    
    @Override
    public void builtIN(int[] arr) {
        Arrays.sort(arr); 
        }

}
class test
{

    public static void main(String[] args) {
        int arr[] = {95, 56, 7, 75, 3};
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sorting type 1, 2, 3 or 4");
        int num = sc.nextInt();

        sortoperations sortoperation = new mysort();
        if (num == 1) {
            sortoperation.sortm1(arr);
        } else if (num == 2) {
            sortoperation.sortm2(arr);
        } else if (num == 3) {
            sortoperation.sortm3(arr);
        }  else {
            sortoperation.builtIN(arr);
        }

        System.out.print(arr[0]);
        for (int l = 1; l < arr.length; l++){
            System.out.print(", "+arr[l]);
        }
    }
}
