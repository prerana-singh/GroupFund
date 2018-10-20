<%-- 
    Document   : custo
    Created on : 18 Oct, 2018, 4:45:51 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head><title>CUSTOMER</title>
<style>
header {
    
    background:#ffee58;
    -webkit-background-size: cover;
    -moz-background-size: cover;
    -o-background-size: cover;
    background-size: cover;
    -webkit-text-stroke: 1px #ffee58 ;
    
    padding:10px;
}

scroll{
    background:#1565c0 ;
    width:500px;
    color:#fff59d;
}

nav {
    line-height:30px;
    height:300px;
    width:1323px;
    background-color:#fff59d ;
    align-content: center;
    text-align:justify;
    padding:5px 5px;
}
section {
    width:1313px;
    height:100vh;
    text-align:justify;
    float:left;
    background-color:#fff59d ;
    padding:10px;
}
footer {
    background-color:black;
    color:white;
    clear:both;
    text-align:center;
    padding:5px;
}
</style>
 <script type="text/javascript">
               
                function validate()
                {
        var data = document.getElementById("tic").value;            
        var req;
                    var url = "ticket?name="+encodeURIComponent(data);
                    if(window.XMLHttpRequest)
                    {
                        req = new XMLHttpRequest();
                    }
                    else if(window.ActiveXObject)
                    {
                        req = new ActiveXObject("Microsoft.XMLHttp");
                    }
                    else
                    {
                        alert('Javascript not supported');
                    }
                    req.open("GET",url,true);
                    req.send();
                    req.onreadystatechange = callback;
                    function callback()
                    {
                        if(req.readyState==4 && req.status==200)
                        {
                            alert("Your Tocken Number is "+req.responseText);
                        }
                    }
                }
            </script>
</head>
<body>
    
<header style="padding-top:5px;">
<span style="padding-left:0px;"><img src="icon.jpg" height="110" width="110"/>
<span style="position:absolute;padding-left:400px;padding-top:30px;">
<font face="impact" size=20px color="#2243B6">GROUPFUND BANK</font>
</span>
    
</header>

<scroll style="position:relative;padding-top:15px;">
<marquee>GROUPFUND UNCONSOLIDATED FINANCIAL RESULTS-14/06/2018.
</marquee>
</scroll>


<nav>
<br> <br><br>
<center>
<div style="width:50%;font-size:20px;">
    
The customer can book a ticket, which is generated and 
printed by using an attached printer.
The customer can avail the ticket and proceed to the waiting lounge. 
This ticket number will appear on the central display.  
<h2>Generate Ticket</h2>
    <select id="tic" name="select" style="font-size:30px" required="required" onchange="validate()">
            <option value="deposit">Deposit</option>
            <option value="withdraw">Withdraw</option>
            <option value="passbook">Passbook</option>
            <option value="loan">Loan & FD</option>
            <option value="debit_credit_card">Debit & Credit Card</option>
            <option value="rtgs_neft">RTGS NEFT</option>
            
            
        </select>
</div>
</center>
</nav>

<section>
<font size=4px color=#1565c0 >
<h1>Important Notices:</h1><br>
</font>
<font size=4px >
<p> 
1) We would like to inform you that the Branch working timings for select branches have been revised with effect from June 15, 2018. 

<br> <br>
2) Please note, with effect from December 1, 2018, there is a change in schedule of non-maintenance of Monthly Average Balance charges applicable for Savings Accounts variants.
 
<p> 
Safe Banking:<br>
 GROUP FUND Bank will never send you e-mails or call you asking for confidential details of your account/ PIN/ Password/OTP/URN or personal details such as date of birth, mother's maiden name etc.
Beware of anyone asking you for such information on behalf of the bank through e-mails or phone calls. 
Please do not provide your bank account details to emails offering a job or claiming that you have won a lottery or open attachment of mails from unknown email id. 
While it is our endeavour to provide you with the best of online services and facilities, the Bank is not responsible for any erroneous transactions made by you. 
The Bank shall also not be responsible for misuse of your account arising from any wrong, inadvertent or other kind of disclosure of such details by you.
 <p>
Safe Online Banking portal provides convenient personal banking services that can be availed at the comfort of your home or office.
Want to learn about basics of online banking? Visit our Safe Online Banking Knowledge Centre.
 </p>
</font>
</section>

<footer>
Copyright GroupFund.com
</footer>

</body>
</html>

