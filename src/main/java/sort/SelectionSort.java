package sort;


public class SelectionSort {

    private static void selectSort(Object[] a) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            int min = i; // 假设最小值
            for (int j = i + 1; j < len; j++) {
                if (((Comparable) a[j]).compareTo(a[min]) < 0) {
                    min = j;
                }
            }
            swap(a, min, i);
        }
    }

    private static void swap(Object[] a, int i, int j) {
        Object tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String[] args) {
        Student a[] = {new Student(), new Student()};
        selectSort(a);
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.print(a[i] + "\n");
            } else {
                System.out.print(a[i] + ", ");
            }
        }
    }
}

class Student implements Comparable {

    private int age;

    public int compareTo(Object o) {
        Student student = (Student) o;
        return this.age - student.age;
    }
}
