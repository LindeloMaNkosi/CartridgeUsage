**Product Inheritance System**

**Description**
This project demonstrates the use of abstract classes, inheritance, and method overriding in Java. It implements a basic product system where there are two types of products: Perishable and NonPerishable. Both extend a parent abstract class named Product, which provides common fields and methods, while enforcing the implementation of the setPrice() method in its child classes.

The project showcases object-oriented programming principles, such as abstraction and inheritance, by creating an abstract Product class and two concrete child classes Perishable and NonPerishable.

**Table of Contents**
Project Structure
Class Details
Product (Abstract Class)
Perishable (Child Class)
NonPerishable (Child Class)
UseProduct (Demonstration Class)
How to Run
Usage Example
License

**Project Structure**
The project contains the following files:
.
├── Product.java         # Abstract parent class defining common product properties
├── Perishable.java      # Child class representing perishable products
├── NonPerishable.java   # Child class representing non-perishable products
├── UseProduct.java      # Class to demonstrate the usage of the product system
└── README.md            # Project documentation

**Class Details**
Product (Abstract Class)
Fields:
name (String): The name of the product.
price (double): The price of the product.

Methods:
Constructor to initialize name and set price through the setPrice() method.
getName() - returns the product name.
getPrice() - returns the product price.
setPrice() - abstract method to set the price of the product (implemented by child classes).

Perishable (Child Class)
Inherits from Product.
Implements the setPrice() method to set the price to R11.99 for perishable products.
Constructor calls setPrice() to ensure the correct price is set during object creation.

NonPerishable (Child Class)
Inherits from Product.
Implements the setPrice() method to set the price to R19.99 for non-perishable products.
Constructor calls setPrice() to ensure the correct price is set during object creation.

UseProduct (Demonstration Class)
Demonstrates the usage of the Perishable and NonPerishable classes by creating instances of both and printing their details.

**How to Run**
1.Clone the repository:
Clone this project to your local machine using the following command:
git clone https://github.com/LindeloMaNkosi/product-inheritance-system.git

2.Navigate to the project directory:
cd product-inheritance-system
3.Compile the Java files: Use the Java compiler (javac) to compile all the Java files:
javac Product.java Perishable.java NonPerishable.java UseProduct.java

4.Run the program: After compiling the files, run the UseProduct class to demonstrate the functionality:
java UseProduct
Usage Example
When you run the UseProduct class, it will create instances of both Perishable and NonPerishable products and display their names and prices.

Example output:

Product: Milk
Price: R11.99
Product: Canned Beans
Price: R19.99

The Perishable product's price is automatically set to R11.99, and the NonPerishable product's price is set to R19.99, demonstrating the use of the setPrice() method in each child class.
