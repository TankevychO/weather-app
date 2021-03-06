# ☀️ **Weather Service**
The application describes the operation of a service for the view the weather. </br>
The weather information is taken from api https://api.openweathermap.org/data/2.5/weather </br>
#### Available actions of the application:
The application has the ability:
- view weather by city name </br>
`http://localhost:PORT/weather/by-city?name={name}`
________________________________________________________________________________________________________________________
#### Technologies:
- Spring boot
- Spring Data
- Jpa
- MySQL
- Maven
_______________________________________________________________________________________________________________________
#### Implementation details and technologies
Project based on 3-layer architecture:</br>
![This is an image](https://progi.pro/media/main/f5/f0/11/f5f01101de396d5c76a8eb66efaf9653.png)
To implement the application were created: database, models, dto, interfaces DAO and services for each model, controller.
_______________________________________________________________________________________________________________________
#### Setup "Weather app"
- [x] Install MySQL and MySQL Workbench
- [x] Add plugin Lombok
- [x] Create DB in the Workbench.
- [x] Change `PORT`, `DATABASE_URL`, `USERNAME`, `PASSWORD` in `/resources/application.properties` </br>
  ![This is an image](http://joxi.ru/a2XMOYksQZMpLA.jpg)
