/*Задание
Выведите названия товаров, которые относятся к категории 'Cakes' или фигурируют в заказах текущий статус которых '
delivering'. Результат не должен содержать одинаковых записей. В запросе необходимо использовать оператор UNION 
для объединения выборок по разным условиям.
Ожидаемый формат результата:
+-------------+
| good_name   |
+-------------+
| good 1      |
| good 2      |
| good 3      |
...
 
NB! В запросе для соединения нескольких источников данных операцию соединения можно использовать многократно. 
Например, для соединения таблиц A, B и C можно использовать запрос вида:
SELECT * FROM A
  INNER JOIN B
    ON A.b_id = B.id
  INNER JOIN C
    ON a.c_id = C.id;*/
SELECT good.name as good_name FROM good
	INNER JOIN category_has_good 
		ON category_has_good.good_id = good.id
	INNER JOIN category 
		ON category_has_good.category_id = category.id            
		WHERE category.name = 'Cakes'
UNION
SELECT good.name FROM good
	INNER JOIN sale_has_good 
		ON sale_has_good.good_id = good.id
	INNER JOIN sale 
		ON sale_has_good.sale_id = sale.id  
	INNER JOIN status 
		ON sale.status_id = status.id  
		WHERE status.name = 'delivering';