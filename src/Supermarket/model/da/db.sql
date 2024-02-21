create table customer_tbl
(
    id          number,
    name        nvarchar2(20),
    family      nvarchar2(20),
    phoneNumber number
);
create sequence customer_seq start with 1 increment by 1;

create table product_tbl
(
    id     number,
    name   nvarchar2(20),
    brand  nvarchar2(20),
    serial nvarchar2(20),
    price  number
);
create sequence product_seq start with 1 increment by 1;


create table order_tbl
(
    id            number,
    customer_id   number,
    purchase_time date,
    discount      number
);
create sequence order_seq start with 1 increment by 1;


create table cash_register_tbl
(
    orderId number,
    amount  number
);

