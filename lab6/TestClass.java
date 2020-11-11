package lab6_pac;

import java.util.*;

public class TestClass {

    public static void insertion_sort(Vector<Student> array)
    {
        for (int left = 0; left < array.size(); ++left) {
            // Вытаскиваем значение элемента
            Student value = array.get(left);
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = left - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value.compareTo(array.get(i)) < 0) {
                    array.setElementAt(array.get(i),i + 1);
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array.setElementAt(value,i + 1);
        }
    }

    public static void quick_sort(Vector<Student> source, int leftBorder,
                                  int rightBorder, Comparator<Student> comparator) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        Student pivot = source.get((leftMarker + rightMarker) / 2);
        do {
            // Двигаем левый маркер слева направо пока элемент меньше, чем pivot
            while (comparator.compare(source.get(leftMarker), pivot) < 0) {
                leftMarker++;
            }
            // Двигаем правый маркер, пока элемент больше, чем pivot
            while (comparator.compare(source.get(rightMarker),pivot) < 0) {
                rightMarker--;
            }
            // Проверим, не нужно обменять местами элементы, на которые указывают маркеры
            if (leftMarker <= rightMarker) {
                // Левый маркер будет меньше правого только если мы должны выполнить swap
                if (leftMarker < rightMarker) {
                    Collections.swap(source, leftMarker, rightMarker);
                }
                // Сдвигаем маркеры, чтобы получить новые границы
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        // Выполняем рекурсивно для частей
        if (leftMarker < rightBorder) {
            quick_sort(source, leftMarker, rightBorder, comparator);
        }
        if (leftBorder < rightMarker) {
            quick_sort(source, leftBorder, rightMarker, comparator);
        }
    }
    public static Vector<Student> merge_sort(Vector<Student> vector1, Vector<Student> vector2)
    {
        Vector<Student> returnVector = new Vector<Student>();
        returnVector.setSize(vector1.size() + vector2.size());
        int positionA = 0, positionB = 0;

        for (int i = 0; i < returnVector.size(); i++) {
            if (positionA == vector1.size()) {
                returnVector.setElementAt(vector2.get(positionB),i);
                positionB++;
            } else if (positionB == vector2.size()) {
                returnVector.setElementAt(vector1.get(positionA),i);
                positionA++;
            } else if (vector1.get(positionA).compareTo(vector2.get(positionB)) < 0) {
                returnVector.setElementAt(vector1.get(positionA), i);
                positionA++;
            } else {
                returnVector.setElementAt(vector2.get(positionB), i);
                positionB++;
            }
        }
        Collections.sort(returnVector);
        return returnVector;
    }

    public static void main(String[] arg)
    {
        //first
        Vector<Student> arr = new Vector<Student>();
        arr.add(new Student(3, 3));
        arr.add(new Student(6, 1));
        arr.add(new Student(2, 2));

        System.out.println("first sort, early: ");
        for (Student c : arr)
        {
            System.out.println(c.toString());
        }
        insertion_sort(arr);
        System.out.println("first sort, after: ");
        for (Student c : arr)
        {
            System.out.println(c.toString());
        }
        //second


        Vector<Student> arr2 = new Vector<Student>();
        arr2.add(new Student(6, 6));
        arr2.add(new Student(3, 4));
        arr2.add(new Student(8, 1));
        System.out.println("second sort, early: ");
        for (Student c : arr2)
        {
            System.out.println(c.toString());
        }
        quick_sort(arr2, 0, arr.size() - 1, new SortingStudentsByGPA());
        System.out.println("second sort, after: ");
        for (Student c : arr2)
        {
            System.out.println(c.toString());
        }


        //third

        System.out.println("third sort, early:\nFirst vector:");
        for (Student c : arr)
        {
            System.out.println(c.toString());
        }
        System.out.println("Second vector: ");
        for (Student c : arr2)
        {
            System.out.println(c.toString());
        }

        Vector<Student> arr3 = merge_sort(arr, arr2);
        //System.out.println(arr3);
        System.out.println("third sort, after: ");
        for (Student c : arr3)
        {
            System.out.println(c.toString());
        }



    }
}
