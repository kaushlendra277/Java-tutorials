# Java-tutorials

Comparator Interface powered by Java 8.
  - kk java tutorials youtube - Java8 comparator enhancement
  - follow git repo as per order for better understanding
  
  1. Using lambda expression on Collections.sort 
  https://github.com/kishanjavatrainer/ComparatorInJava8WithLambdaExpresion
 
  2. Using lambda expression on list interface sort method [From java 8]
  https://github.com/kishanjavatrainer/ListSortMethodinJava8WithComparator
  
  3. Comparator<T>.comparing method [From Java 8], this method returns Comparator<T>
  https://github.com/kishanjavatrainer/Java8ComparatorCompareMethodsDemo
  
  4. Comparator<T>.comparingInt [From Java 8], this method returns Comparator<T>
  Comparator<T>.comparingLong [From Java 8], this method returns Comparator<T>
  Comparator<T>.comparingDouble [From Java 8], this method returns Comparator<T>
  https://github.com/kishanjavatrainer/Java8ComparatorcomparingIntMethodDemo
  
  5. Comparator<T>.thenComparing [From Java 8], this method returns Comparator<T>
  https://github.com/kishanjavatrainer/Java8ComparatorThenComparingMethodsDemo

  6. Comparator<T>.naturalOrder [From Java 8], this method returns Comparator<T> 
  Comparator<T>.reverseOrder [From Java 8], this method returns Comparator<T> 
  https://github.com/kishanjavatrainer/NaturalOrderAndReverseOrderComparatorDemo
  
  7. Comparator<T>.nullsFirst [From Java 8], this method returns Comparator<T> 
  Comparator<T>.nullsLast [From Java 8], this method returns Comparator<T> 
  https://github.com/kishanjavatrainer/ComparatorSortingWithNullsDemo
  
  8. Comparator<T>.reversed [From Java 8], this method returns Comparator<T>
  https://github.com/kishanjavatrainer/ComparatorReversalMethodDemo
  
  Conclusion example:
    students
      .sort(
          Comparator
          .comparing(Student::getId, Comparator.nullsLast(Comparator.naturalOrder()))
          .reversed()
          .thenComparing(Student :: getName, Comparator.naturalOrder())
          );
