/*
 Array:- It is defined as a list of the same elements placed or stored in a contiguous memory location. 
   - can store only one type of data type in a single array 
   -cannot use to store different types of arrays
 */

 //Creating an array :-
 import java.util.Scanner;
 class array_basic{
    public static void main(String args[]){
        int num[]={1,2,3,4,5};
        for(int i=0;i<num.length;i++){ // length of an array can be found by (.length)
            System.out.print(num[i]);
        }
        //Take array elements as an input
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int marks[]=new int[n]; //here marks is an array 
        for(int i=0;i<n;i++){
            System.out.print("Enetr the number:");
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        int [] student= {23,4,5,6,6,6}; // array literal in java 
        for(int i=0;i<student.length;i++){
            System.out.print(student[i]+" ");
        }
        int[] arr=new int[5];  //object array
        arr[1]=45;
        arr[2]=56;
        arr[0]=55;
        arr[3]=44;
        arr[4]=45;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    
   

 }