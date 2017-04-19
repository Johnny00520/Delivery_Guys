use eatnet;

create table Restaurants (
    id int auto_increment not null,
    name varchar(32) not null,
    primary key (id)
);

create table BusinessUsers (
    id int auto_increment not null,
    username varchar(32) not null unique,
    password varchar(32) not null,
    name varchar(64) not null,
    restaurant int not null,
    foreign key (restaurant)
        references Restaurants(id)
        on delete cascade,
    primary key (id)
);

create table Items (
    id int auto_increment not null,
    name varchar(32) not null,
    price float not null,
    restaurant int not null,
    foreign key (restaurant)
        references Restaurants(id)
        on delete cascade,
    primary key (id)
);
