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


![Capture](https://github.com/vikuSingh/springbootcurdoperation/assets/20941580/4942158a-029a-4b7c-8a48-b5ba8aa08635)


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
  
![Capture](https://github.com/vikuSingh/springbootcurdoperation/assets/20941580/884b8cf7-723e-44b6-86ae-f9661aee1cd5)


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

![Capture](https://github.com/vikuSingh/springbootcurdoperation/assets/20941580/da686e47-70d6-43a4-b5bc-27980f92960b)

FindById Employee

![Capture](https://github.com/vikuSingh/springbootcurdoperation/assets/20941580/c312018e-4668-4b97-876a-dcabea360a0c)


DeleteById Employee

![Capture](https://github.com/vikuSingh/springbootcurdoperation/assets/20941580/fb93b96e-cf7f-46f4-a6d7-1dbb1acff4ed)






