create view produtos_caros as
select * from produtos
where preco > 10.00;

create view produtos_com_n as
select * 
from produtos
where lower(nome) like '%n%'
order by nome;