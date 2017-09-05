<!DOCTYPE html>
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
        <script src="js/JsBarcode.all.min.js" type="text/javascript"></script>
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
                    <a class="navbar-brand" href="#">Logo</a>
                </div>
                <div class="collapse navbar-collapse" id="myNavbar">
                    <ul class="nav navbar-nav">
                        <%@include file="customer-menu.jsp" %>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
                    </ul>
                </div>
            </div>
        </nav>

        <div class="container-fluid text-center">    
            <div class="row content">
                <div class="col-sm-2 sidenav">
                    <%@include file="customer-sidenav.jsp" %>
                </div>
                <div class="col-sm-8 text-left"> 

                    <h1>Extreme Park</h1>

                    <hr>

                    <div class="row">
                        <div class="col-md-4">
                            <img src="images/515DRam0fLL._SL1100_.jpg" alt=""/>
                        </div>

                        <div class="col-md-8">


                            <table class="table table-bordered">
                                <tr>
                                    <th>Event</th>
                                    <th>Amount</th>
                                    <th>Pay</th>
                                </tr>
                                <tr>
                                    <td>Magic Show</td>
                                    <td>Rs 15222</td>
                                    <td><a href="PayExtremeEventServlet">Pay</a></td>
                                </tr>
                            </table>

                        </div>  
                    </div>


                </div>
                <div class="col-sm-2 sidenav">
                    <div class="well">
                        <p>Animal Event <br><b>[Grizzly Peak]</b></p>
                        <p>2018-06-25 03:30 pm</p>
                    </div>
                    <div class="well">
                        <p>Pet Show <br><b>[Hollywood Land]</b></p>
                        <p>2018-06-25 03:30 pm</p>
                    </div>
                    <div class="well">
                        <p>Animal Event <br><b>[Grizzly Peak]</b></p>
                        <p>2018-06-25 03:30 pm</p>
                    </div>

                </div>
            </div>
        </div>

        <footer class="container-fluid text-center">
            <p>Footer Text</p>
        </footer>


        <script>
            JsBarcode("#barcode", "CB006215-1");
        </script>
    </body>
</html>
