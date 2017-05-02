insert into eatnet.restaurants (name) values
    ("Sandwich Shop");
set @restaurant = LAST_INSERT_ID();
insert into eatnet.owners (username, password, name) values
    ("sandwichshop", "password", "Sandy Witch");
insert into eatnet.items (name, restaurant) values
    ("Sandwich Supreme", @restaurant),
    ("Superb Sliced Swiss", @restaurant);
