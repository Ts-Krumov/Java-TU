public class Main {
    public static void main(String[] args) {

        int[] array = new int[]{33,-8,32,12,88};
        int min = array[0];
        for(int element:array){

            if(element < min){
                min = element;

            }
        }
        System.out.println(min);;
    }
}