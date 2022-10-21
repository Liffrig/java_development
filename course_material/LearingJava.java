package course_material;


public class LearingJava {
        public static void main(String[] args) {
                int[] Numbers = {17,12,1,2,14,4,72,5,6,18,7,8,0};

                quickSort(Numbers, 0, (Numbers.length-1));

                for (int i = 0; i < Numbers.length; i++) {
                        System.out.println(Numbers[i]);
                }


                
        }

        static int partition(int[] array, int begin, int end) {
                int pivot = end;
            
                int counter = begin;
                for (int i = begin; i < end; i++) {
                    if (array[i] < array[pivot]) {
                        int temp = array[counter];
                        array[counter] = array[i];
                        array[i] = temp;
                        counter++;
                    }
                }
                int temp = array[pivot];
                array[pivot] = array[counter];
                array[counter] = temp;
            
                return counter;
            }
            
        public static void quickSort(int[] array, int begin, int end) {
                if (end <= begin) return;
                int pivot = partition(array, begin, end);
                quickSort(array, begin, pivot-1);
                quickSort(array, pivot+1, end);
            }

}