<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<style type="text/css"><%@ include file="bootstrap.min.css"%></style>
<link rel="icon" type="image/png" href="http://localhost:8080/Pilotes/AF.PNG" />
<title>Pilote liste</title>
</head>
<body style="background-color: light-grey;">
<nav class="navbar navbar-dark" style="background-color:black; border-bottom-style: solid; border-color:blue;">
  <a class="navbar-brand" href="/Pilotes/Accueil">
    <img src="http://localhost:8080/Pilotes/AF.PNG" width="50" height="100%" margin-top="5px" alt="">
    <img src="http://localhost:8080/Pilotes/fly2.png" width="80" height="30" margin-top="5px">
  </a>
</nav>
<div class="container-fuild">
<div class="row">
<div class="col-lg-3" style="padding-top:6px;">
<div style="background-color:black; border-radius:50px; text-align:center; color:white; margin-left:14px;"><h4>Menu</h4></div>
<div style="border-bottom-style:solid;border-bottom-color:blue;margin-left:14px;">
<h5><a href="/Pilotes/Accueil" style="color:black; padding-left:10px;">Accueil </a></h5>
<h5><a href="/Pilotes/NewVol" style="color:black; padding-left:10px;">Enregistrement vol</a></h5>
<h5><a href="/Pilotes/NewPilote" style="color:black; padding-left:10px;">Enregistrement pilotes</a></h5>
<h5><a href="/Pilotes/listevol" style="color:black; padding-left:10px;">Liste des Vols </a></h5>
<h5><a href="/Pilotes/listepilote" class="btn btn-link btn-lg disabled" role="button" aria-disabled="true" style="color:black; padding-left:10px;">Liste des Pilotes </a></h5>
<a href="" style="color:white;"> </a>
</div>
</div>
<div class="col-lg-6" style="background-color: black; border-bottom-right-radius: 25px; border-bottom-left-radius: 25px; border-style:solid;border-bottom-color:blue; border-left-color:blue; border-right-color:blue; ">
<h1 style="text-align:center; color:white;">Liste des pilotes:</h1>
<table class="table">
  <thead class="thead-dark">
    <tr>
      <th scope="col">idPilote</th>
      <th scope="col">Nom</th>
      <th scope="col">Prénom</th>
      <th scope="col">Téléphone</th>
      
    </tr>
  </thead>
  <tbody >
  <c:forEach items="${pilote}" var="pilote">
    <tr >
      <th scope="row" style="color:white;">${pilote.idPilote}</th>
      <td style="color:white;">${pilote.nom}</td>
      <td style="color:white;">${pilote.prenom}</td>
      <td style="color:white;">${pilote.tel}</td>
      
    </tr>
    </c:forEach>
  </tbody>
</table><br>

</div>
<div class="col-lg-3">
</div>
</div>
</div>
</body>
</html>