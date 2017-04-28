# Setup
First, make sure you have `mysql` installed, and try to login:
````bash
mysql
````
if that doesn't work, try using the root user:
````bash
mysql -u root
````
if that doesn't work, try using a password:
````bash
mysql -u root -p
`````
Then, logout by typing `exit`.

# Execute commands using piping
You can type out MySQL commands from the interactive shell,
or you can just pipe commands written in files. To
create the `eatnet` database, the `Restaurants`, `BusinessUsers`,
and `Items` tables, and insert some example data, do the following:
(replace `mysql -u root` with whatever method worked above)

````bash
mysql -u root < src/main/sql/create_database.sql
mysql -u root < src/main/sql/create_tables.sql
mysql -u root < src/main/sql/insert_test_data.sql
````

Then, check that everything worked by executing
````bash
echo "select * from eatnet.Restaurants; select * from eatnet.BusinessUsers; select * from eatnet.Items;" | mysql -u root
````
This should be the output:
````bash
id	name
1	Sandwich Shop
2	Burrito Place
3	Plaza Pizza
4	Taco Turnaround
5	Donut Deli
6	Soup Siesta
7	Noodles or Nada
8	Zucchini Zordini
id	username	password	name	restaurant
1	sandwichshop	password	Sandy Witch	1
2	burritoplace	password	Berry Burrito	2
3	plazapizza	password	Pierre Pizziano	3
4	tacoturnaround	password	Terry Tunisia	4
5	donutdeli	password	Dorsa Yelidaman	5
6	soupsiesta	password	Sierra Supera	6
7	noodlesornada	password	Ned Needelelm	7
8	zucchinizordini	password	Zed Zulop	8
id	name	price	restaurant
1	Sandwich Supreme	7.99	1
2	Superb Sliced Swiss	8.99	1
3	Premium Burrito	10.99	2
4	Steak Taco	8.99	2
5	Tower of Piza	6.49	3
6	Pizza Palace	9.99	3
7	Taco Turnstile	9.99	4
8	Sliced Donut Sandwich	4.99	5
9	Chicken Caesar Donut Wrap	15.99	5
10	Broccoli Cheese Soup	4.99	6
11	Chicken Noodle Soup	15.99	6
12	Noodles	9.99	7
13	Nada	9.99	7
14	Zucchini Broccolini	5.99	8
15	Cucumber Xylophone	9.99	8
````
