/**
 * 
 */
function cate(cate) {
	$(".categori li").css("background-color","white");
	$(".categori a").css("color","black");
	$(".user-categori a").css("color","gray").css("font-weight","500");
	if(cate=='left'){
		$(".cate-left").css("background-color","black");
		$(".cate-left a").css("color","#fff");
	}else if(cate=='mid'){
		$(".cate-mid").css("background-color","black");
		$(".cate-mid a").css("color","#fff");
	}else if(cate=='right'){
		$(".cate-right").css("background-color","black");
		$(".cate-right a").css("color","#fff");
	}
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