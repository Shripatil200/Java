# Java Annotations

## Types of annotation
1. Predefined Annotations
2. Custom Annotations

## Predefined Annotations
**Meta Annotations** 
used on another annotation
- @Target
- @Retention 
- @Documented
- @Inherited
- @Repeatable

**Used on java Code**
- @Deprecated
- @Override
- @SuppressWarning
- @FunctionalInterface
- @SafeVarargs

### Annotations used on java code

1. @Deprecated
- Used on deprecated class, method, field. It shows compile time warning.
- Deprecated means no further improvement is happening on this and use new alternative method or field instead.
- Can be used over METHOD, FIELD, CONSTRUCTOR, PARAMETER, PACKAGE, LOCAL VARIABLE, TYPE (CLASS, INTERFACE, OR ENUM)


2. @Override
- During runtime it will check that the method should be overridden.
- Throws compile time error if method does not match with parent method.
- Can be used over : METHOD

3. @SuppressWarning
- It will tell compiler to ignore any compile time warning.
- use it safely, could led to run time exception if any valid warning id ignored. Example @SuppressWarning("all"). 
- Can be used over : FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL VARIABLE, TYPE(CLASS, INTERFACE, OR ENUM).

*@SuppressWarning("all")* 
can suppress all types of warning, if in our logic we are deviated number with zero it compiler should show warning, but @SuppressWarning annotation will suppress it, and we could have runtime exception. 

- "unchecked" Suppresses warnings related to unchecked operations, typically involving generics and raw types.
- "deprecation"	Suppresses warnings when using a class or method that has been marked as @Deprecated.
- "serial"	Suppresses warnings about a missing serialVersionUID field in a Serializable class.
- "unused"	Suppresses warnings for variables, methods, or parameters that are declared but not used.
- "fallthrough"	Suppresses warnings about missing break statements in switch blocks.
- "preview"	Suppresses warnings related to the use of essential APIs tied to Java preview features (but not the use of the preview language features themselves).

You can find more values on java documentation.

4. @FunctionalInterface

- Restrict interface to have only one abstract method.
- Throws compile time error, if more than one abstract methods found.
- can be used over TYPE


5. @SafeVarargs

- Used to suppress heap pollution warning.
- used over method and constructor which has variable arguments as parameter.
- Method should be either static or final(i.e. methods which can not be overridden).
- In java9, we can also use it on private methods too.

*What is heap pollution ?*
object of one type (ex. String ), stored the reference of another type object (ex. Integer).

```java
public class log{

@SafeVarargs
public static void printLogValues(List<Integer>... logNumberList){ // variable argument
    Object[] objectList = logNumberList;
    List<String> stringValueList = new ArrayList<>();
    stringValueList.add("Hello");
    objectList[0] = stringValueList;   // Heap Pollution 
}
}
```

### Meta-Annotation (used over another annotations)

1. @Target
    - This meta annotation will restrict, where to use the annotation.
    - Eather at method or constructor or field etc.
   
    ex: 
    ```java
     @Target(ElementType.MEETHOD)
     public @interface Override{
   
        }
    ```
    
   ```java 
   @Target(ElementType.CONSTRUCTOR , ElementType.METHOD)
   public @interface SafeVarargs{
   
    }
   ```
   
    *Element Types* 
    TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, ANNOTATION_TYPE, PACKAGE,
    TYPE_PARAMETER (allow you to apply on generic types <T>)
    TYPE_USE (java8 feature allow you to use annotation at all places where Type you can declare like List<@annotation String>).


2. @Retention
    - This meta-annotation tells, how annotation will stored in java.
    - RetentionPolicy.SOURCE : Annotation will be discarded by the compiler itself and it will not be recorded in .class file
    - RetentionPolicy.CLASS : Annotation will be recorded in .class file, but will be ignored by JVM at runtime.
    - RetentionPolicy.RUNTIME : Annotation will be recorded in .class file + available during run time. Usage of reflection can be done.
   
3. @Documented 
    - By default, Annotations are ignored when java Documentation is generated.
    - with this meta- annotation even annotations will come in documentation.
   
4. @Inherited
    - By default, Annotation applied an parent class are not available in child classes.
    - But it is after this meta-annotation.
    - This meta-annotation has no effect, if annotation is used on other than class.

5. @Repeatable 
    - Allow us to use same annotation more than once at same place
    - this was not allowed before java8
   
    ex: 
    ```java
   @Repeatable(Categories.class)
   public @Interface Category{

      string name();
   }
   ```
   ```java
   @Retention(RetentionPolicy.RUNTIME)
   public @Interface Categories{
   
    Category[] value();
   }
   ```
   ```java
   @Category(name = "Bird")
   @Category(name = "LivingThing")
   @Category(name = "Carnivorous")
   public class Eagle{
        public void fly(){
        }
   }
   ```
 

## User Defined Annotation (Custom Annotation)

- We can create our own custom annotation using keyword @Interface

1. Create annotation with empty body
   ```java
   public @interface MyCustomAnnotation{
   }
   ```
   ```java

2. Creating annotation with method (its more like a field).
    - No parameter, no body.
    - Return type is restricted to Primitive, Class, String, enum, annotation, and array of these types.
   
    ex: 
    ```java
   public @Interface MyCustomAnnotation{
        String name();
   }
   ```

    ```java
   @MyCustomAnnotation(name = "testing")
   public class Eagle{
        public void fly(){
        }
   }
   ```
   
3. Creating an annotation with an element with default value.
    - Default value can not be NULL.
   
    ex: 
   ```java
   public @interface MyCustomAnnotation{
        String name() default "Hello";
   }
   ```
   ```java
   @MyCustomAnnotation
   public class Eagle{
        public void fly(){
        }
   }
   ```

**Note:**
Annotations do not execute code by themselves. You must use the Reflection API to find the annotation and perform actions based on its values.
