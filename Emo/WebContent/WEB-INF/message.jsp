<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Ekande Martin Onyangonga</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/4.5/examples/cover/">

    <!-- Bootstrap core CSS -->
	<link href="inc/bootstrap-4.5.0-dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Custom styles for this template -->
    <link href="inc/bootstrap-4.5.0-dist/css/cover.css" rel="stylesheet">
  </head>
  <body class="text-center">
    <div class="cover-container d-flex w-100 h-100 p-3 mx-auto flex-column">
	  
	  <c:import url="/inc/menu.jsp"/>
	
	  <main role="main" class="inner cover">
		<form method="post" action="<c:url value="/livredore"/>" >
			 <div class="row">
			 	<div class="col-md-6 col-sm-12 col-xs-12">
				  <div class="form-group">
				    <input type="text" class="form-control form-control-md" name="noms" id="exampleFormControlInput1" placeholder="Prenom Nom ">
				  	<span class="text-danger">${ form.erreurs['noms'] }</span>
				  </div>
				  </div>
				  <div class="col-md-6 col-sm-12 col-xs-12">
				  <div class="form-group">
				    <input type="text" class="form-control form-control-md" name="telephone" id="telephone" placeholder="telephone">
				    <span class="text-danger">${ form.erreurs['telephone'] }</span>
				  </div>
				  </div>
			  </div>
			  <div class="form-group">
			    <label class="text-danger" for="exampleFormControlTextarea1">Message</label>
			    <textarea class="form-control" name="messages" id="exampleFormControlTextarea1" rows="3"></textarea>
			    <span class="text-danger">${ form.erreurs['messages'] }</span>
			  </div>
			  <input type="submit" class="btn btn-secondary btn-lg" value="Envoyer" />
		</form>
		  </main>
		<c:import url="/inc/footer.jsp"/> 
	</div>
</body>
</html>