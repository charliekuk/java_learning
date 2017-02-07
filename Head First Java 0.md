# Head First Java 0

[TOC]

## Java的语言结构

Java是以类（class）为主要组件的。Java在编译的时候也是执行的类文件。

类存于源代码中，在类中有方法；方法是执行类中定义的一种功能。类中的各种各样的功能都是由方法实现的。方法中用Java的各种语句来实现该功能。

每一个程序都有一个main方法，Java虚拟机在编译执行代码时就从main方法开始。但是不一定每个类都有main方法。

一段典型的Java代码（一个类）

```java
public class MyFirstApp{
  public static void main(String[],args){
    System.out.println("Hello World!");
  }
}
```

类中的main方法前面是固定的按照psvm的形式表述的。方法中的语句表示在命令行中打印出“Hello World！”

## Java的一些数据类型和语句

*注意：Java中的整型和布尔型不相容。因此不能定义一个整型放在条件判断中。你必须有一个判断式，或者定义一个布尔型*

**print&println**:前者打印出来的内容在同一行；后者会在两个println中自动换行。



*声明字符串数组*：

```java
String[] animals = {"Dog","Cat","Tiger","Lion"};
```

*得到数组的长度*：

```java
int x = animals.length;
```

*强制数据类型转换*：

```java
int x = (int)24.6;
```

*声明字符串以及字符串的连接*：

```java
String s = animals[0];
s = s+""+"is an animal";
```

