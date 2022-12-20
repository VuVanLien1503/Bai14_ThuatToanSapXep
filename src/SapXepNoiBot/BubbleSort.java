package SapXepNoiBot;

public class BubbleSort {
   static int[] list=new int[]{9,3,4,6,2,7,9,5,3,8,1};
    public static void bubbleSort(int[]list){
        for (int i = 0; i < list.length; i++) {
            for (int j = list.length-1 ; j >i ; j--) {
                if (list[j]<list[j-1]){
                    int temp =list[j];
                    list[j]=list[j-1];
                    list[j-1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        for (int list :
                list) {
            System.out.print(list+" ");
        }
        bubbleSort(list);
        System.out.println();
        System.out.println("Sắp Xếp Nổi Bọt");
        for (int list :
                list) {
            System.out.print(list+" ");
        }
    }
}
