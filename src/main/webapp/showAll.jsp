<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Fredoka+One|Caveat+Brush">
    <title>ChemInFood - all additives</title>
    <style>
        main {
            background-color: #e6e6e6;
        }
        .jumbotron {
            font-family: 'Fredoka One', cursive;
            font-size: 1.5em;
        }
        table {
            font-family: 'Caveat Brush', cursive;
            font-size: 1.3em;
            width: 80%;
        }
    </style>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<main>
    <div class="container-fluid">
        <div class="jumbotron text-center">
            <h2>List of chemical food additives</h2>
            <h3>According to Bill Statham's <p style="font-style: italic">What's really in your basket</p></h3><br>
            <a href="index.jsp"><button type="button" class="btn-success btn-lg">Back</button></a>
        </div>
        <div class="table-responsive">
            <table class="table">
                <tr>
                    <th>E-XXX</th>
                    <th>Name (eng)</th>
                    <th>Name (pl)</th>
                    <th>CAS number</th>
                    <th>Harmfulness</th>
                </tr>
                <tr class="success">
                    <td>E100</td>
                    <td>Test Test</td>
                    <td>Test Test</td>
                    <td>999-99-9</td>
                    <td>Test Test</td>
                </tr>
                <c:forEach var="additive" items="${sessionScope.additives}">
                <c:choose>
                    <c:when test="${additive.getHarmfulness() eq 'harmless'}">
                        <tr class="success">
                    </c:when>
                    <c:when test="${additive.getHarmfulness() eq 'dangerous'}">
                        <tr class="danger">
                    </c:when>
                    <c:when test="${additive.getHarmfulness() eq 'suspicious'}">
                        <tr class="warning">
                    </c:when>
                    <c:when test="${additive.getHarmfulness() eq 'use caution'}">
                        <tr class="info">
                    </c:when>
                </c:choose>
                    <td>${additive.getNumberE()}</td>
                    <td>${additive.getNameEng()}</td>
                    <td>${additive.getNamePol()}</td>
                    <td>${additive.getNumberCAS()}</td>
                    <td>${additive.getHarmfulness()}</td>
                </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</main>
</body>
</html>