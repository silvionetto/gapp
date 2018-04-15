package com.ing.scripts

import groovy.sql.Sql

def url = 'jdbc:mysql://devdb.cc72u2l6fl7d.us-east-1.rds.amazonaws.com:3306/gappDB'
def user = 'gapp'
def password = 'gapp'
def driver = 'com.mysql.jdbc.Driver'
def sql = Sql.newInstance(url, user, password, driver)

// ... create 'sql' instance
sql.execute '''
  CREATE TABLE TB_Overnight (
    id          INTEGER NOT NULL AUTO_INCREMENT,
    overnightDate DATE DEFAULT CURRENT_DATE,
    bank        INTEGER,
    amount      DECIMAL(10,2),
    rate        FLOAT,
    version     INTEGER
    PRIMARY KEY (id)
  );
'''

sql.execute "INSERT INTO TB_Overnight(bank, amount, rate, version) VALUES (0, 100000, 1.5, 0)"
sql.execute "INSERT INTO TB_Overnight(bank, amount, rate, version) VALUES (1, 20000, 1.1, 0)"
sql.execute "INSERT INTO TB_Overnight(bank, amount, rate, version) VALUES (2, 30000, 1.2, 0)"

sql.query('SELECT bank, amount, rate, version FROM TB_Overnight') { resultSet ->
    while (resultSet.next()) {
        def bank  = resultSet.getInt('bank')
        def amount = resultSet.getBigDecimal('amount')
        def rate = resultSet.getFloat('rate')
        def version = resultSet.getInt('version')
        println "${bank}:${amount}:${rate}:${version}"
    }
}

sql.close()