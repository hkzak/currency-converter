# currency-converter
A backend Java springboot application

Setup:
1- Clone the repo
2- Open with vscode or editor of choice
3- Wait for maven install all dependencies
4- Start applicaiton

The application will start at port 8001 by default, if you want to change it go to the application.properties and change port number

Rest API:
Swagger: http://localhost:8001/swagger-ui/index.html

There will be two endpoints:
First - http://localhost:8001/currency-service/from/USD/to/PHP 
This will return an object that includes the exchange rate for the requested from to parameters
![image](https://user-images.githubusercontent.com/22933014/172160154-a9d6cb53-cb78-41a6-825c-58e6e30d6668.png)
	
Response body
Download
{
  "id": 8,
  "from": "PHP",
  "to": "USD",
  "exchangeRate": 0.02
}

Second - http://localhost:8001/currency-service/from/USD/to/PHP/quantity 
This will return an object that includes the calculated conversion for the requested from/to/quantity parameters
![image](https://user-images.githubusercontent.com/22933014/172160858-68f7d3c2-d0da-4bf0-a4ff-148f647e1818.png)
	
Response body
Download
{
  "id": 7,
  "from": "USD",
  "to": "PHP",
  "exchangeRate": 50,
  "quantity": 10,
  "totalCalculatedAmount": 500
}
