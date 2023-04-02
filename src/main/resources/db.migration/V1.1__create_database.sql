drop database if exists petstorepetservice_db;

create database petstorepetservice_db
    with
    owner = petstoreadmin
    encoding = 'UTF8'
    connection limit = -1;
grant all on database petstorepetservice_db to petstoreadmin;
grant temporary, connect on database petstorepetservice_db to public;
