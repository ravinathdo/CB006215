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
                        <li><a href="LogoutServlet">Logout</a></li>
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

                    <h1>Disney California</h1>

                    <hr>

                    <div class="row">
                        <div class="col-md-4">
                            <img src="images/515DRam0fLL._SL1100_.jpg" alt=""/>
                        </div>
                        <div class="col-md-8">

                            <h3>Summary</h3>
                            <table  class="table table-striped">
                                <tr>
                                    <th>Description</th>
                                    <th>Event</th>
                                    <th>Amount</th>
                                </tr>
                                <c:forEach items="${paymentList}" var="p">
                                    <tr>
                                        <td>${p.place}</td>
                                        <td>${p.event}</td>
                                        <td>${p.amount}</td>
                                    </tr>    
                                </c:forEach>
                            </table>


                            <button type="submit" class="btn btn-primary">Print</button>


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
            <p style="text-align: right">Grizzly Peak | Hollywood Land | Pacific Wharf |  Pacific Wharf | Paradise Pier</p>
        </footer>


        <script>
            JsBarcode("#barcode", "${ticket.bcn}");
        </script>
    </body>
</html>
