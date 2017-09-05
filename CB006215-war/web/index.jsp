<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
    <head>
        <title>Bootstrap Example</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <link href="css/mystyle.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>

        <nav class="navbar navbar-inverse">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>                        
                    </button>
                    <a class="navbar-brand" href="#">DISNEY</a>
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav">
<!--                        <li class="active"><a href="#">Home</a></li>
                        <li><a href="#"> Grizzly Peak</a></li>
                        <li><a href="#"> Hollywood Land</a></li>
                        <li><a href="#"> Pacific Wharf</a></li>
                        <li><a href="#"> Paradise Pier</a></li>-->
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="LoadAdminLoginServlet">Admin Login</a></li>
                    </ul>
                </div>
            </div>
        </nav>

        <div class="container-fluid text-center">    
            <div class="row content">
                <div class="col-sm-2 sidenav">
<!--                    <p><a href="#">Top up</a></p>
                    <p><a href="#">Link</a></p>
                    <p><a href="#">Link</a></p>-->
                </div>
                <div class="col-sm-8 text-left"> 
                    <h1>Disney California</h1>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                    <hr>

                    <div class="row">
                        <div class="col-md-6">
                            <img src="images/515DRam0fLL._SL1100_.jpg" alt=""/>
                        </div>
                        <div class="col-md-6">
                            ${msg}
                            <form class="form-inline" action="TicketLoginServlet" method="post">
                                <div class="form-group">
                                    <label class="sr-only" for="exampleInputAmount">Barcode</label>
                                    <div class="input-group">
                                        <div class="input-group-addon">BCN</div>
                                        <input name="bcn" type="text" class="form-control" id="BCN" placeholder="Barcode">
                                    </div>
                                </div>
                                <button type="submit" class="btn btn-primary">Check Balance</button>
                            </form>

                        </div>  
                    </div>


                </div>
                <div class="col-sm-2 sidenav">
                    <div class="well">
                        <p>ADS</p>
                    </div>
                    <div class="well">
                        <p>ADS</p>
                    </div>
                </div>
            </div>
        </div>

        <footer class="container-fluid text-center">
            <p>Footer Text</p>
        </footer>

    </body>
</html>
