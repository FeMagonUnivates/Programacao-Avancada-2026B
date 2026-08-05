select * from produtos
where upper(nome) like 'B%';

select * from produtos
order by preco
limit 3 offset 3;