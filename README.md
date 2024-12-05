http://localhost:8080/madridpay/


CREATE DATABASE madridpay_db;
CREATE USER 'root'@'localhost' IDENTIFIED BY 'password';
GRANT ALL PRIVILEGES ON madridpay_db.* TO 'root'@'localhost';
FLUSH PRIVILEGES;

