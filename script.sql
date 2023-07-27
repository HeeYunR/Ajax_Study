create table ajaxTable
(
  seq number primary key,
  x number not null,
  y number not null,
  ck char(1) not null --'y' 'n'
);

create sequence tableseq;

commit;

select * from ajaxtable;

delete ajaxtable;


create table tblJournal (
    seq number primary key,
    line varchar2(1000) null
);

insert into tblJournal values (1, null);
insert into tblJournal values (2, null);
insert into tblJournal values (3, null);
insert into tblJournal values (4, null);
insert into tblJournal values (5, null);
insert into tblJournal values (6, null);
insert into tblJournal values (7, null);
insert into tblJournal values (8, null);
insert into tblJournal values (9, null);
insert into tblJournal values (10, null);
insert into tblJournal values (11, null);
insert into tblJournal values (12, null);
insert into tblJournal values (13, null);
insert into tblJournal values (14, null);
insert into tblJournal values (15, null);
commit;

select * from tblJournal;

create table tblProduct (
    seq number primary key,                         --번호(PK)
    name varchar2(100) not null,                    --상품명
    price number not null,                          --가격
    color varchar2(50) not null,                    --색깔
    pic varchar2(100) default 'pic.png' not null    --사진
);

create sequence seqProduct;

select * from tblproduct;

commit;

create table tblProductCopy
    as select * from tblproduct;
    
select * from (select a.*, rownum as rnum from tblProductCopy a) where rnum between 11 and 20;
commit;



