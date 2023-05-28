-- Create your SELECT statement here
SELECT 
  age, 
  COUNT(age) AS total_people
FROM
  people 
GROUP BY age
HAVING COUNT(age) >= 10
