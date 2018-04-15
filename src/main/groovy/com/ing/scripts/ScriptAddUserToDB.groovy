package com.ing.scripts

import groovy.sql.Sql

def url = 'jdbc:mysql://devdb.cc72u2l6fl7d.us-east-1.rds.amazonaws.com:3306/gappDB'
def user = 'gapp'
def password = 'gapp'
def driver = 'com.mysql.jdbc.Driver'
def sql = Sql.newInstance(url, user, password, driver)

// ... create 'sql' instance
sql.execute '''
  CREATE TABLE TB_Users (
    id          INTEGER NOT NULL AUTO_INCREMENT,
    user_name   VARCHAR(64),
    user_password    VARCHAR(64),
    version     INTEGER,
    PRIMARY KEY (id)
  );
'''

sql.execute "INSERT INTO TB_Users(user_name, user_password, version) VALUES ('admin', 'admin', 0)"
sql.execute "INSERT INTO TB_Users(user_name, user_password, version) VALUES ('user', 'user', 0)"
sql.execute "INSERT INTO TB_Users(user_name, user_password, version) VALUES ('bt', 'bt', 0)"

def rowNum = 0
sql.query('SELECT user_name, user_password FROM TB_Users') { resultSet ->
    while (resultSet.next()) {
        def user_name  = resultSet.getString('user_name')
        def user_password = resultSet.getString('user_password')
        println "$user_name  $user_password"
    }
}

sql.close()