/*Задание
Выведите список клиентов (имя, фамилия) и количество заказов данных клиентов, имеющих статус "new".
Ожидаемый формат результата:
+------------+------------+----------------------+
| first_name | last_name  | new_sale_num         |
+------------+------------+----------------------+
| Ivan       | Ivanov     |                   10 |
| Petr       | Petrov     |                    7 |
| Semen      | Sidorov    |                    7 |
| Frank     | Sinatra    |                    2 |
| Ella       | Fitzgerald |                    1 |
...
 
NB! 
Если необходимо в результате использовать группировку, то в операторе GROUP BY должны быть указаны все атрибуты, 
которые не являются аргументами аггрегирующих функций.
В запросе для соединения нескольких источников данных операцию соединения можно использовать многократно. 
Например, для соединения таблиц A, B и C можно использовать запрос вида:
SELECT * FROM A
  INNER JOIN B
    ON A.b_id = B.id
  INNER JOIN C
    ON a.c_id = C.id;*/

SELECT client.first_name, client.last_name, count(sale.status_id)
	FROM sale    
		INNER JOIN client
			ON client.id = sale.client_id
		INNER JOIN status
			ON sale.status_id = status.id
            WHERE status.name='New'
		GROUP BY client.first_name, client.last_name; 
