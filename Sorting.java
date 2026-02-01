public class Sorting {
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    // Bubble Sort
    // public static void main(String[] args) {
    //     int arr[]={7,3,6,1,5};
    //     for(int i=0;i<arr.length-1;i++){
    //         for(int j=0;j<arr.length-i-1;j++){
    //             if(arr[j]>arr[j+1]) {
    //                 int temp=arr[j];
    //                 arr[j]=arr[j+1];
    //                 arr[j+1]=temp;
    //             }
    //         }
    //     }
    //     printArray(arr);
    // }

    // Selection Sort
    // public static void main(String[] args) {
    //     int arr[]={7,3,5,1,6};
    //     for(int i=0;i<arr.length-1;i++){
    //         int smallest=i;
    //         for(int j=i;j<arr.length;j++){
    //             if (arr[j]<arr[smallest]) {
    //                 int temp=arr[smallest];
    //                 arr[smallest]=arr[j];
    //                 arr[j]=temp;
    //             }
    //         }
    //     }
    //     printArray(arr);
    // }

    // Insertion Sort
    // public static void main(String[] args) {
    //     int arr[]={7,3,6,1,4};
    //     for(int i=1;i<arr.length;i++){
    //         int temp=arr[i];
    //         int j=i-1;
    //         while (j>=0 && arr[j]>temp) {
    //             arr[j+1]=arr[j];
    //             j--;
    //         }
    //         arr[j+1]=temp;
    //     }
    //     printArray(arr);
    // }
}