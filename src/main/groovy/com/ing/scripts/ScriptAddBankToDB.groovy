package com.ing.scripts

import groovy.sql.Sql

def url = 'jdbc:mysql://devdb.cc72u2l6fl7d.us-east-1.rds.amazonaws.com:3306/gappDB'
def user = 'gapp'
def password = 'gapp'
def driver = 'com.mysql.jdbc.Driver'
def sql = Sql.newInstance(url, user, password, driver)

// ... create 'sql' instance
sql.execute '''
  CREATE TABLE Bank (
    id          INT NOT NUL AUTO_INCREMENT,
    name        VARCHAR(64) NOT NULL,
    version     INT NOT NULL,
    PRIMARY KEY (id)
  );
'''

sql.execute "INSERT INTO Bank(name, version) VALUES ('ING', 0)"
sql.execute "INSERT INTO Bank(name, version) VALUES ('BNP', 0)"
sql.execute "INSERT INTO Bank(name, version) VALUES ('ABN', 0)"

sql.query('SELECT id, name FROM Bank') { resultSet ->
    while (resultSet.next()) {
        def id = resultSet.getInt('id')
        def name  = resultSet.getString('name')
        println "${id}:${name}"
    }
}

sql.close()
