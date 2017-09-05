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

                        <div class="col-md-5">
                            <img src="images/515DRam0fLL._SL1100_.jpg" alt=""/>
                        </div>
                        <div class="col-md-7">


                            <form class="form-horizontal" action="TicketIssueServlet" method="post">
                                <div class="form-group">
                                    <label for="inputEmail3" class="col-sm-4 control-label">First Name</label>
                                    <div class="col-sm-8">
                                        <input type="text" name="fname" class="form-control" id="inputEmail3" placeholder="First Name">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="inputPassword3" class="col-sm-4 control-label">Last Name</label>
                                    <div class="col-sm-8">
                                        <input type="text" name="lname" class="form-control" id="inputPassword3" placeholder="Last Name">
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label for="inputPassword3" class="col-sm-4 control-label"></label>
                                    <div class="col-sm-8">
                                        Child  <input type="radio" name="type"  value="CHILD" required="" onclick="setAmount(2500)"/>  
                                        Adult  <input type="radio" name="type"  value="ADULT" required="" onclick="setAmount(5000)"/>  
                                    </div>
                                </div>


                                <div class="form-group">
                                    <label for="inputPassword3" class="col-sm-4 control-label">Amount</label>
                                    <div class="col-sm-8">
                                        <input type="text" name="amount" id="amount" readonly="" class="form-control" id="inputPassword3" placeholder="Select The Ticket Type">
                                    </div>
                                </div>

                                <div class="form-group">
                                     <label for="inputPassword3" class="col-sm-4 control-label"></label>
                                    <div class="col-sm-offset-2 col-sm-8">
                                        <button type="submit" class="btn btn-primary">Issue</button>
                                    </div>
                                </div>
                            </form>




                        </div>  
                    </div>


                    <p></p>
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
