<%--
  Created by IntelliJ IDEA.
  User: tangshijun
  Date: 16/2/26
  Time: 下午7:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Formability</title>
    <link href="static/css/Style/tpl.css" rel="stylesheet" type="text/css" />
    <link href="static/css/Style/formability.css" rel="stylesheet" type="text/css" />
</head>

<body>
<div id="frame">
    <h1>The Metal Forming Group</h1>
    <div class="frame1">
        <div class="contact_pic">
            <div class="pic">
                <div class="goback">
                    <p><a href="index.html">Go Back</a></p>
                </div>
            </div>
        </div>
    </div>
    <div class="frame2">
        <h1>Formability function</h1>

        <form action="" method="post" enctype="multipart/form-data" name="form1" id="form1">
            <table width="85%" border="0" cellspacing="0" cellpadding="0">
                <tr>
                    <td width="250">Select the material</td>
                    <td><select name="material" id="material">
                        <option value="AA5754">AA5754</option>
                        <option value="AA6082" selected="selected">AA6082</option>
                        <option value="AA7075">AA7075</option>
                    </select></td>
                </tr>
                <tr>
                    <td width="250">No. of state</td>
                    <td><input type="text" name="state" id="state" /></td>
                </tr>
                <tr>
                    <td width="250">Total strain</td>
                    <td><input type="text" name="total_strain" id="total_strain" /></td>
                </tr>
                <tr>
                    <td width="250">Stamping speed</td>
                    <td><input type="text" name="speed" id="speed" /></td>
                </tr>
                <tr>
                    <td width="250">Cut-off strain</td>
                    <td><input type="text" name="cutoff_strain" id="cutoff_strain" /></td>
                </tr>
                <tr>
                    <td width="250">Upload major strain, minor strain and temperature</td>


                    <td><label for="test">
                        <input id="test" type="file" style="display: none"/>
                        test
                    </label></td>

                </tr>
            </table>
            <input type="submit" name="submit" id="submit" value="submit" />
        </form>
    </div>
    <div class="frame3"></div>

</div>
</body>
</html>
