# OpenAPI generated server

Spring Boot Server 


## Overview  
This server was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.
By using the [OpenAPI-Spec](https://openapis.org), you can easily generate a server stub.
This is an example of building a OpenAPI-enabled server in Java using the SpringBoot framework.

The underlying library integrating OpenAPI to SpringBoot is [springfox](https://github.com/springfox/springfox)

Start your server as a simple java application

You can view the api documentation in swagger-ui by pointing to  
http://localhost:8084/

Change default port value in application.properties

## Run with docker

Create a volume for store data

docker create -v /var/lib/postgresql/data --name PostgresData alpine

Create the image for postgres

docker run --rm -p 5432:5432 --name postgres -e POSTGRES_PASSWORD=123456 -d --volumes-from PostgresData postgres

To start app
./startup.sh

To stop 
./shutdown.sh

You can view the application by pointing to  
http://localhost:8082/

#With pgadmin

docker run -p 5050:80 --name pgadmin_container -e PGADMIN_DEFAULT_PASSWORD=admin -e PGADMIN_DEFAULT_EMAIL=pgadmin4@pgadmin.org --link postgres_container --network touresbalon-network -d --volume pgadmin:/root/.pgadmin dpage/pgadmin4

You can view pgadmin by pointing to  
http://localhost:5050/

user: pgadmin4@pgadmin.org
password: admin