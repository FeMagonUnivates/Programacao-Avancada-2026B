delete from produtos
where lower(nome) = 'morango';

/*teste com select antes*/
select * from produtos 
where id = 3;

delete from produtos
where id = 3;