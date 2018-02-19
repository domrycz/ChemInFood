<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Fredoka+One|Caveat+Brush">
    <title>Find additive</title>
    <style>
        main {
            background-color: #e6e6e6;
        }
        .jumbotron {
            font-family: 'Fredoka One', cursive;
            font-size: 1.5em;
        }
        .input-group {
            margin: 0 auto;
            font-size: 0.9em;
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
            <h4>Type the name of the additive</h4>
            <form method="post" action="ShowOne">
                <div class="form-group row">
                    <div class="radio input-group col-xs-3">
                        <label class="radio-inline"><input type="radio" name="language" value="eng" checked>English</label>
                        <label class="radio-inline"><input type="radio" name="language" value="pol">Polski</label>
                    </div><br>
                    <div class="input-group col-xs-3">
                        <span class="input-group-addon">Name</span>
                        <input type="text" class="form-control" name="name" placeholder="name / nazwa"><br>
                    </div><br>
                    <button type="submit" class="btn-info btn-lg">Search</button><br><br>
                </div>
            </form>
            <br>
            <a href="index.jsp"><button type="button" class="btn-success btn-lg">Back</button></a>
        </div>
    </div>
</main>
</body>
</html>

