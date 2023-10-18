<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Approve Owner</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<style>
    body {
        background-color: #f2f2f2;
    }
    .container {
        margin-top: 50px;
        max-width: 400px;
        background-color: #fff;
        border-radius: 10px;
        box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
        padding: 20px;
    }
    .form-group label {
        font-weight: bold;
    }
    .form-control {
        border-radius: 5px;
    }
    .btn-primary {
        background-color: #007bff;
        border: none;
        width: 100%;
    }
    .btn-primary:hover {
        background-color: #0056b3;
    }
    .form-title {
        text-align: center;
        font-size: 24px;
        margin-bottom: 20px;
        color: #333;
    }
</style>
</head>
<body>
    <div class="container">
        <div class="form-title">Approve Owner</div>
        <form action="approve" class="form" method="post">
            <div class="form-group">
                <label for="oId">Enter Owner ID:</label>
                <input id="oId" class="form-control"  type="number" name="oid" value="<%=request.getParameter("id") %>"/>
            </div>

            <div class="form-group">
                <label for="mId">Enter Manager ID:</label>
                <input id="mId" class="form-control"  type="number" name="mid"/>
            </div>

            <button type="submit" class="btn btn-primary">Approve</button>
        </form>
    </div>
</body>
</html>