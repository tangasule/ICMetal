<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Contact Us</title>
<link href="static/css/Style/tpl.css" rel="stylesheet" type="text/css" />
<link href="static/css/Style/contactus.css" rel="stylesheet" type="text/css" />
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
    <h1>Contact us</h1>
  
  <form id="form1" name="form1" action="/contactMail" method="GET">
    <label>
      <input name="name" type="text" id="name" value="Your name" />
      <input name="email" type="text" id="email" value="Your email" />
      <input name="subject" type="text" id="subject" value="Subject" />
      <textarea name="message" id="message" scrolling="0">Your message</textarea>
      <input type="submit" name="send" id="send" value="send" />
    </label>
  </form>
  </div>
  <div class="frame3">
    <h1>Our Location<iframe src="http://www.google.cn/maps/embed?pb=!1m18!1m12!1m3!1d2483.78571559326!2d-0.17706588423032252!3d51.49879967963366!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x48760567da220a01%3A0x31911b371c692e86!2sImperial+College!5e0!3m2!1szh-CN!2scn!4v1455765009563" width="360" height="300" frameborder="0" style="border:0" allowfullscreen scrolling="no"></iframe></h1>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <p>&nbsp;</p>
    <p><br />
      South Kensington Campus<br />
      London SW7 2AZ, UK<br />
      tel: +44 (0)20 7589 5111<br />
      Email: Liliang.wang@imperial.ac.uk    </p>
  </div>
  </div>
</body>
</html>
