# Welcome to springmvccurdoperation
How to run the application follow the below step :

Add MySql Springboot Configuration insite resource folder.

spring.datasource.url=jdbc:mysql://localhost:3306/test
spring.datasource.username=root
spring.datasource.password=root
#spring.jpa.hibernate.use-new-id-generator-mappings=false
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5Dialect
spring.jpa.properties.hibernate.format_sql=true


Go to the src/main/java -->  open SpringbootcurdoperationApplication.java Right click on that and do Run as Java Application.

Once server is get start Pls. try to access this application with below address :

http://localhost:8080/

if your want to change is server port then please add this below command in application.yaml available src/main/resources

server.port=9090
1. Postman calls for spring boot curd operation.

  Get All EMP
  
GET /emp/getAll HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 99

 {
        "ename": "test5",
        "address": "Nagpur",
        "mobileNo": "878787448"
    }
![curdgetall](https://github.com/vikuSingh/springmvccurdoperation/assets/20941580/e27c778b-e69b-4019-8f7e-09946465468f)


Save Employee

POST /emp/save HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 99

 {
        "ename": "test5",
        "address": "Nagpur",
        "mobileNo": "878787448"
    }
  
![curdsave](https://github.com/vikuSingh/springmvccurdoperation/assets/20941580/74bf3782-d656-4b63-bae6-ff37e30eadfb)

Put/update call 
PUT /emp/update HTTP/1.1
Host: localhost:8080
Content-Type: application/json
Content-Length: 97

{
    "eid": 5,
    "ename": "test10",
    "address": "Bihar",
    "mobileNo": "878787448"
}

![Capture](https://github.com/vikuSingh/springmvccurdoperation/assets/20941580/f51b2382-48a2-4c8c-902c-6cc2b2fc4b80)

FindById Employee
![Capture](https://github.com/vikuSingh/springmvccurdoperation/assets/20941580/9f7206ce-538c-48c4-ab23-29d199cbdc44)

DeleteById Employee

![Capture](https://github.com/vikuSingh/springmvccurdoperation/assets/20941580/786a21a4-cdbc-4d56-8154-bf7607dde9d4)





