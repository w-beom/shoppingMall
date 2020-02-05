/**
 * 
 */
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