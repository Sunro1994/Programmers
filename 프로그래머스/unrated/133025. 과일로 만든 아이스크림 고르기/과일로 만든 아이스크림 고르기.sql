select A.flavor from FIRST_HALF A join ICECREAM_INFO B
on A.flavor = B.flavor
where A.total_order > 3000 and B.Ingredient_type = 'fruit_based'
order by A.total_order desc;