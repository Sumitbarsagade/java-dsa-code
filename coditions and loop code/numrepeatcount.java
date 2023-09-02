public class numrepeatcount {
    public static void main(String[] args) {
        int a= 1785793727;
        int count=0;
        for(int i=0; i<a; i++){

            int b=a%10;
            if(b==7){
               count++;
            }
            a= a/10;
        }
        System.out.println(count);


    }
}
