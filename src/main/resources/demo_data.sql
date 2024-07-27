insert into users (name, username, password)
values ('John Doe', 'johndoe@gmail.com', '123123'),
       ('Mike Smith', 'mikesmith@gmail.com', '123123');

insert into tasks (title, description, status, expiration_date)
values ('buy apples', null, 'TODO', '2024-07-26 12:00:00'),
       ('do hw', 'math, physics, literature', 'IN_PROGRESS', '2023-01-28 12:00:00');

insert into users_tasks (task_id, user_id)
values (1, 1),
       (2, 2);

insert into users_roles (user_id, role)
values (1, 'ROLE_ADMIN'),
       (1, 'ROLE_USER'),
       (2, 'ROLE_USER');