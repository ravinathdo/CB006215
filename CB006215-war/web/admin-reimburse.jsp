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
                </div>
                <div class="col-sm-8 text-left"> 
                    <h1>Disney California</h1>
                    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.</p>
                    <hr>
                    <div class="row">
                        <div class="col-md-6" >
                            <form class="form-inline" action="LoadReimburseServlet" method="post">
                                <div class="form-group">
                                    <label class="sr-only" for="exampleInputAmount">Barcode</label>
                                    <div class="input-group">
                                        <div class="input-group-addon">BCN</div>
                                        <input type="text" name="bcn" class="form-control" id="BCN" placeholder="Barcode">
                                    </div>
                                </div>
                                <button type="submit" class="btn btn-primary">Find</button>
                            </form>
                        </div>

                        <div class="col-md-6">
                            ${msg}
                            <c:if test="${ticket != null}"> 
                                <form class="form-horizontal" action="ReimburseServlet" method="post">
                                    <input type="hidden" name="tid" value="${ticket.id}" />
                                    <div class="form-group">
                                        <label for="inputEmail3" class="col-sm-2 control-label">BCN</label>
                                        <div class="col-sm-10">
                                            <svg id="barcode"></svg>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <input type="hidden" name="amount" value="${ticket.balance}" />
                                        <label for="inputPassword3" class="col-sm-2 control-label">Amount</label>
                                        <div class="col-sm-10">
                                            <h2> ${ticket.balance} </h2>
                                        </div>
                                    </div>
                                    <c:if test="${ticket.status != 'CLOSE'}"> 
                                        <div class="form-group">
                                            <div class="col-sm-offset-2 col-sm-10">
                                                <button type="submit" class="btn btn-primary">Reimburse and Close</button>
                                            </div>
                                        </div>
                                    </c:if>
                                </form>
                            </c:if>

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


        <script>
            JsBarcode("#barcode", "${ticket.bcn}");



            function printContent(el) {
                var restorepage = $('body').html();
                var printcontent = $('#' + el).clone();
                var enteredtext = $('#text').val();
                $('body').empty().html(printcontent);
                window.print();
                $('body').html(restorepage);
                $('#text').html(enteredtext);
            }
        </script>

    </body>
</html>
