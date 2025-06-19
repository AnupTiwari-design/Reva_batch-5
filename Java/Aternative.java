package Java;

public class Aternative {
    
    int max_even_odd(int arr[])
    {
        int count =1;
        int max_count=1;
        for(int i =1;i<arr.length;i++){
            if((arr[i]%2==0&&arr[i-1]%2!=0)||
            (arr[i]%2!=0&&arr[i-1]%2==0)){
                count++;

            }
            else{
                count=1;
            }
            max_count=Math.max(max_count, count);
        }
        return max_count;
    }
}
