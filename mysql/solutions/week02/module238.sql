/*Задание
Выведите список источников, из которых не было клиентов, либо клиенты пришедшие из которых не совершали заказов 
или отказывались от заказов. Под клиентами, которые отказывались от заказов, необходимо понимать клиентов, 
у которых есть заказы, которые на момент выполнения запроса находятся в состоянии 'rejected'. 
В запросе необходимо использовать оператор UNION для объединения выборок по разным условиям.

Ожидаемый формат результата:
+-------------+
| source_name |
+-------------+
| source 1    |
| source 2    |
| source 3    |
......
 
NB! 
Для проверки существования записей в каких-либо таблицах можно использовать оператор EXISTS в условии WHERE. Например, вывести список категорий, к которым не принадлежат никакие товары можно следующим образом:
SELECT c.id, c.name FROM category AS c 
  WHERE NOT EXISTS (SELECT * FROM category_has_good AS cg
        WHERE cg.category_id = c.id)
;

В запросе для соединения нескольких источников данных операцию соединения можно использовать многократно. Например, для соединения таблиц A, B и C можно использовать запрос вида:
SELECT * FROM A
  INNER JOIN B
    ON A.b_id = B.id
  INNER JOIN C
    ON a.c_id = C.id;*/
    
SELECT source.name AS source_name 
    FROM source 
		WHERE NOT EXISTS (SELECT * FROM client WHERE client.source_id=source.id) 
    UNION 
SELECT source.name AS source_namee 
    FROM source 
		INNER JOIN client ON client.source_id=source.id 
		INNER JOIN sale ON sale.client_id=client.id 
		WHERE sale.number IS NULL OR sale.number='' 
    UNION 
SELECT source.name AS source_name 
    FROM source 
		INNER JOIN client ON client.source_id=source.id 
		INNER JOIN sale ON sale.client_id=client.id 
		INNER JOIN status ON status.id=sale.status_id 
    WHERE status.name='rejected';