--EXAM 4_TASK 2_FEBRUARY17

create table newsa(
id serial primary key,
news_heading varchar(100) not null,
news_text varchar(1000) not null,
publication_time timestamp not null
);

select news_heading, news_text
from newsa 
where id = 1

delete from newsa
where id = 1

update newsa
set news_heading = 'Spring'
where id = 2

update newsa
set news_text = 'spring is being late. no, it is mistake'
where id = 2
