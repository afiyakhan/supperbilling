<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">

function getCountry()
{
	var req=new XMLHttpRequest();
	req.open("GET","getcountry",true)
	req.send();
	
	var country=document.getElementById("country");
	req.onreadystatechange=function()
	{
		alert(req.readyState);
		if(req.readyState==4&& req.status==200)
			{
			
			alert(req.responseText);
			var countryList=JSON.parse(req.responseText);
			for(var i=0;i<countryList.length;i++){
				var op=document.createElement("option");
				
				op.text=countryList[i].cname;
				op.value=countryList[i].cid;
				country.add(op);
			}
			}
	}
	
	}
	
function getState(){
	var cid=document.getElementById("country").value;
	alert(cid);
	
	
	var req=new XMLHttpRequest();
	req.open("GET","getstate?cid="+cid,true)
	req.send();
	
	var state=document.getElementById("state");
	req.onreadystatechange=function()
	{
		if(req.readyState==4 && req.status==200)
			{
			
			var stateList=JSON.parse(req.responseText);
			for(var i=0;i<stateList.length;i++){
				var op=document.createElement("option");
				
				op.text=stateList[i].sname;
				op.value=stateList[i].sid;
				state.add(op);
			}
			
			}
			}
}


function getCity(){
	var sid=document.getElementById("state").value;
	alert(sid);
	
	
	var req=new XMLHttpRequest();
	req.open("GET","getcity?sid="+sid,true)
	req.send();
	
	var city=document.getElementById("city");
	req.onreadystatechange=function()
	{
		alert(req.readyState);

		if(req.readyState==4 && req.status==200)
			{
			
			alert(req.responseText);

			var cityList=JSON.parse(req.responseText);
			for(var i=0;i<cityList.length;i++){
				var op=document.createElement("option");
				
				op.text=cityList[i].cityname;
				op.value=cityList[i].cityid;
				city.add(op);
			}
			
			}

	}
}






</script>
</head>
<body>
<body onload="getCountry()">          
Country:<select id="country"  onchange="getState()">





</select>
State:<select id="state" onchange="getCity()">
</select>
City:<select id="city">
</body>
</html>