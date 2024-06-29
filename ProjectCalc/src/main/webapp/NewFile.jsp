<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CalculatorProject</title>
<link rel='stylesheet' href='css/bootstrap.css'>
</head>
<body class="bg-light">
<header class="bg-primary text-center text-white">
<h1>Calculator_Project</h1>
</header>
<br><br><br><br><br><br><br> 
<div class='container'>
<form action="calcservelet" method="post" align="center" class="border p-3 mx-auto rounded bg-white" style="width: 50%;">

 <div class="form-group">
                <label for="fno">Enter the 1st number:</label>
                <input type="number" name="fno" class="form-control" required>
            </div>

            <div class="form-group">
                <label for="sno">Enter the 2nd Number:</label>
                <input type="number" name="sno" class="form-control" required>
            </div>
 <div class="form-group">
                <label for="options">Choose a mathematical symbol:</label>
                <select name="option" id="options" class="form-control">
                    <option value="chose one">Choose one</option>
                    <option value="addition(+)">+</option>
                    <option value="-_(subtract)">-</option>
                    <option value="*_(multiplication)">*</option>
                    <option value="/_(divison)">/</option>
                </select>
            </div>

            <button type="submit" class="btn btn-primary">Calculate</button>
            </form>
            </div>
            <br><br><br><br><br><br><br><br><br>
            <footer class="bg-dark text-white text-center">
             <p>&copy; 2024 Calculator Project</p>
            </footer>
</body>
</html>