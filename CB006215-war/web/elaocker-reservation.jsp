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
        
        <style>
            .marquee {
  position: relative;
  animation: marquee 10s linear infinite;
  text-align:center;
  color:#ffffff;
}
@keyframes marquee {
  0% {
    top: 20em
  }
  100% {
    top: -2em
  }
}
        </style>
        
        <script>
            
            function setAmount(amu){
                document.getElementById('amount').value = amu;
            }
        </script>
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
                    <h1>E-Locker</h1>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                    <hr>

                    <div class="row">
                        <div class="col-md-6">
${msg}
                            <form action="LockerReservationServlet" method="post">
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Locker Type</label>
                                    
                                        SMALL  <input type="radio" name="type"  value="SMALL" required="" onclick="setAmount(150)"/>  
                                        LARGE  <input type="radio" name="type"  value="LARGE" required="" onclick="setAmount(300)"/>  
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1">Amount</label>
                                    <input required="" readonly="" name="amount" id="amount" type="text" class="form-control" id="exampleInputPassword1" placeholder="">
                                </div>
                                <button type="submit" class="btn btn-primary">Reserve</button>
                            </form>

                        </div>
                        <div class="col-md-6">


                            <table class="table table-bordered">
                                <tr>
                                    <th>Locker Type</th>
                                    <!--<th></th>-->
                                    <th></th>
                                </tr>
                                <c:forEach items="${lockerList}" var="t" >
                                <tr>
                                    <td>${t.lockertype}</td>
                                    <!--<td>Cancel</td>-->
                                    <td>
                                        <form action="LockerReuseServlet" method="post">
                                            <div class="form-group">
                                                <input type="hidden" name="custlockerid" value="${t.id}" />
                                                <input type="hidden" name="BCN" />
                                                <label for="exampleInputPassword1">Amount</label>
                                                <input type="text" name="amount" class="form-control" id="exampleInputPassword1" placeholder="" value="${t.amount}">
                                            </div>
                                            <button type="submit" class="btn btn-primary">Re Use</button>
                                        </form>


                                    </td>
                                </tr>
                                
                                </c:forEach>
                            </table>

                        </div>  
                    </div>



                </div>
                <div class="col-sm-2 sidenav">
                    <h3 class="marquee">New Attractions</h3>
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


        <script>
            JsBarcode("#barcode", "${ticket.bcn}");
        </script>
    </body>
</html>
