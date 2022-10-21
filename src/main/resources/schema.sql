create table book (
    id  bigserial not null,
    author varchar(100) not null,
    create_time timestamp not null,
    description varchar(200) not null,
    price float8 not null,
    title varchar(100) not null,
    primary key (id)
);

create table users (
    id  bigserial not null,
    create_time timestamp not null,
    name varchar(100) not null,
    password varchar(100) not null,
    role varchar(255),
    username varchar(100) not null,
    primary key (id)
);

create table purchase_history (
    id  bigserial not null,
    book_id int8 not null,
    price float8 not null,
    purchase_time timestamp not null,
    user_id int8 not null,
    primary key (id)
);

