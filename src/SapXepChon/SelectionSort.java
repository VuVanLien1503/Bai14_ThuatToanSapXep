package SapXepChon;

public class SelectionSort {
    static double[] list = {7, 9, 4.5, 6.6, 5.7, -4.5};
    public static void selectionSort(double[]list){
        for (int i = 0; i < list.length; i++) {
            double min =list[i];
            int index=i;
            for (int j = i+1; j < list.length; j++) {
                if (list[j]<min){
                    min=list[j];
                    index=j;
                }
            }
            if (index!=i){
                list[index]=list[i];
                list[i]=min;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("List");
        for (double list :
                list) {
            System.out.print(list);
        }
        System.out.println();
        System.out.println("Sắp Xếp Chọn");
        selectionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i]+ " ");
        }
    }
}
