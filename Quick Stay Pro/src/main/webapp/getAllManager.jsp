<%@page import="com.jsp.dto.Manager"%>
<%@page import="com.jsp.service.ManagerService"%>
<%@page import="java.util.List"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Manager List</title>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f2f2f2;
        }
        .container {
            margin-top: 50px;
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
            padding: 20px;
        }
        .table {
            background-color: #fff;
        }
        .table th, .table td {
            border: none;
            vertical-align: middle;
        }
        .btn-danger {
            background-color: #ff3a5f;
            border: none;
        }
        .btn-danger:hover {
            background-color: #ff1e43;
        }
        .btn-primary {
            background-color: #007bff;
            border: none;
        }
        .btn-primary:hover {
            background-color: #0056b3;
        }
        h1 {
            font-size: 28px;
            color: #333;
        }
    </style>
</head>
<body>
    <div class="container">
  
        <h1>Manager List</h1>
        <% 
            ManagerService managerService = new ManagerService(); 
            List<Manager> manager = managerService.getAllManagerDetails(); 
        %>
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Phone Number</th>
                    <th>Status</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <% for (Manager m : manager) { %>
                    <tr>
                        <td><%= m.getId() %></td>
                        <td><%= m.getName() %></td>
                        <td><%= m.getEmail() %></td> 
                        <td><%= m.getPh_no() %></td> 
                        <td><%= m.getStatus() %></td>
                        <td>
                            <a href="authorisedManager.jsp?id=<%= m.getId() %>" class="btn btn-danger btn-sm">Authorised</a>
                            <a href="rejectManager.jsp?id=<%= m.getId() %>" class="btn btn-primary btn-sm">Reject</a>
                        </td>                     
                    </tr>
                <% } %>
            </tbody>
        </table> 
    </div>
</body>
</html>