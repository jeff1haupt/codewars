-- Your SQL here
SELECT 
  c.customer_id, 
  CONCAT(c.first_name, ' ', c.last_name) AS customer_name,
  COUNT(*) AS friday_rentals,
  string_agg(CAST(r.rental_date AS text), ', ' ORDER BY r.rental_date desc) AS rental_dates
FROM customer c
JOIN (SELECT *
   FROM rental 
   WHERE to_char(rental_date, 'Day') LIKE 'Friday%'
   AND CAST(rental_date AS TIME) BETWEEN '17:59:59' AND '23:59:59') r
  ON c.customer_id = r.customer_id
GROUP BY c.customer_id, customer_name
ORDER BY friday_rentals desc, c.last_name
LIMIT 50
