insert into eatnet.restaurants (name) values
    ("Sandwich Shop");
set @restaurant = LAST_INSERT_ID();
insert into eatnet.owners (username, password, name) values
    ("sandwichshop", "password", "Sandy Witch");
insert into eatnet.items (name, price, restaurant) values
    ("Sandwich Supreme", 7.99, @restaurant),
    ("Superb Sliced Swiss", 5.49, @restaurant);
