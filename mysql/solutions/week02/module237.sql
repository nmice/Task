/*Задание
Выведите список всех категорий продуктов и количество продаж товаров, относящихся к данной категории. 
Под количеством продаж товаров подразумевается суммарное количество единиц товара данной категории, 
фигурирующих в заказах с любым статусом.

Ожидаемый формат результата:
+---------------------+----------+
| name                | sale_num |
+---------------------+----------+
| category 1          |       11 |
| category 2          |       25 |
| category 3        |       13 |
...
 
NB! В запросе для соединения нескольких источников данных операцию соединения можно использовать многократно. 
Например, для соединения таблиц A, B и C можно использовать запрос вида:
SELECT * FROM A
  LEFT OUTER JOIN B
    ON A.b_id = B.id
  LEFT OUTER JOIN C
    ON a.c_id = C.id;*/
    
SELECT category.name AS name, count(sale.id) AS sale_sum FROM category
	LEFT OUTER JOIN category_has_good ON category.id = category_has_good.category_id
	LEFT OUTER JOIN good ON category_has_good.good_id = good.id
    LEFT OUTER JOIN sale_has_good ON good.id = sale_has_good.good_id
    LEFT OUTER JOIN sale ON sale_has_good.sale_id = sale.id
		GROUP BY category.name;