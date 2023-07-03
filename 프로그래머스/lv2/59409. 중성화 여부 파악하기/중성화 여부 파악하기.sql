SELECT ANIMAL_ID, NAME,(
CASE WHEN SEX_UPON_INTAKE LIKE '%Neutered%' or SEX_UPON_INTAKE LIKE '%Spayed%' then 'O' 
else 'X'
end)
from animal_ins
order by animal_id;