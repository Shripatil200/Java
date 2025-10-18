# Functional interface:

Functional interface are interface with only one abstract method.
Functional interface can have any number of * static * and * default * methods, as they are not abstract.
Functional interface enables functional programming and lambda expressions.
** @FunctionalInterface ** annotation is used to define functional interface. while it is optional it is recommended to
use annotation.
** @FunctionalInterface ** annotation force interface for not to have more than one abstract method.

This interface can not implement another interface with one or more abstract method (because if it does then by
inheritance it will have parents abstract methods too so it will not be functional interface anymore)

another interfaces can implement functional interface. 

We can use functional interface to run utility methods dynamically.

there are some predefined functional interfaces in java such as

1. Predicate
   '''java
   @FunctionalInterface
   public interface Predicate<T> {

   /**
    * Evaluates this predicate on the given argument.
    *
    * @param t the input argument
    * @return {@code true} if the input argument matches the predicate,
    * otherwise {@code false}
      */
      boolean test(T t);
      }'''

2. Supplier
   '''java
   @FunctionalInterface
   public interface Supplier<T> {

   /**
    * Gets a result.
    *
    * @return a result
      */
      T get();
      }'''

3. Consumer
   '''java
   @FunctionalInterface
   public interface Consumer<T> {

   /**
    * Performs this operation on the given argument.
    *
    * @param t the input argument
      */
      void accept(T t);
      }'''

4. Function
   '''java
   @FunctionalInterface
   public interface Function<T, R> {

   /**
    * Applies this function to the given argument.
    *
    * @param t the function argument
    * @return the function result
      */
      R apply(T t);
      }'''