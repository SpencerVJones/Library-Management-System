# Library Management System
  <div align="left">
	
![Repo Views](https://visitor-badge.laobi.icu/badge?page_id=SpencerVJones/Library-Management-System)
</div>
This Java-based Library Management System provides functionalities for managing books, staff, and administrative tasks within a library environment.

## Features:
- **Dashboard**: Provides options for managing books, staff, and users.
- **Book Management:** Add, remove, and update books in the library inventory.
- **Staff Management:** Manage staff details including their roles, contact information, and salaries.
- **Data Persistence:** Utilizes MySQL database for storing and retrieving library data.
- **Intuitive User Interface:** Graphical user interface (GUI) for easy interaction and navigation.
- **User Authentication**: Provides secure login functionality for administrators.

## Usage
### Prerequisites

- JDK installed on your system.
- MySQL database server installed.
- MySQL Connector/J library added to the project for database connectivity.

### Setup

1. Clone the repository to your local machine.
2. Import the project into your Java IDE.
3. Configure MySQL database settings in the code.
4. Create the necessary database tables and insert sample data using the provided SQL script.
5. Run the application.

### Running the Application
1. Compile and run the `LoginPage.java` file to start the application.
2. Log in using the admin credentials provided in the `ADMIN` table.
3. Explore the Features:
  - Dashboard: Access various functionalities including managing books, staff, and logging out.
  - Book Management: Add, remove, or update books in the library inventory.
  - Staff Management: Manage staff details such as their roles, contact information, and salaries.
  - Logout: Safely exit the application.
4. Customize and Extend:
  - Customize the GUI, add additional features, or enhance existing functionalities to suit your specific requirements.

### Files Included
- `LoginPage.java`: Implements the login functionality.
- `Dashboard.java`: Displays the main dashboard.
- `AddBook.java`: Provides functionality to add new books.
- `AddStaff.java`: Allows adding new staff members.
- `RemoveStaff.java`: Enables removing staff members.
- `StaffDetails.java`: Displays details of all staff members.
- `Library.owl`: Image file used for GUI.
- `README.md`: This file providing information about the project.
  

## Technologies Used:
- **Java**: The core programming language used for implementing the backend logic.
- **Swing**: Java's GUI toolkit utilized for building the graphical user interface.
- **MySQL**: A relational database management system used for storing library data.
- **JDBC**: Java Database Connectivity API employed for connecting Java applications to databases.
- **IDE:** Apache NetBeans

## Contributing
Contributions are welcome! 

### You can contribute by:
-  Reporting bugs
-  Suggesting new features
-  Submitting pull requests to improve the codebase
