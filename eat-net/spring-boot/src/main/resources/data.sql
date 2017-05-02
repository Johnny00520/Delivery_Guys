
insert into eatnet.restaurants (name) values
    ("Sandwich Shop");
set @restaurant = LAST_INSERT_ID();
insert into eatnet.owners (username, password, name) values
    ("sandwichshop", "password", "Sandy Witch");
insert into eatnet.items (name, price, restaurant) values
    ("Sandwich Supreme", 7.99, @restaurant),
    ("Superb Sliced Swiss", 8.99, @restaurant);

insert into eatnet.restaurants (name) values
    ("Burrito Place");
set @restaurant = LAST_INSERT_ID();
insert into eatnet.owners (username, password, name) values
    ("burritoplace", "password", "Berry Burrito");
insert into eatnet.items (name, price, restaurant) values
    ("Premium Burrito", 10.99, @restaurant),
    ("Steak Taco", 8.99, @restaurant);

insert into eatnet.restaurants (name) values
    ("Plaza Pizza");
set @restaurant = LAST_INSERT_ID();
insert into eatnet.owners (username, password, name) values
    ("plazapizza", "password", "Pierre Pizziano");
insert into eatnet.items (name, price, restaurant) values
    ("Tower of Piza", 6.49, @restaurant),
    ("Pizza Palace", 9.99, @restaurant);

insert into eatnet.restaurants (name) values
    ("Taco Turnaround");
set @restaurant = LAST_INSERT_ID();
insert into eatnet.owners (username, password, name) values
    ("tacoturnaround", "password", "Terry Tunisia");
insert into eatnet.items (name, price, restaurant) values
    ("Taco Turnstile", 9.99, @restaurant);

insert into eatnet.restaurants (name) values
    ("Donut Deli");
set @restaurant = LAST_INSERT_ID();
insert into eatnet.owners (username, password, name) values
    ("donutdeli", "password", "Dorsa Yelidaman");
insert into eatnet.items (name, price, restaurant) values
    ("Sliced Donut Sandwich", 4.99, @restaurant),
    ("Chicken Caesar Donut Wrap", 15.99, @restaurant);

insert into eatnet.restaurants (name) values
    ("Soup Siesta");
set @restaurant = LAST_INSERT_ID();
insert into eatnet.owners (username, password, name) values
    ("soupsiesta", "password", "Sierra Supera");
insert into eatnet.items (name, price, restaurant) values
    ("Broccoli Cheese Soup", 4.99, @restaurant),
    ("Chicken Noodle Soup", 15.99, @restaurant);

insert into eatnet.restaurants (name) values
    ("Noodles or Nada");
set @restaurant = LAST_INSERT_ID();
insert into eatnet.owners (username, password, name) values
    ("noodlesornada", "password", "Ned Needelelm");
insert into eatnet.items (name, price, restaurant) values
    ("Noodles", 9.99, @restaurant),
    ("Nada", 9.99, @restaurant);

insert into eatnet.restaurants (name) values
    ("Zucchini Zordini");
set @restaurant = LAST_INSERT_ID();
insert into eatnet.owners (username, password, name) values
    ("zucchinizordini", "password", "Zed Zulop");
insert into eatnet.items (name, price, restaurant) values
    ("Zucchini Broccolini", 5.99, @restaurant),
    ("Cucumber Xylophone", 9.99, @restaurant);
