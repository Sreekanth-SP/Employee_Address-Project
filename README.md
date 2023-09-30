
# Employee_Address-Project
> `This is a README file for the Employee-Address project, which is developed using the MVC (Model-View-Controller) architecture. The project aims to manage employee data and their corresponding addresses. The following sections provide an overview of the project structure, dependencies, data flow, and data structures used.`
---
**<ins>Dependencies: </ins>**

The Employee-Address project relies on the following dependencies:

* Spring Web: A framework for building web applications in Java.
* Spring JPA: A Java Persistence API that simplifies database access.
* MySQL Driver: A JDBC driver for connecting to a MySQL database.
* Lombok: A library that reduces boilerplate code in Java.
* Swagger: A tool for documenting and testing RESTful APIs.
---
**<ins>Data Flow: </ins>**
* Client sends a request to the application and the request is intercepted by the appropriate controller class. The controller class processes the request and invokes the corresponding service class.
* The service class interacts with the repository to perform CRUD (Create, Read, Update, Delete) operations on the data and the repository communicates with the database using Spring JPA.
* Service class retrieves the data from the repository, performs any required business logic, and returns the processed data to the controller.
* The controller prepares the data to be displayed and selects the appropriate view template and the view template is rendered with the data and returned as the response.
*The client receives the response and displays the data.
---
**<ins>Data Structures: </ins>**

The Employee-Address project uses the following data structures:

* Employee:
  * id: unique identifier for the employee
  * first name: first name of the employee
  * last name: last name of the employee
  * address Id: foreign key referencing the address
    
* Address:
  * id: unique identifier for the address
  * street: street name of the address
  * city: city name of the address
  * state: state name of the address
  * zipCode: zip code of the address
    
These data structures are represented as Java classes in the model package.

---

## Conclusion

The Employee-Address project follows the MVC architecture to manage employee data and their addresses. The provided README.md file outlines the project structure, dependencies, data flow, and data structures used. Use this information as a starting point to understand and work on the project.
