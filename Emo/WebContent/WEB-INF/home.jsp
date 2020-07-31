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
		 <p>${ form.resultat }</p>
	  <main role="main" class="inner cover">
	    <h1 class="cover-heading">Bienvenue a vous</h1>
	    <p class="lead">La communaute estudiantine a la profonde douleur se voir perdit l'un de baobab de la formation universitaire
	    en rdc, le pdg Martin ekanda onyangonga de l'institut superieur d'informatique programmation et analyse; c'est pour quoi nous avons 
	    mis en place cette plate-forme pour permatre a toutes la communaute de pres tout comme de loin de pouvoire envyez un message au du pdg</p>
	    <p class="lead">
	      <a href="<c:url value="/message"/>" class="btn btn-lg btn-secondary">Votre Message</a>
	    </p>
	  </main>
		<c:import url="/inc/footer.jsp"/> 
	</div>
</body>
</html>
