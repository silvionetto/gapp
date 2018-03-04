package com.ing.scripts

import groovy.sql.Sql

def url = 'jdbc:hsqldb:gappDB'
def user = 'sa'
def password = ''
def driver = 'org.hsqldb.jdbcDriver'
def sql = Sql.newInstance(url, user, password, driver)

// ... create 'sql' instance
sql.execute '''
  CREATE TABLE TB_Bank (
    id          INTEGER GENERATED BY DEFAULT AS IDENTITY,
    name    VARCHAR(64),
    version     INTEGER
  );
'''

sql.execute "INSERT INTO TB_Bank(name, version) VALUES ('ING', 0)"
sql.execute "INSERT INTO TB_Bank(name, version) VALUES ('BNP', 0)"
sql.execute "INSERT INTO TB_Bank(name, version) VALUES ('ABN', 0)"

sql.query('SELECT name FROM TB_Bank') { resultSet ->
    while (resultSet.next()) {
        def name  = resultSet.getString('name')
        println "$name"
    }
}

sql.close()