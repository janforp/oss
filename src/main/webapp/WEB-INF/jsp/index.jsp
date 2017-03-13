<%@ page language="java" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>测试上传</title>
    </head>
    <body>
        <form method="POST" enctype="multipart/form-data" action="/upload/upload">
            File to upload: <input type="file" name="file">
            <br />
            <input type="submit" value="Upload">

            Press here to upload the file!
        </form>
    </body>
</html>