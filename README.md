# StarThrive – Business Manager

## Project Description

The **StarThrive – Business Manager** is an application developed to help the fictional company StarThrive efficiently manage a portfolio of companies, focusing on the restaurant and grocery sectors. The application provides functionalities to manage company data, calculate financial metrics, and generate useful reports for decision-making.

## Features

- **Company management**: Create, edit, list, and delete companies.
- **Financial metrics calculation**: Calculates expenses, revenues, and profitability of companies.
- **KPI identification**: Identifies the most profitable companies, those with the lowest expenses, and those with the highest revenues.
- **Customer capacity management**: Displays companies with the highest daily customer capacity.
- **User-friendly graphical interface**: Developed in Java with object-oriented programming principles.

## Project Structure

The application is structured with a hierarchy of classes that represent different types of businesses in the StarThrive portfolio:

- **Company**: Base class to represent a company.
- **RestaurantBusiness**: Class for restaurant sector businesses.
- **GroceryStore**: Class for grocery stores.
- **Cafe, Bakery, FastFoodRestaurant, LocalRestaurant**: Specialized classes for different types of restaurants and establishments.
  
Data management and operations are centralized in the **StarThriveManager** class, responsible for handling and organizing company data.

## Installation Requirements

1. **Install IntelliJ IDEA**:
   - Download and install IntelliJ IDEA [here](https://www.jetbrains.com/idea/download/).
   
2. **Download the project files**:
   - Download the project files from the repository.

3. **Project Setup in IntelliJ**:
   - **Important**: Ensure you are inside the second `StarThrive-Manager-POO-main` folder (the nested folder) when opening the project in IntelliJ IDEA. Opening the outer folder may cause issues with project structure recognition.
   - Open IntelliJ IDEA and import the project from the nested folder where the files are stored.
   - Ensure the project's SDK is set to the correct Java version (Java 11 or Java 17).

4. **Build and Run**:
   - Build the project (Ctrl+F9).
   - **Important**: The `main` class is located in the `src` folder.
   - Run the main class from IntelliJ IDEA.

## Available Operations

### 1. Create a new company
Create new companies with different types and validate the input data.

### 2. List companies
View all registered companies in a detailed table.

### 3. Edit a company
Select companies to edit their data, with validation of the changes.

### 4. Delete a company
Delete selected companies.

### 5. List the most profitable companies
View the most profitable companies, those with the lowest expenses, and the highest revenues.

### 6. List companies with the highest customer capacity
Display the two companies with the highest daily customer capacity.

## License

This project is licensed under the terms of the MIT license. See the `LICENSE` file for more information.
