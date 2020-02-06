function cate(cate) {
	$(".categori li").css("background-color","white");
	$(".categori a").css("color","black");
	$(".user-categori a").css("color","gray").css("font-weight","500");
	$("."+cate).css("background-color","black");
	$("."+cate+" a").css("color","#fff");
}

function uc(uc) {
	$(".user-categori a").css("color","gray").css("font-weight","500");
	if(uc=='new'){
		$(".uc1 a").css("color","black").css("font-weight","bold");
	}else if(uc=='popular'){
		$(".uc2 a").css("color","black").css("font-weight","bold");
	}else if(uc=='low'){
		$(".uc3 a").css("color","black").css("font-weight","bold");
	}
	else if(uc=='high'){
		$(".uc4 a").css("color","black").css("font-weight","bold");
	}
}
function boardwrite(id){
	if(id=="null"){
		alert('로그인 해주세요');
		location.href="login.do";
	}
	else{
		location.href="write.do"
	}
}
function nullcheck(){
	var id=$("#id").val();
	var pw=$("#pw").val();
	var pw2=$("#pw2").val();
	var name=$("#name").val();
	var email=$("#email").val();
	var address=$("#address").val();
	var phone=$("#phone").val();
	if(name==""){
		alert('이름를 입력해주세요');
	}else if(id==""){
		alert('아이디를 입력해주세요');
	}else if(pw==""){
		alert('비밀번호를 입력해주세요');
	}else if(pw2==""){
		alert('비밀번호 확인을 입력해주세요');
	}else if(address==""){
		alert('주소를 입력해주세요');
	}else if(email==""){
		alert('이메일을 입력해주세요');
	}else if(phone==""){
		alert('핸드폰번호를 입력해주세요');
	}
	if(id!=""&&pw!=""&&name!=""&&address!=""&&email!=""&&phone!=""){
		$(".join").submit();
	}
}
function login() {
	var id=$("#id").val();
	var pw=$("#pw").val();
	if(id==""){
		alert('아이디를 입력해주세요');
	}else if(pw==""){
		alert('패스워드를 입력해주세요');
	}
	if(id!=""&&pw!=""){
		$("#login").submit();
	}
}

function board_delete(id,id2,num){
	if(id==id2){
		alert('삭제되었습니다')
		location.href="boardDelete.do?no="+num;
	}
	else{
		alert('권한이 없습니다!!');
	}
}