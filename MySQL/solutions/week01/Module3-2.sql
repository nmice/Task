use store_simple;
/*Выведите количество товаров в каждой категории. Результат должен содержать два столбца: 
название категории, 
количество товаров в данной категории.*/
SELECT category, count(1) FROM store
group by category;