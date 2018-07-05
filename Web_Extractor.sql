DROP TABLE IF EXISTS webextractor;
use webextractor;
create table webextractor
( 
	set_id int(4) not null primary key,
    retailer varchar(20),
    title varchar(20),
    description varchar(50),
    price decimal(4,2)
   
);

insert into webextractor
values('1', 'Walmart', 'TV', 'Plasma', '60.99');
insert into webextractor
values('2', 'Target', 'TV', 'LCD', '29.99');