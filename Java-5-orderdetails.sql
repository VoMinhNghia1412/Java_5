create table orderdetails (
id int identity(1,1) primary key ,
orderid int references orders(id),
productid int references products(id)

)