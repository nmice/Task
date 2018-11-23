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
Выведите общее количество заказов компании.*/
SELECT count(1) FROM project;