/*Задание
Выведите список всех источников клиентов и суммарный объем заказов по каждому источнику. Результат должен включать 
также записи для источников, по которым не было заказов.
Ожидаемый формат результата:
+-------------+----------------+
| source_name | sale_sum       |
+-------------+----------------+
| source 1    | 111.00         |
| source 2    | 222.00         |
| source 3    | 333.00         |
...
 
NB! В запросе для соединения нескольких источников данных операцию соединения можно использовать многократно. 
Например, для соединения таблиц A, B и C можно использовать запрос вида:
SELECT * FROM A
  LEFT OUTER JOIN B
    ON A.b_id = B.id
  LEFT OUTER JOIN C
    ON a.c_id = C.id;*/
    
SELECT source.name AS source_name, sum(sale.sale_sum) AS sale_sum
    FROM source
    LEFT OUTER JOIN client ON client.source_id = source.id
    LEFT OUTER JOIN sale ON sale.client_id = client.id
GROUP BY source_name;    