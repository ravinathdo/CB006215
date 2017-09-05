<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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


        <script>

            function setAmount(amu) {
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
                        <%@include file="admin-menu.jsp" %>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="LoginServlet"> Logout </a></li>
                    </ul>
                </div>
            </div>
        </nav>

        <div class="container-fluid text-center">    
            <div class="row content">
                <div class="col-sm-2 sidenav">
                    <p><a href="LoadTicketListServlet">Ticket List</a></p>
                </div>
                <div class="col-sm-8 text-left"> 
                    <h1>Disney California</h1>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                    <hr>

                    <div class="row">

                        <div class="col-md-12">
                            <table class="table table-bordered">
                                <tr>
                                    <th>BCN</th>
                                    <th>Customer</th>
                                    <th>Ticket Type</th>
                                    <th>Amount</th>
                                    <th>Status</th>
                                    <th>Balance</th>
                                    <th>Issue Date</th>
                                    <th>Reimburse</th>
                                </tr>
                                <c:forEach items="${ticketsList}" var="t">
                                    <tr>
                                        <td>${t.bcn}</td>
                                        <td>${t.fname} ${t.lname}</td>
                                        <td>${t.tictype}</td>
                                        <td>${t.amount}</td>
                                        <td>${t.status}</td>
                                        <td>${t.balance}</td>
                                        <td>${t.timecreated}</td>
                                        <td>${t.reimburse}</td>
                                    </tr>
                                </c:forEach>
                            </table>    
                        </div>
                    </div>

                </div>


                <p></p>
            </div>
            <div class="col-sm-2 sidenav">
               
            </div>
        </div>
    </div>

    <footer class="container-fluid text-center">
        <p>Footer Text</p>
    </footer>

</body>
</html>
