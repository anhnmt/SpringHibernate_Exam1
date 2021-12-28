create database DB_SpringHibernate_Exam1;

go

use DB_SpringHibernate_Exam1;

go

create table TblCountries
(
    CountryId   varchar(10) not null primary key,
    CountryName nvarchar(200),
    Area        float,
    Population  int,
)

go

insert into TblCountries (CountryId, CountryName, Area, Population)
VALUES ('KH', 'Cambodia', 181035, 15827241),
       ('LA', 'Lao People\''s Democratic republic', 236800, 6918367),
       ('TL', 'Thailand', 513120, 68146609),
       ('VN', 'Viet Nam', 331212, 94444200)