select firstname, lastname, count(*) as no_of_posts
from users
join posts
on users.id = posts.user_id
group by USER_ID
having count(*) > 1;

