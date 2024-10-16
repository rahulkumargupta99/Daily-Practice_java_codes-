public class findMaxelement {
    public static void main(String[] args) {
        int arr[] = {4,3,5,2,0,6};
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
             if(max < arr[i]){
                max = arr[i];
             }
        }
        System.out.println("Maximum element is " +max);
    }
}
