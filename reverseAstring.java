public class reverseAstring {
    public static void main(String[] args) {
        String name = "Rahul";
        int leng = name.length();
        String rev = "";
        for(int  i =leng-1; i>=0; i--){
           rev=rev+name.charAt(i);
        }
        System.out.println("String of " +name+ " " + "is" + " "+ rev);
    }
}