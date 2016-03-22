<%--
  Created by IntelliJ IDEA.
  User: tangshijun
  Date: 16/2/26
  Time: 下午7:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>Formability</title>
    <link href="static/css/Style/tpl.css" rel="stylesheet" type="text/css" />
    <link href="static/css/Style/toollife.css" rel="stylesheet" type="text/css" />
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
        <h1>Tool life prediction </h1>

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
                    <td width="250">Calculate for</td>
                    <td><select name="calculate_object" id="calculate_object">
                        <option value="die" selected="selected">die</option>
                        <option value="punch">punch</option>
                        <option value="blankholder">blankholder</option>
                    </select></td>
                </tr>
                <tr>
                    <td width="250">No. of state</td>
                    <td><input type="text" name="state" id="state" /></td>
                </tr>
                <tr>
                    <td width="250">Total strain </td>
                    <td><input type="text" name="total_strain" id="total_strain" /></td>
                </tr>
                <tr>
                    <td width="250">Stamping speed</td>
                    <td><input type="text" name="speed" id="speed" /></td>
                </tr>
                <tr>
                    <td width="250">Friction coefficient</td>
                    <td><input type="text" name="cutoff_strain" id="cutoff_strain" /></td>
                </tr>
                <form action="/upload" method="post" enctype="multipart/form-data">
                <tr>
                    <td width="250">Upload  X, Y and Z value<br />
                        and contact pressure</td>
                    <td><input name="upload" type="file" id="upload" size="1" maxlength="5" />
                        <p><input type="submit" value="上 传"></p>
                    </td>
                </tr>

                </form>
            </table>
            <input type="submit" name="submit" id="submit" value="submit" />
        </form>
    </div>
    <form action="/uploadfile" method="post" enctype="multipart/form-data">
        <tr>
            <td width="250">Upload  X, Y and Z value<br />
                and contact pressure</td>
            <td><input name="upload" type="file" id="upload" size="1" maxlength="5" />
                <p><input type="submit" value="上 传"></p>
            </td>
        </tr>

    </form>
    <div class="frame3"></div>
</div>


<script src="http://libs.baidu.com/jquery/1.9.0/jquery.js"></script>
<script src="http://cdn.bootcss.com/bootstrap/2.3.1/js/bootstrap-transition.js"></script>
<script src="http://cdn.bootcss.com/bootstrap/2.3.1/js/bootstrap-modal.js"></script>
<script>
    $(function(){
        $(".btn").click(function(){
            $("#mymodal").modal("toggle");
        });
    });



</script>

</body>
</html>
