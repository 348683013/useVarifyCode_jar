<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>login</title>
    <script src="/js/ajaxUtils.js"></script>
    <script>
        function _change() {
            document.getElementById("img").src = "/VerifyCodeServlet?a=" + new Date().getTime();
        }
    </script>
</head>
<body>
<img src="/VerifyCodeServlet" id="img">
<a href="javascript:_change()">换一张</a>
</body>
</html>