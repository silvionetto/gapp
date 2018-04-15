package com.ing.scripts

import groovy.sql.Sql

def url = 'jdbc:mysql://devdb.cc72u2l6fl7d.us-east-1.rds.amazonaws.com:3306/gappDB'
def user = 'gapp'
def password = 'gapp'
def driver = 'com.mysql.jdbc.Driver'
def sql = Sql.newInstance(url, user, password, driver)

// ... create 'sql' instance
sql.execute '''
  CREATE TABLE TB_Currency (
    id          INTEGER NOT NULL AUTO_INCREMENT,
    name        VARCHAR(64),
    code        VARCHAR(3),
    version     INTEGER,
    PRIMARY KEY (id)
  );
'''

sql.execute "INSERT INTO TB_Currency(name, code, version) VALUES ('EURO', 'EUR', 0)"
sql.execute "INSERT INTO TB_Currency(name, code, version) VALUES ('DOLLAR', 'USD', 0)"
sql.execute "INSERT INTO TB_Currency(name, code, version) VALUES ('REAL', 'BRL', 0)"

sql.query('SELECT name, code FROM TB_Currency') { resultSet ->
    while (resultSet.next()) {
        def name  = resultSet.getString('name')
        def code = resultSet.getString('code')
        println "$name  $code"
    }
}

sql.close()
