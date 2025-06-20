OOPs – Java – Practice Scenarios with detailed Explanations

Note: Add main method wherever necessary. 

Each and every scenario presented here are for getting good understanding on OOP(Object Oriented Programming) through Java.
Scenario #1:
Expected Understanding: Access Modifiers, Single Inheritance, getter methods, Constructor Overloading
1) Create a Class named “Trainer”.
– Have default instance variables String dept, institute
– Assign values – “Java”, “Mahendra” to them
– Have private instance variable int salary
– Assign 10000 as value for salary.
– Create getter method for salary.
– Have instance method training() with void as return data type
– Add a print statement inside training() method
- Add main method [public static void main(String[] args)] 
– Have instance named as ‘trainerGopal’ and pass “CSE”, “Mahendra” as arguments to it.
– Handle above line with matching Constructor.

2) Create a sub class “SQLTrainer” under “Trainer”.
– Have main method in it.
– Create instance ram for this class
– Handle with proper super class constructor
– Access parent class instance variables
– Call parent class instance method training()
– Access salary using getter method in parent class

Scenario #2:
Expected Understanding: Interface, Class, static variables, dynamic binding
1) Create an interface called ‘Actor’
– Have variables boolean makeUpRequired
– Assign ‘true’ value for ‘makeUpRequired’
– Have variable String address.
– Assign value as “Chennai” to address.
– Have void methods act(), dance(), sing()

2) Create class named as ActorSivakumar with main method
– implement interface ‘Actor’ to this class.
– Give your own definitions for methods from interface
– Have static variable String address.
– Assign value to address as “Coimbatore”.
– Have instance method ‘speaking()’ with void return data type.
– Create instance for ActorSivakumar as below
ActorSivakumar as = new ActorSivakumar(65, “Audi Car”)
– Handle with proper Constructor
– Access all the methods from ActorSivakumar class
– Access variable address and print the value
– Create another instance of interface ‘Actor’ using dynamic binding approach
Actor ac = new Sivakumar();
– Handle with proper Constructor
– Access methods in ActorSivakumar class.
– Access variable address using ‘ac’ intance and print the value
– Observe and note down the difference between two instances

Scenario #3:
Expected Understanding: Abstraction, Inheritance, return keyword, Method Arguments, Constructor
1) Create an abstract class named ‘SmartPhone’
– Add the below abstract methods
– int call(int seconds)
– void sendMessage()
– void receiveCall()
– Add non abstract method void browse()
– print ‘SmartPhone browsing’ inside browse() method definition
– Have constructor as below.
public SmartPhone()
{
System.out.println(“Smartphone under development”);
}
2) Create class called ‘FactoryDemo’ as abstract subclass of SmartPhone
– Add the below abstract methods
– void verifyFingerPrint()
– void providePattern()
– Add non abstract method void browse()
– print ‘Factory Demo browsing’ inside browse() method definition
– Add variable boolean isOriginalPiece and assign ‘false’ as value.
– Add static variable int price and set value as 0.
3) Create class called ‘Samsung’ with main method as sub class of FactoryDemo.
– Add unimplemented methods
– Add static variable int price and set value as 5000.
– Create instance for Samsung class called sam
– Access browse() method using sam instance.
– Access price variable using sam instance.
– Observe which method is called and note down.

Scenario #4:
Expected Understanding: Abstraction, Inheritance, Dynamic Binding, Polymorphism (Overriding), Constructor Overloading
1) Create an abstract class called ‘India’
– Have below abstract methods
– void speakLanguage()
– void eat()
– void dress()
– Have static variable String capital = “New Delhi”
– Have below Constructor
public India(String primeMinister)
{
System.out.println(“our Prime Minister is” + primeMinister);
}
2) Create an abstract class called ‘SouthIndia’
– Make this class as sub class of ‘India’
– Add below non abstract methods
– void cultivate()
– Print ‘Rice and Wheat cultivation’ inside this method
– void livingStyle()
– Print ‘Average development’ inside this method
3) Create a class called ‘TamilNadu’ with main method as sub class of ‘South India’.
– Add unimplemented methods
– Provide your own definitions wherever necessary.
– Have static variable String capital = “Chennai”
– Add below non abstract methods
– void cultivate()
– Print ‘Rice and Sugar cane cultivation’ inside this method
– void livingStyle()
– Print ‘Above Average development’ inside this method
– Using class name “India” – access variable ‘capital’ and print the value
– Using class name “TamilNadu” – access variable ‘capital’ and print the value.
– Create instance for “SouthIndia” as below
SouthIndia si = new TamilNadu()
– Observe which methods and variables can be accessed using ‘si’ and note down.

Scenario #5:
Expected Understanding: Interface, access modifiers, Method Overriding
1) Create a package called tamilnadu.chennai
2) Create an interface ‘TrafficRules’ under this package
3) Make sure this interface is public interface
– Add variable String trafficCommisssioner = “Kavin”;
– Add below methods
– void goByDieselVehicle();
– void goByBicycle();
4) Create class called ‘CommonManInChennai’ with main method in the same package tamilnadu.chennai
– Implement interface ‘TrafficRulesChennai’
– Create instance for this class and access all the methods
5) Now, create another package called ‘india.newDelhi’
6) Create an interface ‘TrafficRulesDelhi’ under this package
7) Make sure this interface is not public interface – it should be default interface
– Add variable String trafficCommisssioner = “Navin”;
– Add below methods
– void dontGoByDieselVehicle();
– void goByBicycle();
8) Create class called ‘CommonManInDelhi’ with main method in the same package india.newDelhi
– Implement interface ‘TrafficRulesDelhi’
– Create instance for this class and access all the methods
– Now, implement interface ‘TrafficRulesChennai’ also.
– Add unimplemented methods
– Access all the methods and observe the difference.
