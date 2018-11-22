use project_simple;
/*База данных учета проектов `project_simple` состоит из одной таблицы `project` следующей структуры:

CREATE TABLE IF NOT EXISTS `project_simple`.`project` (
  `project_name` VARCHAR(255) NULL,
  `client_name` VARCHAR(255) NULL,
  `project_start` DATE NULL,
  `project_finish` DATE NULL,
  `budget` DECIMAL(18,2) NULL)
ENGINE = InnoDB;

Задание
Выведите в качестве результата одного запроса общее количество заказов, сумму стоимостей (бюджетов) всех проектов, 
средний срок исполнения заказа в днях.

NB! Для вычисления длительности проекта удобно использовать встроенную функцию datediff().*/
SELECT 
	count(1) as number_of_projects,
    SUM(budget) as budget_of_all_projects,
    AVG(datediff(project_finish, project_start)) as avg_days
FROM project;