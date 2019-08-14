<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta name="viewport" content="width=device-width, initial-scale=1">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Search or discover your movies</title>
<link rel="stylesheet" type="text/css" href="index.css" media="screen" />
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<form action="FrontController">
             <div class="wrap"> 
                    <div class="search">
                       
                       <input type="text" class="searchTerm" name="searchterm" placeholder="Movie Title, Actor....">
                       <button type="submit" class="searchButton">
                         <i class="fa fa-search"></i>
                      </button>
                    </div>
                    <nav>
                            <ul>
                                <li><a href="#">Home</a></li>
                                <li><a href="#">Trending Movies List</a></li>
                                <li><a href="#">Latest Movies List</a></li>
                                <li><a href="#">Favorites</a></li>

                            </ul>
                    </nav>
                 </div> 
            </form>
</body>


