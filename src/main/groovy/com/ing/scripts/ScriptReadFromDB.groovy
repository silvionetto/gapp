package com.ing.scripts

import groovy.sql.Sql

def url = 'jdbc:mysql://devdb.cc72u2l6fl7d.us-east-1.rds.amazonaws.com:3306/gappDB'
def user = 'gapp'
def password = 'gapp'
def driver = 'com.mysql.jdbc.Driver'
def sql = Sql.newInstance(url, user, password, driver)

def rowNum = 0
sql.query('SELECT user_name, user_password FROM TB_Users') { resultSet ->
    while (resultSet.next()) {
        def user_name  = resultSet.getString('user_name')
        def user_password = resultSet.getString('user_password')
        println "$user_name  $user_password"
    }
}

sql.close()