var exp=/^[0-9]{3}-[0-9]{4}-[0-9]{4}$/ //정규식 eg)핸드폰 0-9까지 세자리
$(document).ready(function(){
	$("#sendBtn").click(function(){
		if($("#name").val()==""){
			alert("이름을 입력하세요.");
			$("#name").focus();
			return false;
		}
		if($("#userid").val()==""){
			alert("아이디를 입력하세요.");
			$("#userid").focus();
			return false;
		}
		if($("#pwd").val()==""){
			alert("비밀번호를 입력하세요.");
			$("#pwd").focus();
			return false;
		}
		if($("#pwd").val()!=$("#pwd_check").val()){
			alert("비밀번호가 일치하지 않습니다.")
			$("#pwd_check").focus();
			return false;
		}
		if($("#email").val()==""){
			alert("이메일을 입력하세요.");
			$("#email").focus();
			return false;
		}
/*		if(!$("#phone").val().match(exp)){
			alert("전화번호 양식이 아닙니다.");
			$("#phone").focus();
			return false;
		}*/
			if(!exp.test($("#phone").val())){
			alert("전화번호 양식이 아닙니다.");
			$("#phone").focus();
			return false;
		}
		$("#frm").submit();
	})	
	//아이디 입력창
	$("#idCheckBtn").click(function(){
		window.open("idCheck.jsp", "", "width=600 height=300");
	})
	
	//아이디 중복확인
	$("#idBtn").on("click", function(){
		if($("#userid").val()==""){
			alert("아이디를 입력하세요.");
			return;
		}
		$.ajax({
			type : "post",
			url : "idCheckPro.jsp",
			data : {"userid" : $("#userid").val()},
			success : function(resp){
				//alert((resp.trim()).length);
				if(resp.trim()=="yes"){
					alert("사용 가능한 아이디입니다.");
					$(opener.document).find("#userid").val($("#userid").val());
					self.close();
				}else{
					alert("사용 불가능한 아이디입니다.");
					$("#userid").val("");
					$("#userid").focus();
				}	
			},
			error : function(e){
				alert("error : " + e);
			}
		});//ajax
	})//idBtn

})//document

function del(userid, mode){
	//alert(userid);
	//관리자는 삭제할 수 없다는 메세지 출력
	if(mode=='관리자'){
		alert("관리자는 삭제할 수 없습니다.");
		return; //jsp에서 return은 종료의 의미
	}
	if(confirm("정말 삭제할까요?")){ //가져가야할 주소, 데이터, 결과값 
		$.getJSON("memberDeletePro.jsp", //***체크 중요
			{"userid" : userid},
			function(resp){
				var str = "";
				$.each(resp.jarr, function(key, val){
					str += "<tr>";
					str += "<td>" + val.name + "</td>"
					str += "<td>" + val.userid + "</td>"
					str += "<td>" + val.phone + "</td>"
					str += "<td>" + val.email + "</td>"
					str += "<td>" + val.admin + "</td>"
					str += "<td><a href=javascript:del('"+ val.userid +"','"+val.admin+"')>삭제11</a></td>"
					str +="</tr>"
				})//each
				$("table tbody").html(str);
				$("#countSpan").text(resp.countObj.count);
			}
		)//getJSON
			
	}//if
}//function del()