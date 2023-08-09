<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>打工換宿趣 - 小幫手登入</title>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
    <link rel="stylesheet" href="assets/css/main.css" />
   <style>
    /* Center the form vertically and horizontally */
    #banner {
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh; /* Adjust this value for desired vertical alignment */
    }

    /* Adjust the width of the input fields */
    #account, #password {
        width: 450px; /* Change this value as needed */
    }
</style>

    <noscript><link rel="stylesheet" href="assets/css/noscript.css" /></noscript>
</head>
<body class="landing is-preload">
    <div id="page-wrapper">
        <!-- Header -->
					<header id="header" class="alt">
						<h1><a href="homePage">打工換宿趣</a></h1>
						<nav id="nav">
							<ul>
								<li class="special">
									<a href="#menu" class="menuToggle"><span>選單</span></a>
									<div id="menu">
										<ul>
											<li><a href="homePage">首頁</a></li>
											<li><a href="what">簡介＆公告</a></li>
											<li><a href="helperLogin">小幫手登入</a></li>
											<li><a href="storeLogin">店家登入</a></li>
											<li><a href="postJob">查看換宿店家</a></li>
											<li><a href="share">分享經驗</a></li>
											<li><a href="helperSignUp">註冊成為小幫手</a></li>
											<li><a href="storeSignUp">註冊成為店家</a></li>
											<li><a href="contactUs">客服</a></li>
										</ul>
									</div>
								</li>
							</ul>
						</nav>
					</header>
        <section id="banner">
            <div class="inner">
                <h2>打工換宿趣 - 小幫手登入</h2>
                <!-- Login Form -->
                <form action="helperAccount" method="post">
                   
                    <input type="text" id="account" name="account" placeholder="帳號" required><br>

                    
                    <input type="password" id="password" name="password" placeholder="密碼" required><br>

                    <input type="submit" value="登入" style="font-size: 14px;">
                </form>
                
                <p><a href="forgetPassword">忘記密碼？</a></p>
                <br>
                <p><a href="helperSignUp">加入成為小幫手</a></p>
            </div>
        </section>
        <!-- ... Rest of the content ... -->
        <footer id="footer">
            <!-- ... Footer content ... -->
        </footer>
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/js/jquery.scrollex.min.js"></script>
    <script src="assets/js/jquery.scrolly.min.js"></script>
    <script src="assets/js/browser.min.js"></script>
    <script src="assets/js/breakpoints.min.js"></script>
    <script src="assets/js/util.js"></script>
    <script src="assets/js/main.js"></script>
</body>
</html>
