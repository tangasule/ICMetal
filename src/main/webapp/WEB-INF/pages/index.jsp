<%--
  Created by IntelliJ IDEA.
  User: tangshijun
  Date: 16/2/22
  Time: 上午1:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Page-Enter" content="Revealtrans(Duration=6,Transition=15)" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>IC Metal Forming Group</title>
    <link href="static/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <link href="static/css/Style/index.css" rel="stylesheet" type="text/css" />

</head>

<body>
<div id="frame">
    <div><div class="left"><h1>The Metal Forming Group</h1></div><div class="right"><button class="btn btn-primary" type="button">SIGN IN</button></div></div>
    <div class="frame1">
        <div class="tailor">
            <p><a href="#">Tailor</a><br />
                (Processing windows calculator)</p>
        </div>
        <div class="toolmaker">
            <p><a href="#">Tool-maker</a><br />
                (Processing windows calculator)</p>
        </div>
        <div class="frame1_pic1"></div>
    </div>
    <div class="frame2">
        <div class="pic1"></div>
        <div class="toolife">
            <p><a href="/toollife" target="new">Tool Life</a><br/>
                (Processing windows calculator)</p>
        </div>
        <div class="FLD">
            <p><a href="/formability" target="new">Formability</a><br />
                (Processing windows calculator)</p>
        </div>

    </div>
    <div class="frame3">
        <div class="technologies">
            <p><a href="#">Technologies</a></p>
        </div>
        <div class="pic1"></div>
        <div class="strategy">
            <p><a href="#">Strategy</a></p>
        </div>
    </div>
    <div class="frame4">
        <div class="pic1"></div>
        <div class="aboutus">
            <p><a href="aboutus/team.html">About Us</a></p>
        </div>
        <div class="contact">
            <p><a href="/contactus">Contact Us</a></p>

        </div>
    </div>
</div>


<div class="modal" id="mymodal">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
                <h4 class="modal-title">LOGIN IN</h4>
            </div>
            <div class="modal-body">
                <p> <input type="username" class="input-small" placeholder="Username"></p>
                <p> <input type="password" class="input-small" placeholder="Password"></p>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">CLOSE</button>
                <button type="button" class="btn btn-primary">OK</button>
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
</div><!-- /.modal -->

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
