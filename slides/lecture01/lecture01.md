## Java As A Second Language
### Lecture 01

---
## What is Advanced Java?

---
## Kotlin

---
## Now serious

---
## About me
- Sergei    
- Software Engineer
- [https://github.com/rybalkinsd](https://github.com/rybalkinsd)

**Люблю зеленые билды**  

^^^
## About me
- Sasha
- S***e Engineer
- alpieex@gmail.com  
- [https://github.com/Al-p-i](https://github.com/Al-p-i)  

**Люблю смотреть, как другие работают**  

---
## Why Java?

---
## Java domain
- Web applications
- Middleware (Kafka/Spark/Flink)
- Android

---
## What we will learn
TODO

---
## Hrefs
Official documentation
https://docs.oracle.com/en/java/javase/14/

---
## План

---
## Оценка
  
---
## Install JDK 14
Follow the instructions
https://sdkman.io/install

### Mac/Linux example:
```shell script
curl -s "https://get.sdkman.io" | bash
```
open new terminal and check if installation is successful
```shell script
sdk version
```
install JDK 14.0.2-adpt
```shell script
sdk install 14.0.2-adpt 
```
---
#Install IntelliJ IDEA Community
https://www.jetbrains.com/ru-ru/idea/download

---
## JShell

```shell script
jshell
```
![JShell](https://i.pinimg.com/originals/49/36/9d/49369d389233522a425f1327d8efecf2.jpg)
https://medium.com/swlh/how-to-use-jshell-to-improve-your-java-skills-170557d1d680

---
## Hello World!
```java
public class Hello{
  public static void main(String[] args){
    System.out.println("Hello, " + args[0] + "!");
  }
}
```
```shell script
javac Hello.java
```
```shell script
java Hello world 
```
---
## Byte code
```shell script
javap -c Hello.class

Compiled from "Hello.java"
public class Hello {
  public Hello();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  public static void main(java.lang.String[]);
    Code:
       0: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
       3: aload_0
       4: iconst_0
       5: aaload
       6: invokedynamic #13,  0             // InvokeDynamic #0:makeConcatWithConstants:(Ljava/lang/String;)Ljava/lang/String;
      11: invokevirtual #17                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      14: return
}
```

---
## Java Facts
- Java is crossplatform - 'Write Once, Run Anywhere' (WORA)
- Java is compiled to Byte Code (not to machine code), which is executed by Java Virtual Machine (JVM)
- automatic memory management (GC)
- Java is object-oriented, class-based
- static strong safe typization
- concurrent

---
## JDK/JRE/JVM
//TODO

---
## Licenses
//TODO

---
## jar/.class
//TODO

---
## Git
//TODO

---
## Gradle
//TODO

---
## Example task
//TODO

---
## Practice 1
//TODO

---
## Practice 2
//TODO 

---