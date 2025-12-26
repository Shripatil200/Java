# REFLECTION IN JAVA

## What is Reflection?

This is used to examine the classes, methods, fields, interface at runtime and also possible to change the behaviour of
the class too.

**For example**

- What are all methods present in the class.
- What all fields present in class.
- What is return type pf a method.
- What is the modifier of a class.
- What all interfaces class has implemented.
- Change the value of the public and private fields of the class etc...

## How to do Reflection of classes?

To do reflection, we first need to get an object of **Class**.

## What is class Class?

- Instance of the class Class represents classes during runtime.
- JVM create one Class object for each and every class which is loaded during runtime.
- This Class object, has meta-data information about particular class like its method, fields, constructor, etc..

## How to get particular class Class object?

There are three ways:

1. Using forName() method
   We can use forName() method(Static method) of Class class which takes a full class name (Package name + class name ) as a string and returns Class object of that class.
   
   Example:
   Class.forName("com.mysql.cj.Driver");

2. using .class 
    MyClass.class references to Class object of MyClass 
    We use class name followed by .class.
    
    Example:
         Class obj = MyClass.class;

3. using Instance (.getClass())
    We can also get Class object of specific class by calling .getClass() method on its instance.
    In this case we need object of an class.
    
    Example:
        MyClass obj = new MyClass();
        Class<MyClass> classObj = obj.getClass();


