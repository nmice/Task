select product.product_name, category.category_name 
	from product inner join category on product.category_id = category.category_id
    ORDER BY product_name, category_name;