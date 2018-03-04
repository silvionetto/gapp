package com.ing.scripts

import groovy.sql.Sql

def url = 'jdbc:hsqldb:gappDB'
def user = 'sa'
def password = ''
def driver = 'org.hsqldb.jdbcDriver'
def sql = Sql.newInstance(url, user, password, driver)

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