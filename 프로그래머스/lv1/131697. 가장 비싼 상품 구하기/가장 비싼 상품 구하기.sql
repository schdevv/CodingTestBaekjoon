SELECT price
FROM product
WHERE price =
(SELECT max(price)
FROM product)
LIMIT 1