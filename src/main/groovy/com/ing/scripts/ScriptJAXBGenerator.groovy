package com.ing.scripts

def source_dir = "src/main/resources/schema/"
def target_dir = "src/main/java/"
println "pwd".execute().text
println "xjc ${source_dir}/fpml-loan.xsd -d ${target_dir}".execute().text
