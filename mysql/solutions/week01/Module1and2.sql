use billing_simple;
/*1st*/
select * from billing WHERE payer_email='vasya@mail.com';
/*2nd*/
INSERT INTO billing VALUES ('pasha@mail.com', 'katya@mail.com', 300.00, 'EUR', '2016-02-14', 'Valentines day present)')
/*3rd*/
UPDATE billing 
	SET payer_email='igor@mail.com'
WHERE payer_email ='alex@mail.com';
/*4th*/
DELETE FROM billing
	WHERE payer_email is NULL OR recipient_email is NULL OR payer_email='' OR recipient_email='';