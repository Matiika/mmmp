<html>
<head>
    <script src="starus//index.js"></script>
</head>
    <body>
        <h2>Main!</h2>
        <hr/>
        <!-- Nagation -->
        <a href="/">[GET] Go to Home.jsp</a>
        <p>Message from server (requestScope.serverMessage): ${requestScope.serverMessage}</p>
        <p>Message from server (requestScope.users): ${requestScope.users}</p>
        <p>Message from server (requestScope.users): ${requestScope.user[0]}</p>
        <p></p>
    </body>
</html>