# Library Management System
This Java-based Library Management System provides functionalities for managing books, staff, and administrative tasks within a library environment.

## Features:
- **User Authentication:** Secure login system for administrators.
- **Book Management:** Add, remove, and update books in the library inventory.
- **Staff Management:** Manage staff details including their roles, contact information, and salaries.
- **Data Persistence:** Utilizes MySQL database for storing and retrieving library data.
- **Intuitive User Interface:** Graphical user interface (GUI) for easy interaction and navigation.
## Technologies Used:
- Java
- Swing (GUI Toolkit)
- MySQL
## How to Use:
1. Clone the Repository:
- git clone https://github.com/yourusername/library-management-system.git
2. Set Up MySQL Database:
- Install MySQL if not already installed.
- Create a new database named Library.
- Execute the SQL scripts provided in the database_scripts.sql file to create the necessary tables (ADMIN, BOOKS, STAFF) and insert sample data.
3. Configure Database Connection:
- Open the Java files for database connection (LoginPage.java, Dashboard.java, etc.).
- Modify the database URL, username, and password in the connection strings to match your MySQL configuration.
4. Compile the Java Files:
- javac *.java
5. Run the Application:
- java librarymanagementsystem.Main
6. Login as Administrator:
- Use the default admin credentials:
Username: admin
Password: 1234
7. Explore the Features:
- Dashboard: Access various functionalities including managing books, staff, and logging out.
- Book Management: Add, remove, or update books in the library inventory.
- Staff Management: Manage staff details such as their roles, contact information, and salaries.
- Logout: Safely exit the application.
8. Customize and Extend:
- Customize the GUI, add additional features, or enhance existing functionalities to suit your specific requirements.
