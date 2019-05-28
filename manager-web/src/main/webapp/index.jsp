<%@page    import="java.lang.*" language="java" contentType="text/html; utf-8" pageEncoding="utf-8" %>
<html>
<body>

    <div id="form-box">
        <form action="/user/addUser" method="post" >
            <input type="text" name="username" placeholder="用户名"/><br/>
            <input type="text" name="userage" placeholder="用户年龄" /><br/>
            <input type="submit" value="OK">
        </form>
    </div>


</body>
<style type="text/css">
    *{
        background-color: gainsboro;
        margin: 0;
        padding: 0;
    }
    #form-box{
        width: 400px;
        position: relative;
        top:100px;
        margin: auto;
    }

    #form-box input{
        padding: auto;
        margin-bottom: 30px;
        width: 300px;
        height: 30px;
        border-radius: 6%;
        color: black;
        border-color: whitesmoke;
        background-color: white;
    }

</style>
</html>
