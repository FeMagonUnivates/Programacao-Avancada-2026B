select * from produtos
where upper(nome) like 'B%';

select * from produtos
order by preco
limit 3 offset 3;

select count(*) as quantidade
from produtos
where nome = 'banana';

select sum(preco) 
from produtos;

select avg(preco) 
from produtos;

select nome, length(nome) as tamanho
from produtos
order by tamanho;

select nome, avg(preco)
from produtos
group by nome;

select nome, count(*) as quantidade 
from produtos
group by nome
having count(*) > 2
order by quantidade;