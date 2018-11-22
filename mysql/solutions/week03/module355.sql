/*Задание
Добавьте в таблицу 'client' поле 'source_id' тип данных: INT, возможность использования неопределенного значения: Да. 
Для данного поля определите ограничение внешнего ключа как ссылку на поле 'id' таблицы 'source'.

NB! Для определения ограничения необходимо использовать оператор ADD CONSTRAINT. 
Определение ограничения внешнего ключа и поля таблицы необходимо производить в рамках одного вызова ALTER TABLE. 
Пример определения внешнего ключа для существующего или добавляемого поля a_id, указывающего на поле id таблицы 'a':
...
ADD CONSTRAINT fk_a_id FOREIGN KEY (a_id) REFERENCES a(id)
...

NB! При выполнении ALTER TABLE не следует указывать название схемы.*/

ALTER TABLE `client`
    ADD COLUMN 
    `source_id` INT NULL,
    ADD constraint fk_source_id foreign key (source_id) references source(id);