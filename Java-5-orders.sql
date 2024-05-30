create table orders (
id int identity (1,1) primary key , 
address nvarchar(50),
createDate date ,
username nvarchar(100) references accuonts(username)


)