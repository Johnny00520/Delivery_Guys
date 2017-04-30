# Eat-net
Object-Oriented-Project

Team: Chen Hao Cheng Peter Delevoryas Hulaif Muhammad Ilyas Eric Murphy

Title: Eat-net

Description: A website where restaurant owners can advertised their restaurant, restaurant location, and their food. The website allow restaurant owners to set up delivery and pick-up system for clients and customers can order, cancel, and view their orders.

Actors: Restaurant owners, customers

Functionality:

Customers can sign up
Customers can log in
restaurant owners can sign up
restaurant owners can log in
Admin can log in
Admin can set up what products get delivered each week
Admin can add products
Admin can add customers
Customers can add products to a shopping cart
Customers can checkout/pay
Customers can view their orders
customers can cancel orders
restaurant owners can configure and customize the website
Admin can search for a customer by name
Admin can view a customer’s order

## Dependencies
- Redis
- MySQL

You need to have a MySQL server running on port 33306,
and a database called `eatnet`,
and a root MySQL user with no password. Alternatively,
you can edit `application.properties`, replacing
`spring.datasource.username` and `spring.datasource.password`
without your MySQL username and password.


````bash
mysql> create database eatnet;
````

The application will take care of creating tables when it starts up.

You also need to have Redis installed, and a Redis server running
in the background on port 6379.

````bash
redis-server &
````

Lastly, you also need to have JDK 1.7+ installed. Maven is not
necessary, as there is a `mvnw` script in the build directory
for you to use. If you do have Maven installed though,
that will also work.

Go to the build directory and execute:

````bash
./mvnw spring-boot:run
````

or

````bash
mvn spring-boot:run
````

This should start the server on port 8443. You can then
open a web browser and go to `localhost:8443` to
use the website.
