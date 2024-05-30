create table products (
id int identity(1,1) primary key,
names nvarchar(100) not null,
price int ,
createDate date,
img varchar(50),
available bit,
categoryid int references categories(id)
)