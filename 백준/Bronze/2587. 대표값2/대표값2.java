import java.util.*;


class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[5];
        int sum = 0;
        for(int i=0 ; i<arr.length;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        
        for(int i=1; i<arr.length;i++){
            for(int j=0; j<arr.length-i;j++){
                if(arr[j] > arr[j+1]){
                    int tmp= arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        System.out.println(sum/5);
        System.out.println(arr[2]);
        
        
    }
    
}